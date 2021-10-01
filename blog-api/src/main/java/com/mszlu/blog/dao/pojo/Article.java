package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-21 23:17
 */
@Data
public class Article {

    public static final int Article_TOP = 1;

    public static final int Article_Common = 0;

    private Long id;

    private String title;

    private String summary;

    //不用int而用integer类型的原因是：mybatis在更新的时候会把非null的都生成到SQL语句去更新，因为int有默认值0，所以每次都会把0赋值给commentCounts

    private Integer commentCounts;

    private Integer viewCounts;

    /**
     * 作者id
     */
    private Long authorId;
    /**
     * 内容id
     */
    private Long bodyId;
    /**
     * 类别id
     */
    private Long categoryId;

    /**
     * 置顶
     */
    private Integer weight;


    /**
     * 创建时间
     */
    private Long createDate;
}