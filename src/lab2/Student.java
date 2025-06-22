/*Create a class Book which describes its Book_title and Book_price. Use getter and
setter Methods to get & set the Books description. Implement createBook and
showBook methods to create and display Book Information. Write a separate class
BookInfo to access the Book class*/
package lab2;
import java.util.*;

class Book
{ 
	String title;
	float price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}	
	
	void crateBook(String title, float price)
	{
		setTitle(title);
		setPrice(price);
	}
	
	void showBook() {
		System.out.println("Title:"+getTitle());
		System.out.println("Price:"+getPrice());
	}
}

public class Student {

	public static void main(String[] args) {
		
		Book obj= new Book();
		obj.crateBook("Java", 50);
		obj.showBook();

		
		 
	}
}
