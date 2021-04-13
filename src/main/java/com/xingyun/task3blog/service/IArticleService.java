package com.xingyun.task3blog.service;

import com.xingyun.task3blog.pojo.Article;
import com.xingyun.task3blog.pojo.PageData;

public interface IArticleService {

    PageData<Article> articlePage(Integer pageNum, Integer pageSize);

    Article getById(Integer id);
}
