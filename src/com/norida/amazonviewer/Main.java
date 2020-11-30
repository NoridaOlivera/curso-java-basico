package com.norida.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.norida.amazonviewer.model.Book;
import com.norida.amazonviewer.model.Chapter;
import com.norida.amazonviewer.model.Magazine;
import com.norida.amazonviewer.model.Movie;
import com.norida.amazonviewer.model.Serie;
import com.norida.makeReport.Report;

public class Main {

	public static void main(String[] args) {
		
		//Movie movie = new Movie("Coco","Animation",(short)2017);
		
		showMenu();
		
		Movie movie = new Movie("Coco", "Animation","Lee Unkrich", 120, (short)2017);
		movie.showData();
		//System.out.println(movie);
	
	}
	public static void showMenu() {
		
		int exit=0;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el Número de la opción deseada: ");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			System.out.println(" ");
			
			int op = sc.nextInt();
			
			//int op=2;
			switch (op) {
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazine();
				break;
			case 5:
				makeReport();;
				break;
			case 6:
				makeReport(new Date());
				break;
			case 0:
				System.out.println("saliste del sistema!");
				exit = 0;
				break;
			


			default:
				break;
			}
			
		}while(exit!=0);
		
	}
	static ArrayList<Movie> movies = Movie.makeMoviesList();;
	public static void showMovies() {
		int exit= 1;
	
		do {
			System.out.println();
			System.out.println("****Movies****");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + "."+ movies.get(i).getTitle()+ " 1Visto: "+ movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar a el menu");
			System.out.println();
			
			// LEER RESPUESTA DEL USUARIO
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response ==0) {
				showMenu();
			}
			
			if (response>0) {
				
			
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.starToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("................");
			}
			
			//Termino de verlo
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			
			System.out.println("Viste: "+ movieSelected);
			System.out.println("por: "+ movieSelected.getTimeViewed()+ " milisegundos");
		
			}
		} while (exit !=0);
	}
	
	public static void showSeries() {
		int exit= 0;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {			
			System.out.println("Series");
			
			for (int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + "."+ series.get(i).getTitle()+ " 1Visto: "+ series.get(i).isViewed());
			}
			
			System.out.println("0. Regresar a el menu");
			System.out.println();
			
			// LEER RESPUESTA DEL USUARIO
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response ==0) {
				showMenu();
			}
				showChapters(series.get(response-1).getChapters());
			
			
			
			Serie serieSelected = series.get(response-1);
			serieSelected.setViewed(true);
			serieSelected.getChapters();
			/*Date dateI = serieSelected.starToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("................");
			}
			
			//Termino de verlo
			movieSelected.stopToSee(dateI, new Date());
			System.out.println();
			
			System.out.println("Viste: "+ movieSelected);
			System.out.println("por: "+ movieSelected.getTimeViewed()+ " milisegundos");*/
		} while (exit !=0);
		
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSeriesSelected) {
		int exit= 0;
		//ArrayList<Chapter> chapters = Chapter.makeChapterList();
		do {
			System.out.println();
			System.out.println("****Chapters****");
			System.out.println();
			
			for (int i = 0; i < chaptersOfSeriesSelected.size(); i++) {
				System.out.println(i+1 + "."+ chaptersOfSeriesSelected.get(i).getTitle()+ " Visto: "+ chaptersOfSeriesSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar a el menu");
			System.out.println();
			
			// LEER RESPUESTA DEL USUARIO
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response ==0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSeriesSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.starToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("................");
			}
			
			//Termino de verlo
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			
			System.out.println("Viste: "+ chapterSelected);
			System.out.println("por: "+ chapterSelected.getTimeViewed()+ " milisegundos");
			
			showSeries();
			
		} while (exit !=0);
	}
	
	public static void showBooks() {
		int exit= 0;
		ArrayList<Book> books = Book.makeBooksList();
		do {
			System.out.println();
			System.out.println("****Books****");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i+1 + "."+ books.get(i).getTitle()+ " 1Visto: "+ books.get(i).isReaded());
			}
			
			System.out.println("0. Regresar a el menu");
			System.out.println();
			
			// LEER RESPUESTA DEL USUARIO
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response ==0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setReaded(true);
			Date dateI = bookSelected.starToSee(new Date());
			
			for (int i = 0; i < 1000000; i++) {
				System.out.println("................");
			}
			
			//Termino de verlo
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			
			System.out.println("Leiste: "+ bookSelected);
			System.out.println("por: "+ bookSelected.getTimeReaded()+ " milisegundos");
		} while (exit !=0);
	}
	
	public static void showMagazine() {
		int exit= 0;
		ArrayList<Magazine> magazines = Magazine.makeMagazineList();
		do {
			System.out.println();
			System.out.println("****Magazine****");
			System.out.println();
			
			for (int i = 0; i < magazines.size(); i++) {
				System.out.println(i+1 + "."+ magazines.get(i).getTitle());
			}
			
			System.out.println("0. Regresar a el menu");
			System.out.println();
			
			// LEER RESPUESTA DEL USUARIO
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response ==0) {
				showMenu();
			}
			
			Magazine magazineSelected = magazines.get(response-1);
			
			
		} while (exit !=0);
	}

	public static void makeReport() {
		
		Report report = new Report();
		report.setNameFile("Reporte");
		report.setExtension("txt");
		report.setTitle("::VISTOS::");
		String contentReport ="";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
			 contentReport += movie.toString()+"\n";	
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		String dateString = df.format(date)
;		
		Report report = new Report();
		report.setNameFile("Reporte "+ dateString);
		report.setExtension("txt");
		report.setTitle("::VISTOS::");
		String contentReport ="";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
			 contentReport += movie.toString()+"\n";	
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
	}
	
}
	

