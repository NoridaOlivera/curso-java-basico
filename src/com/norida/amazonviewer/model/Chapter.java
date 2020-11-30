package com.norida.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {
	

	private int id;
	private int sessionNumber;
	
	

	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.sessionNumber = sessionNumber;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.getId();
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		return " Title: "+ getTitle()+
				"\n Genre: "+ getGenre()+
				"\n Year: "+ getYear()+
				"\n Creator: "+ getCreator()+
				"\n Duration: "+ getDuration();
	}
	
	public static ArrayList<Chapter> makeChapterList(){
		ArrayList<Chapter> chapters = new ArrayList();
		
	
		for ( int i=1; i<=5 ; i++) {
			chapters.add(new Chapter("Titulo: "+i, "Genero: "+i, "Creador: "+i, 120+i, (short)(2017+i),i));
			
		}
		return chapters;
	}
	
	
}
