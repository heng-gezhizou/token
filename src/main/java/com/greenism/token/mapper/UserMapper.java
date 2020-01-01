package com.greenism.token.mapper;

import com.greenism.token.bean.User;
import com.greenism.token.result.Result;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UserMapper
 * Package:com.greenism.token.dao
 * Description
 *
 * @data:2020/1/1 15:33
 * @author:jiahongjie
 */
@Mapper
public interface UserMapper {
    User selectUser();

    User selectUserByUsername(String username);
}
