package com.xyh;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInt implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String  flag = (String) session.getAttribute("flag");
        if(null == flag){
            request.setAttribute("msg","您还未登录,请先登录");
            request.getRequestDispatcher("test").forward(request,response);
        }
        return true;
    }
}
