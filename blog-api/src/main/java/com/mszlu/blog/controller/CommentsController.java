package com.mszlu.blog.controller;

import com.mszlu.blog.Service.CommentsService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LinCai
 * @create 2021-09-26 22:54
 */
@RestController
@RequestMapping("comments")
public class CommentsController {

    @Resource
    private CommentsService commentsService;

    ///comments/article/{id}
    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return commentsService.commentsByArticleId(id);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentsService.comment(commentParam);
    }
}
