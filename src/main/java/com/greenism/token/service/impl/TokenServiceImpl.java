package com.greenism.token.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.greenism.token.bean.User;
import com.greenism.token.result.Result;
import com.greenism.token.service.TokenService;
import org.springframework.stereotype.Service;

/**
 * ClassName:TokenServiceImpl
 * Package:com.greenism.token.service.impl
 * Description
 *
 * @data:2020/1/1 20:37
 * @author:jiahongjie
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user){

        String token = "";
        token = JWT.create().withAudience(user.getUsername())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;

    }
}
