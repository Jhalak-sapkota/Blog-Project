package com.blog.blog.Service;

import com.blog.blog.Dto.BlogDto;
import com.blog.blog.Entity.Blogs;
import com.blog.blog.Repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepo blogRepo;

    @Override
    public void save(BlogDto blog) {
        Blogs blogs = new Blogs();
        blogs.setBlogTitle(blog.getBlogTitle());
        blogs.setBlogDescription(blog.getBlogDescription());
        blogs.setBlogCategory(blog.getBlogCategory());
        blogRepo.save(blogs);
    }

    @Override
    public List<BlogDto> findAll() {
        return blogRepo.findAll().stream().map(blog -> {
            BlogDto dto = new BlogDto();
            dto.setBlogTitle(blog.getBlogTitle());
            dto.setBlogDescription(blog.getBlogDescription());
            dto.setBlogCategory(blog.getBlogCategory());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public BlogDto findById(int id) {
        Blogs blogs = blogRepo.findById(id).orElse(null);
        if (blogs == null) return null;
        BlogDto dto = new BlogDto();
        dto.setBlogTitle(blogs.getBlogTitle());
        dto.setBlogDescription(blogs.getBlogDescription());
        dto.setBlogCategory(blogs.getBlogCategory());
        return dto;
    }

    @Override
    public void update(int id, BlogDto blogDto) {
        Blogs blogs = blogRepo.findById(id).orElseThrow();
        blogs.setBlogTitle(blogDto.getBlogTitle());
        blogs.setBlogDescription(blogDto.getBlogDescription());
        blogs.setBlogCategory(blogDto.getBlogCategory());
        blogRepo.save(blogs);

    }
}
