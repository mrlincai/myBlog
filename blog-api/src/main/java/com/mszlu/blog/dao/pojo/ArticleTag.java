package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-27 10:31
 */
@Data
public class ArticleTag {

    private Long id;

    private Long articleId;

    private Long tagId;
}
