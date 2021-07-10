package com.github.chentianming11.mybatis.entity.associate;

import com.github.chentianming11.mybatis.entity.Author;
import lombok.Data;

import java.io.Serializable;


@Data
public class BlogAndAuthor implements Serializable {
    Integer bid; // 文章ID
    String name; // 文章标题
    Author author; // 作者

}
