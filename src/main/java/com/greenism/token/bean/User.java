package com.greenism.token.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:User
 * Package:com.greenism.token.bean
 * Description
 *
 * @data:2020/1/1 15:34
 * @author:jiahongjie
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;

}
