package com.greenism.token.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.greenism.token.annotation.UserLoginToken;
import com.greenism.token.bean.User;
import com.greenism.token.enums.ErrorEnum;
import com.greenism.token.result.Result;
import com.greenism.token.service.TokenService;
import com.greenism.token.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:LoginController
 * Package:com.greenism.token.controller
 * Description
 *
 * @data:2020/1/1 15:31
 * @author:jiahongjie
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @UserLoginToken
    @GetMapping("/getUser")
    public Result<User> getUser(){
        User user = userService.queryUser();
        if(user == null){
            return Result.error(ErrorEnum.FAIL);
        }

        return Result.success(user);
    }

    @PostMapping("/login")
    public Result<Object> login(@RequestBody() User user){

        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.queryUserByUsername(user.getUsername());
        if(userForBase==null){
            jsonObject.put("message","登录失败,用户不存在");
            return Result.error(ErrorEnum.ERROR);
        }else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登录失败,密码错误");
                return Result.error(ErrorEnum.ERROR);
            }else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return Result.success(jsonObject);
            }
        }

    }



}
