package com.xingyun.task3blog.repository;

import com.xingyun.task3blog.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IArticleRepository extends JpaRepository<Article,Integer>, JpaSpecificationExecutor<Article> {

}
