package com.wyp.controller;

import com.wyp.pojo.User;
import com.wyp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    //添加
    @RequestMapping("/addUser")
    public String addUser(User user){
        int n = iUserService.addUser(user);
        System.out.println("结果为："+n);
        if(n>0){
            return "redirect:/getAllUser";
        }else{
            return "redirect:default.jsp";
        }
    }

    //查询所有
    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request){
        List<User> userList = iUserService.getAllUser();
        for (User u : userList){
            System.out.println(u.getUserId());
            System.out.println(u.getUserName());
            System.out.println(u.getPassWord());
            System.out.println(u.getAge());
        }
        if(userList.size()>0){
            HttpSession session = request.getSession();
            session.setAttribute("userList",userList);
            return "redirect:success.jsp";
        }else{
            return "redirect:default.jsp";
        }
    }

}
