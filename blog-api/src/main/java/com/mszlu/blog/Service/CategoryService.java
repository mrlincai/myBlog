package com.mszlu.blog.Service;

import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.Result;

import java.util.List;

/**
 * @author LinCai
 * @create 2021-09-26 10:22
 */

public interface CategoryService {


    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}
