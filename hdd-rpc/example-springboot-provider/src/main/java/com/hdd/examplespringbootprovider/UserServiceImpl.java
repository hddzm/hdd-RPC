package com.hdd.examplespringbootprovider;

import com.hdd.example.common.model.User;
import com.hdd.example.common.service.UserService;
import com.hdd.rpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 */
@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
