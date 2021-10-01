package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-26 8:54
 */
@Data
public class ArticleBody {

    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;
}
