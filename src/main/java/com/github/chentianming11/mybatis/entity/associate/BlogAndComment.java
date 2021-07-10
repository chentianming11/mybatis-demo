package com.github.chentianming11.mybatis.entity.associate;

import com.github.chentianming11.mybatis.entity.Comment;
import lombok.Data;

import java.util.List;


@Data
public class BlogAndComment {
    Integer bid; // 文章ID
    String name; // 文章标题
    Integer authorId; // 文章作者ID
    List<Comment> comment; // 文章评论

}
