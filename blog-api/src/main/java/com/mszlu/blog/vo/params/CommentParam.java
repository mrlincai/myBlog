package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author LinCai
 * @create 2021-09-27 6:33
 */
@Data
public class CommentParam {
    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;
}
