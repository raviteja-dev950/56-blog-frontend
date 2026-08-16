package com.raviteja.blog.model;

public class Post {
    private Long id;
    private String title;
    private String author;
    private String category;
    private String content;
    private String imageUrl;
    private String date;

    public Post() {}
    public Post(Long id, String title, String author, String category, String content, String imageUrl, String date) {
        this.id = id; this.title = title; this.author = author;
        this.category = category; this.content = content;
        this.imageUrl = imageUrl; this.date = date;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getTitle(){return title;} public void setTitle(String t){this.title=t;}
    public String getAuthor(){return author;} public void setAuthor(String a){this.author=a;}
    public String getCategory(){return category;} public void setCategory(String c){this.category=c;}
    public String getContent(){return content;} public void setContent(String c){this.content=c;}
    public String getImageUrl(){return imageUrl;} public void setImageUrl(String i){this.imageUrl=i;}
    public String getDate(){return date;} public void setDate(String d){this.date=d;}
}