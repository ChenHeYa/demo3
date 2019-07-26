package com.zb.demo3.contro;

import com.zb.demo3.entity.User;
import com.zb.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String list(Model model, User user){
        System.out.println(22222);
        model.addAttribute("users",userService.findInfo(user));
        return "list";

    }
}
