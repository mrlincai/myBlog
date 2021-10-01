package com.mszlu.blog.dao.dos;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-23 14:28
 * 包dos也是数据库里查出来的 不需要持久化的对象
 */
@Data
public class Archives {

    private Integer year;

    private Integer month;

    private Long count;
}
