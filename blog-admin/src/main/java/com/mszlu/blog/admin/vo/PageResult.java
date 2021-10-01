package com.mszlu.blog.admin.vo;

import lombok.Data;

import java.util.List;

/**
 * @author LinCai
 * @create 2021-09-28 10:31
 */
@Data
public class PageResult<T> {

    private List<T> list;

    private Long total;
}
