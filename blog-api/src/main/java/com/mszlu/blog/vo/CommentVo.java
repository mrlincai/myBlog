package com.mszlu.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.mszlu.blog.dao.pojo.SysUser;
import lombok.Data;
import lombok.ToString;

import java.util.List;
/**
 * @author LinCai
 * @create 2021-09-26 23:13
 */
@Data
public class CommentVo  {

    //@JsonSerialize TODO 序列化 把id转为string 防止前端精度损失
    //分布式id 比较长，传到前端会有精度损失，必须转为string类型进行传输，就不会有问题了

//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;

    private UserVo toUser;
}
