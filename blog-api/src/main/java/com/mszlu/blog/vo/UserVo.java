package com.mszlu.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
/**
 * @author LinCai
 * @create 2021-09-26 23:13
 */
@Data
public class UserVo {

    private String nickname;

    private String avatar;

//    @JsonSerialize(using = ToStringSerializer.class)

    private String id;
}
