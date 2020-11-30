package com.norida.amazonviewer.model;

import java.util.Date;

public class Publication {

	private String title;
	private Date date;
	private String editorial;
	private String authors;
	
	
	public Publication(String title, Date date, String editorial, String authors) {
		super();
		this.title = title;
		this.date = date;
		this.editorial = editorial;
		this.authors = authors;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	
	
	
}
