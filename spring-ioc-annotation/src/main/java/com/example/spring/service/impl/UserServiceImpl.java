package com.example.spring.service.impl;

import com.example.spring.dao.UserDao;
import com.example.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.example.spring.service.impl
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 5/12/2022 - 11:22 am
 * @Version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
    }
}
