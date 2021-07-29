package com.xyh.Controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileController {

    @RequestMapping("fileupload")
    public String fileup(MultipartFile file) throws IOException {
        //保存图片的路径
        String filepath="E:\\Springmvcupload";
        //获取原图片的拓展名
        String originalFilename = file.getOriginalFilename();
        //随机生成一个新的名字
        String newfilename = UUID.randomUUID() + originalFilename;
        //封装上传位置的全路径
        File targetfile = new File(filepath,newfilename);
        //把本地文件上传到封装上传文件位置的全路径
        file.transferTo(targetfile);

        return "file";
    }

    @RequestMapping("upload2")
    public String upload(@RequestParam(value = "file") MultipartFile file, Model model) throws IOException {

        String fileNmae=file.getOriginalFilename();
        String newname= UUID.randomUUID()+fileNmae;
        String path="E:\\Springmvcupload/";
        File file1=new File(path+newname);
        file.transferTo(file1);
        //文件的绝对路径
        String imgFile= file1.getAbsolutePath();
        String s = CarOCRByImg(imgFile);
        String host = "https://plateocr.market.alicloudapi.com";// 【1】请求地址 支持http 和 https 及 WEBSOCKET
        String path1 = "/vehiclelicense"; // 【2】后缀
        String appcode = "ff67789e02ca47e99739ad65c6c89f6e"; // 【3】开通服务后 买家中心-查看AppCode
        String urlSend = host + path1; // 【5】拼接请求链接
        File file2=new File(imgFile);
        byte[] content=new byte[(int)file2.length()];
        FileInputStream fileInputStream=new FileInputStream(file2);
        fileInputStream.read(content);
        fileInputStream.close();
        String imgBase64=s;
        try {
            URL url = new URL(urlSend);
            HttpURLConnection httpURLCon = (HttpURLConnection) url.openConnection();
            httpURLCon.setRequestMethod("POST");
            httpURLCon.setRequestProperty("Authorization", "APPCODE " + appcode);// 格式Authorization:APPCODE
            // (中间是英文空格)
            StringBuilder postData = new StringBuilder(imgBase64);

            byte[] postDataBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
            httpURLCon.setDoOutput(true);
            OutputStream out = httpURLCon.getOutputStream();
            out.write(postDataBytes);
            out.close();
            int httpCode = httpURLCon.getResponseCode();
            if (httpCode == 200) {
                String json = read(httpURLCon.getInputStream());
                System.out.println("正常请求计费(其他均不计费)");
                System.out.println("获取返回的json:");
                System.out.print(json);
            } else {
                Map<String, List<String>> map = httpURLCon.getHeaderFields();
                String error = map.get("X-Ca-Error-Message").get(0);
                if (httpCode == 400 && error.equals("Invalid AppCode")) {
                    System.out.println("AppCode错误 ");
                } else if (httpCode == 400 && error.equals("Invalid Url")) {
                    System.out.println("请求的 Method、Path 或者环境错误");
                } else if (httpCode == 400 && error.equals("Invalid Param Location")) {
                    System.out.println("参数错误");
                } else if (httpCode == 403 && error.equals("Unauthorized")) {
                    System.out.println("服务未被授权（或URL和Path不正确）");
                } else if (httpCode == 403 && error.equals("Quota Exhausted")) {
                    System.out.println("套餐包次数用完 ");
                } else {
                    System.out.println(httpCode);
                    System.out.println("参数名错误 或 其他错误");
                    System.out.println(error);
                }
            }

        } catch (MalformedURLException e) {
            System.out.println("URL格式错误");
        } catch (UnknownHostException e) {
            System.out.println("URL地址错误");
        } catch (Exception e) {
            // 打开注释查看详细报错异常信息
            // e.printStackTrace();
        }

        model.addAttribute("success","上传成功");
        return "index";
    }

    /*
     * 读取返回结果
     */
    private static String read(InputStream is) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null) {
            line = new String(line.getBytes(), "utf-8");
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }



    public static String CarOCRByImg(String abPath) throws IOException {

        File file = new File(abPath);
        byte[] carIMG = new byte[(int) file.length()];
        FileInputStream stream = new FileInputStream(file);
        stream.read(carIMG);
        stream.close();


        String imgBase64 = java.util.Base64.getEncoder().encodeToString(carIMG);

        Map<String, Object> config = new HashMap<>();
        config.put("multi_crop", "false");
        String configStr = JSONUtil.toJsonStr(config);

        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "APPCODE ");

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("image", imgBase64);
        String paramStr = JSONUtil.toJsonStr(paramMap);
        System.out.println(paramStr);
        String executeResult = HttpRequest.post("https://ocrcp.market.alicloudapi.com/rest/160601/ocr/ocr_vehicle_plate.json")
                .addHeaders(headers)
                .body(paramStr)
                .execute().body();
        return paramStr;
    }
}
