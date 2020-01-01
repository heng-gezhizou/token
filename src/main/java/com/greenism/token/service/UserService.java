package com.greenism.token.service;

import com.greenism.token.bean.User;
import com.greenism.token.result.Result;

/**
 * ClassName:UserService
 * Package:com.greenism.token.service
 * Description
 *
 * @data:2020/1/1 15:32
 * @author:jiahongjie
 */
public interface UserService {
    User queryUser();

    User queryUserByUsername(String username);
}
