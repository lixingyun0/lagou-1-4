package com.xingyun.task3blog.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_article")
public class Article implements Serializable {

  /*  CREATE TABLE `t_article` (
            `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL COMMENT '⽂文章标题',
            `content` longtext COMMENT '⽂文章具体内容',
            `created` date NOT NULL COMMENT '发表时间',
            `modified` date DEFAULT NULL COMMENT '修改时间',
            `categories` varchar(200) DEFAULT '默认分类' COMMENT '⽂文章分类',
            `tags` varchar(200) DEFAULT NULL COMMENT '⽂文章标签',
            `allow_comment` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否允许评论',
            `thumbnail` varchar(200) DEFAULT NULL COMMENT '⽂文章缩略略图',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;*/

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private Date created;

    private Date modified;

    private String categories;

    private String tags;

    private String allowComment;

    private String thumbnail;

}
