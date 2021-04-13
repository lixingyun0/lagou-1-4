package com.xingyun.task3blog.service.impl;

import com.xingyun.task3blog.pojo.Article;
import com.xingyun.task3blog.pojo.PageData;
import com.xingyun.task3blog.repository.IArticleRepository;
import com.xingyun.task3blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticleRepository articleRepository;


    @Override
    public PageData<Article> articlePage(Integer pageNum,Integer pageSize){
        if (pageNum<0){
            pageNum=0;
        }
        PageRequest pageRequest = PageRequest.of(pageNum,pageSize);
        Page<Article> page = articleRepository.findAll(pageRequest);
        PageData<Article> pageData = new PageData<>();
        pageData.setTotal(page.getTotalElements());
        pageData.setResults(page.get().collect(Collectors.toList()));
        return pageData;
    }

    @Override
    public Article getById(Integer id) {
        return articleRepository.findById(id).get();
    }


}
