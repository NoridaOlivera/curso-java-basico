package com.norida.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable{
	private int id;	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	


	public Book(String title, Date date, String editorial, String authors, String isbn) {
		super(title, date, editorial, authors);
		this.isbn = isbn;
	}


	public int getId() {
		return id;
	}
	
	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String isReaded() {
		String leido = " ";
		if (readed==true) {
			leido = "SI";
		}else {
			leido = "NO";
		}
		return leido;
		
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Title: "+ getTitle() +
				"\n Edition: " + getDate() +
				"\n Editorial: "+ getEditorial() +
				"\n Authors: "+ getAuthors() +
				"\n ISBN: "+ getIsbn() +
				"\n Time Readed: "+getTimeReaded();
	}


	@Override
	public Date starToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if (dateF.getTime()> dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeReaded(0);
		}
	}
	
	public static ArrayList<Book> makeBooksList(){
		ArrayList<Book> books = new ArrayList();
		Date date = new Date();
	
		for ( int i=1; i<=5 ; i++) {
			books.add(new Book("Book: "+i, date, "Editorial: "+i, "Author: "+i, "Isbn: "+i));
			
		}
		return books;
	}
	

}
