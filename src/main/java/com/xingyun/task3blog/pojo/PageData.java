package com.xingyun.task3blog.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PageData<T> {

    private Long total;

    private List<T> results;
}
