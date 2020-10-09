package Q8;

import java.util.ArrayList;
import java.util.List;


class Book{
	String title;
	List<String> authors = new ArrayList<String>();
	int noOfPages;
	double price;
	String Publisher;
	Book(){
		this.title = "None";
		List<String> arths = new ArrayList<String>();
		arths.add("Someone");
		authors = arths;
		this.noOfPages = 300;
		this.price = 250;
		this.Publisher = "JKH";
	}
	Book(String title, List<String> arths, int noOfPages, double price, String Publisher){
		this.title = title;
		authors = arths;
		this.noOfPages = noOfPages;
		this.price = price;
		this.Publisher = Publisher;
	}
	void disp() {
		System.out.println("Title: " + title);
		System.out.print("AUTHORS: ");
		for(int i=0;i<authors.size();i++) {
			System.out.print(authors.get(i)+ " ");
		}
		System.out.println();
		System.out.println("No. of Pages: " + noOfPages);
		System.out.println("Price: "+ price);
		System.out.println("Publisher: "+ Publisher);
		System.out.println();
	}
}

class Library{
	List<Book> l = new ArrayList<Book>();
	Library(){
		
	}
	void add(Book b) {
		l.add(b);
	}
	
	void remove(Book b) {
		l.remove(b);
	}
	Book get(int index) {
		return l.get(index);
	}
}

public class Q8 {

	public static void main(String[] args) {
		Library lb = new Library();
		List<String> arths = new ArrayList<String>();
		arths.add("H. C. Verma");
		arths.add("R. S. Aggarwal");
		Book b1 = new Book("Physics 1", arths, 700, 500.00, "ABC");
		lb.add(b1);
		Book b2 = new Book("Physics 2", arths, 700, 500.00, "ABC");
		lb.add(b2);
		Book b3 = new Book("Maths 1", arths, 700, 500.00, "ABC");
		lb.add(b3);
		Book b4 = new Book("Maths 2", arths, 700, 500.00, "ABC");
		lb.add(b4);
		Book b5 = new Book();
		lb.add(b5);
		for(int i=0;i<5;i++) {
			lb.get(i).disp();
		}
	}

}
