package com.blog.blog.Controller;

import com.blog.blog.Dto.BlogDto;
import com.blog.blog.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody BlogDto blog) {
        blogService.save(blog);
        return "Blog saved successfully";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<BlogDto> list() {
        return blogService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BlogDto get(@PathVariable int id) {
        return blogService.findById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable int id, @RequestBody BlogDto blog) {
        blogService.update(id, blog);
        return "Blog updated successfully";
    }
}
