package com.blog.blog.Entity;

import com.blog.blog.Dto.BlogDto;
import jakarta.persistence.*;

@Entity
@Table(name = "blog")
public class Blogs{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BlogID;
    private String BlogTitle;
    private String BlogDescription;
    private String BlogCategory;

    public Blogs() {}

    public Blogs(Integer blogID, String blogTitle, String blogDescription, String blogCategory) {
        BlogID = blogID;
        BlogTitle = blogTitle;
        BlogDescription = blogDescription;
        BlogCategory = blogCategory;
    }

    public Integer getBlogID() {
        return BlogID;
    }

    public void setBlogID(Integer blogID) {
        BlogID = blogID;
    }

    public String getBlogTitle() {
        return BlogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        BlogTitle = blogTitle;
    }

    public String getBlogDescription() {
        return BlogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        BlogDescription = blogDescription;
    }

    public String getBlogCategory() {
        return BlogCategory;
    }

    public void setBlogCategory(String blogCategory) {
        BlogCategory = blogCategory;
    }
}
