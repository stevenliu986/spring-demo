package com.example.spring.controller;

import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.example.spring.controller
 * Description:
 * @Author: Steven_LIU
 * @Create: 5/12/2022
 * @Version: v1.0
 */
@Controller
public class UserController {

    @Autowired
   // @Qualifier("userServiceImpl") // 此类情况极少用到
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
