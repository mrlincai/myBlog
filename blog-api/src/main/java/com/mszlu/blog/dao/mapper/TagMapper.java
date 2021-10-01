package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.dao.pojo.Tag;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LinCai
 * @create 2021-09-21 23:47
 */

public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章ID查询标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /**
     * 查询最热的数据 前n条
     * @param limit
     * @return
     */
    List<Long> findHotsTagIds(int limit);


    List<Tag> findTagsByTagIds(List<Long> tagIds);
}

