package com.xyh;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) throws IOException {
        //下面是本地图片转换Base64的方法
        String imagePath = "E:\\Springmvcupload/car.jpg";
        String s = CarOCRByImg(imagePath);
        System.out.println(s);
        String carNumber = getCarNumber(s);
        System.out.println(carNumber);

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
        String appcode="ff67789e02ca47e99739ad65c6c89f6e";
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "APPCODE " +appcode);

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("image", imgBase64);
        String paramStr = JSONUtil.toJsonStr(paramMap);
        System.out.println(paramStr);
        String executeResult = HttpRequest.post("https://ocrcp.market.alicloudapi.com/rest/160601/ocr/ocr_vehicle_plate.json")
                .addHeaders(headers)
                .body(paramStr)
                .execute().body();
        return executeResult;
    }

    public static String getCarNumber(String OCRResultJSONFormat){
        JsonRootBean jsonRootBean = JSONUtil.toBean(OCRResultJSONFormat,JsonRootBean.class);
        return jsonRootBean.getPlates().get(0).getTxt();
    }
}

