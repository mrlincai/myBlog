package com.mszlu.blog.Service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;

/**
 * @author LinCai
 * @create 2021-09-26 22:59
 */
public interface CommentsService {
    /**
     * 根据文章ID 查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
