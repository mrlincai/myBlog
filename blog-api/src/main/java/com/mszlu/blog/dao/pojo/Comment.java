package com.mszlu.blog.dao.pojo;

import lombok.Data;
/**
 * @author LinCai
 * @create 2021-09-26 22:49
 */
@Data
public class Comment {

    private Long id;

    private String content;

    private Long createDate;

    private Long articleId;

    private Long authorId;

    private Long parentId;

    private Long toUid;

    private Integer level;
}
