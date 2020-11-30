package com.norida.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication {
	
	private int id;
	
	
	
	public Magazine(String title, Date date, String editorial, String authors) {
		super(title, date, editorial, authors);
	}



	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Title: "+ getTitle() +
				"\n Edition: " + getDate() +
				"\n Editorial: "+ getEditorial() +
				"\n Authors: "+ getAuthors() ;
	}

	
	public static ArrayList<Magazine> makeMagazineList(){
		ArrayList<Magazine> magazine = new ArrayList();
		Date date = new Date();
	
		for ( int i=1; i<=5 ; i++) {
			magazine.add(new Magazine("Magazine: "+i, date, "Editorial: "+i, "Author: "+i));
			
		}
		return magazine;
	}
	
	

}
