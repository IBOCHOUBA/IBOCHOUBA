package com.example.demo1;

import java.io.Serializable;

public class Employee implements Serializable {
	private Integer id;
	private String name;
	private String author;
	
	public Integer getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
