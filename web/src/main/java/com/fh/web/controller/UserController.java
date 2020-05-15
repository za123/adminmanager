package com.fh.web.controller;

import entity.ResultEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    /**
     * 用户登录
     *
     * @param username 账号
     * @param password 密码
     * @return 登录结果
     */
    @RequestMapping(value = "/login")
    public ResultEntity login(String username, String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResultEntity.fail(null, "请输入账号或密码!");
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("password", password);
        map.put("username", username);
        return ResultEntity.success(map, "登录成功!");
    }
}
