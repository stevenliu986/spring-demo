package com.example.spring.dao.impl;

import com.example.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDaoImpl
 * Package: com.example.spring.dao.impl
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 5/12/2022 - 11:22 am
 * @Version: v1.0
 */

@Repository
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
