package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-23 16:31
 */
@Data
public class LoginParam {

    private String account;

    private String password;

    private String nickname;
}
