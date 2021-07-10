package com.github.chentianming11.mybatis.objectfactory;


import com.github.chentianming11.mybatis.entity.Blog;

/**
 * @Author: qingshan
 * @Date: 2019/3/25 19:41
 */
public class ObjectFactoryTest {
    public static void main(String[] args) {
        CustomObjectFactory factory = new CustomObjectFactory();
        Blog myBlog = (Blog) factory.create(Blog.class);
        System.out.println(myBlog);
    }
}
