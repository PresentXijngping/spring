package com.jp.test05.pojo;



public class Blog {
      private int id;
      private String title;
      private  Author author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
      
}
