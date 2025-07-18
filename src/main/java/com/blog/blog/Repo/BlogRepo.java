package com.blog.blog.Repo;

import com.blog.blog.Entity.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepo extends JpaRepository <Blogs, Integer> {

}
