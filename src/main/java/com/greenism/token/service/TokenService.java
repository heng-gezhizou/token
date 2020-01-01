package com.greenism.token.service;

import com.greenism.token.bean.User;

/**
 * ClassName:TokenService
 * Package:com.greenism.token.service
 * Description
 *
 * @data:2020/1/1 20:39
 * @author:jiahongjie
 */
public interface TokenService {
    public String getToken(User user);
}
