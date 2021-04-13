package com.xingyun.task3blog.controller;

import com.xingyun.task3blog.pojo.Article;
import com.xingyun.task3blog.pojo.PageData;
import com.xingyun.task3blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("/one")
    public ModelAndView getOne(Integer id){
        Article byId = articleService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("article",byId);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/page")
    public ModelAndView getOne(Integer pageNum, Integer pageSize){
        PageData<Article> pageData = articleService.articlePage(pageNum - 1, pageSize);
        List<Article> results = pageData.getResults();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("results",results);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
