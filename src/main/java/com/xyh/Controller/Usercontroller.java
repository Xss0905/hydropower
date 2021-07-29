package com.xyh.Controller;

import com.xyh.Service.DetailedService;
import com.xyh.Service.NewsService;
import com.xyh.Service.UserService;
import com.xyh.domain.Detailed;
import com.xyh.domain.News;
import com.xyh.domain.User;
import com.xyh.domain.Userbuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Usercontroller {
    @Autowired
    private UserService userService;
    @Autowired
    private DetailedService detailedService;
    @Autowired
    private NewsService newsService;

    /*
     * @Author Xss
     * @Description  跳转到登录界面
     * @Date  2021/7/21
     * @Param
     * @return
     **/
    @RequestMapping("test")
    public String test() {
        return "login";
    }

    /*
     * @Author Xss
     * @Description  跳转到注册界面
     * @Date 18:02 2021/7/21
     * @Param
     * @return
     **/
    @RequestMapping("register")
    public String register() {
        return "register";
    }


    /*
     * @Author Xss
     * @Description  注册用户(添加用户)
     * @Date 18:02 2021/7/21
     * @Param
     * @return
     **/
    @RequestMapping("adduser")
    public String addUser(User user, Model model) {
        int adduser = userService.adduser(user);
        if (adduser > 0) {
            model.addAttribute("message", "注册成功");
            return "registersuccess";
        }
        return "register";
    }
    @RequestMapping("test2")
    public String test2(){
        return "blank";
    }

    /*
     * @Author Xss
     * @Description  用户登录
     * @Date 19:33 2021/7/21
     * @Param
     * @return
     **/
    @RequestMapping("login")
    public String login(User user, HttpSession session,Model model){
        User login = userService.login(user);
        if(login!=null){
            if(("admin").equals(login.getUsername())){
                session.setAttribute("flag","adm");//管理员身份登录
                User userinfo = userService.selbyname(user);
                Detailed selde = detailedService.selde();//查询明细
                model.addAttribute("detailed",selde);
                List<News> selnews = newsService.selnews();//查询公告
                model.addAttribute("news",selnews);
                session.setAttribute("flagname",userinfo.getUsername());//获得管理员用户名
                List<User> selall = userService.selall();//查询用户花销
                model.addAttribute("userlist",selall);
                return "index";
            }else {
                session.setAttribute("flag","user");//普通用户身份登录
                User userinfo = userService.selbyname(user);
                session.setAttribute("flagname",userinfo.getUsername());
                List<News> selnews = newsService.selnews();//查询公告
                model.addAttribute("news",selnews);
                return "usernews";
            }
        }
        else{
            model.addAttribute("message","账号或密码错误，请重新登陆");
            return "login";//登录失败
        }
    }

    /*
     * @Author Xss
     * @Description  查询用户全部信息
     * @Date 10:28 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("selall")
    public String selall(Model model,HttpSession session){
//        session.setAttribute("flag","admin");//管理员身份登录
        Detailed selde = detailedService.selde();//查询明细
        model.addAttribute("detailed",selde);
        List<News> selnews = newsService.selnews();//查询公告
        model.addAttribute("news",selnews);
        List<User> selall = userService.selall();//查询用户花销
        model.addAttribute("userlist",selall);
        return "index";
    }

    /*
     * @Author Xss
     * @Description 删除公告
     * @Date 12:44 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("delnews")
    public String delnews(int id){
        newsService.delnews(id);
        return "redirect:/selall";
    }

    /*
     * @Author Xss
     * @Description  跳转到添加公告界面
     * @Date 14:45 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("toaddnews")
    public String toaddnews(HttpSession session){
        System.out.println(session.getAttribute("flag"));
        return "form_component";
    }


    /*
     * @Author Xss
     * @Description 跳转到修改明细界面
     * @Date 15:37 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("toupdde")
    public String toupdde(Model model,HttpSession session){
        Detailed selde = detailedService.selde();
        model.addAttribute("detailed",selde);
        return "form_validation";
    }
    
    /*
     * @Author Xss
     * @Description  修改明细表
     * @Date 16:06 2021/7/22
     * @Param 
     * @return 
     **/
    @RequestMapping("updde")
    public String updde(Detailed detailed){
         detailedService.updde(detailed);
         return "redirect:/selall";
    }

    /*
     * @Author Xss
     * @Description  跳转到用户信息列表
     * @Date 16:48 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("touserlist")
    public String touserlist(Model model){
        List<User> seluser = userService.seluser();
        model.addAttribute("userlist",seluser);
        return "basic_table";
    }

    /*
     * @Author Xss
     * @Description  跳转到修改用户界面
     * @Date 17:33 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("toupduser")
    public String toupduser(int id,Model model){
        User selbyid = userService.selbyid(id);
        model.addAttribute("user",selbyid);
        return "upduser";
    }


    /*
     * @Author Xss
     * @Description  修改用户信息
     * @Date 8:58 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("updu")
    public String updu(User user){
        userService.updu(user);
        return "redirect:/touserlist";
    }


    /*
     * @Author Xss
     * @Description  删除用户
     * @Date 9:05 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("deluser")
    public String deluser(int id){
        userService.deluser(id);
        return "redirect:/touserlist";
    }

    /*
     * @Author Xss
     * @Description  用户查看公告
     * @Date 11:55 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("selnews")
    public String selnews(Model model){
        List<News> selnews = newsService.selnews();//查询公告
        model.addAttribute("news",selnews);
        return "usernews";
    }

    /*
     * @Author Xss
     * @Description  查询当前用户基本信息
     * @Date 12:08 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("selbynamenow")
    public String selbynamenow(HttpSession session,Model model){
        String flagname = (String) session.getAttribute("flagname");
        User user = new User();
        user.setUsername(flagname);
        User selbyname = userService.selbyname(user);
        model.addAttribute("userinfo",selbyname);
        return "userinfo";
    }

    /*
     * @Author Xss
     * @Description  修改用户信息
     * @Date 14:35 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("upduser")
    public String upduser(Model model,User user){
        if(userService.upduser(user)>0){
            model.addAttribute("message","修改成功");
        }
        return "successinfo";
    }

    /*
     * @Author Xss
     * @Description  查询用户当前购买列表
     * @Date 15:07 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("selbuynow")
    public String selbuynow(HttpSession session,Model model){
        String flagname = (String) session.getAttribute("flagname");
        List<Userbuy> selbuynow = userService.selbuynow(flagname);
        model.addAttribute("userbuy",selbuynow);
        return "userbuy";
    }

    /*
     * @Author Xss
     * @Description  跳转到购买水电页面
     * @Date 15:25 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("tobuy")
    public String tobuy(Model model){
        Detailed selde = detailedService.selde();//查询明细
        model.addAttribute("detailed",selde);
        return "buy";
    }

    /*
     * @Author Xss
     * @Description  购买流程
     * @Date 15:33 2021/7/23
     * @Param
     * @return
     **/
    @RequestMapping("buybuybuy")
    public String buybuybuy(User user,HttpSession session){
        String flagname = (String) session.getAttribute("flagname");
        userService.buybuybuy(user,flagname);
        return "redirect:/selbuynow";
    }

    /*
     * @Author Xss
     * @Description  退出登录
     * @Date 17:23 2021/7/26
     * @Param
     * @return
     **/
    @RequestMapping("gooutlogin")
    public String goback(HttpSession session){
        session.removeAttribute("flag");
        return "login";
    }
}
