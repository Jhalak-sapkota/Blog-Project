package com.blog.blog.Service;

import com.blog.blog.Dto.BlogDto;

import java.util.List;

public interface BlogService {
    void save (BlogDto blog);
    List<BlogDto> findAll();
    BlogDto findById(int id);
    void update (int id, BlogDto blog);

}
