package com.mszlu.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.mszlu.blog.vo.ArticleBodyVo;
import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.TagVo;
import lombok.Data;

import java.util.List;

/**
 * @author LinCai
 * @create 2021-09-22 10:57
 */
@Data
public class ArticleVo {

//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;


}
