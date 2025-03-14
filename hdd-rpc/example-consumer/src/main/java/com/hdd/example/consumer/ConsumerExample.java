package com.hdd.example.consumer;

import com.hdd.example.common.model.User;
import com.hdd.example.common.service.UserService;
import com.hdd.rpc.bootstrap.ConsumerBootstrap;
import com.hdd.rpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 *
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("hdd");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
