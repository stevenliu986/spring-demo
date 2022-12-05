package com.example.spring.controller;

import com.example.spring.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.example.spring.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 5/12/2022 - 11:21 am
 * @Version: v1.0
 */
@Controller
public class UserController {

    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
