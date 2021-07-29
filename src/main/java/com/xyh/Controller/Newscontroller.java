package com.xyh.Controller;

import com.xyh.Service.NewsService;
import com.xyh.domain.News;
import com.xyh.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Newscontroller {
    @Autowired
    private NewsService newsService;


    /*
     * @Author Xss
     * @Description  添加公告
     * @Date 15:07 2021/7/22
     * @Param
     * @return
     **/
    @RequestMapping("addnews")
    public String addnews(News news, Model model, HttpSession session){
        if(newsService.addnews(news)>0){
            model.addAttribute("message","添加成功");
        }
        return "form_component";
    }
}
