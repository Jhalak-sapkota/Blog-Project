package com.blog.blog.Dto;

public class BlogDto {
    private String BlogTitle;
    private String BlogDescription;
    private String BlogCategory;


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
