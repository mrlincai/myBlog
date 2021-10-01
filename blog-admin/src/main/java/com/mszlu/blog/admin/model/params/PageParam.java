package com.mszlu.blog.admin.model.params;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-28 10:21
 */
@Data
public class PageParam {
    private Integer currentPage;

    private Integer pageSize;

    private String queryString;
}
