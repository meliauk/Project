package com.book.entity;

public class book_type {

	private int id ;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public book_type(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public book_type(String type) {
		super();
		this.type = type;
	}
	public book_type() {
		super();
	}
	
	
}
