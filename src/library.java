import java.util.Scanner;
import java.util.ArrayList;

public class library {
	static Book[] BooksVec;
	static int totalBook;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	    BooksVec = new Book[100];
	    totalBook = 0;
	    
		choice();
	}
	public static void choice(){
int i = 0;
		
		System.out.println("please insert number");
		System.out.println("1 to insert book");
		System.out.println("2 to update book");
		System.out.println("3 to delete book");
		System.out.println("4 to find book");
		System.out.println("5 to print to all books by type");
		System.out.println("6 to statistics book");
		System.out.println("7 to insert book"); 
		
		Scanner sc = new Scanner(System.in) ;
		i = sc.nextInt();
		
		switch (i) {
		case 1: insertBook();
			break;
		case 2: updateBook();
			break;
		case 3: deleteBook();
			break;
		case 4: findBook();
			break;
		case 5: printBook();
			break;
		case 6: statistics();
			break;
		default:
			break;
		}
	}
	
	private static void statistics() {
		// TODO Auto-generated method stub
		
	}
	private static void printBook() {
		// TODO Auto-generated method stub
		
	}
	private static void findBook() {
		// TODO Auto-generated method stub
		System.out.println("what to find update?");
		System.out.println("if you want to find the book name press 1");
		System.out.println("if you want to find the MKT to the book press 2");
		System.out.println("if you want to find the edition to the book press 3");
		System.out.println("if you want to find the first name to the Author name press 4");
		System.out.println("if you want to find the last name to the Author name press 5");
		System.out.println("if you want to find the the  Year Of Publish of the book press 6");
		System.out.println("if you want to find the country to the book  press 7");
	}
	public static void insertBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("pls insert the book name");
		String nb = sc.next();
		System.out.println("pls insert the book MKT");
		String M = sc.next();
		System.out.println("pls insert the book edition");
		int e = sc.nextInt();
		System.out.println("pls insert the first name");
		String fn = sc.next();
		System.out.println("pls insert the last name");
		String ln = sc.next();
		System.out.println("pls insert the book Year Of Publish");
		int yop = sc.nextInt();
		System.out.println("pls insert the country");
		int c = sc.nextInt();
		BooksVec[totalBook] = new Book(nb, M, e, fn,ln,yop,c);
		/*System.out.println(BooksVec[totalBook].nameBook   );
		System.out.println(BooksVec[totalBook].MKT);
		System.out.println(BooksVec[totalBook].edition   );
		System.out.println(BooksVec[totalBook].fname   );
		System.out.println(BooksVec[totalBook].lname   );
		System.out.println("total is " +totalBook);*/
		totalBook++;
		choice();
	}
	public static void updateBook() {
		// TODO Auto-generated method stub
		int index = 0;
		int bookIndex = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter to the index of the book do you want to update ");
		bookIndex = sc.nextInt();
		if (bookIndex > totalBook && bookIndex < 0){
			System.out.println("");
		}
		else {
		
		System.out.println("what to want update?");
		System.out.println("if you want update to the book name press 1");
		System.out.println("if you want update to the MKT to the book press 2");
		System.out.println("if you want update to the edition to the book press 3");
		System.out.println("if you want update to the first name to the Author name press 4");
		System.out.println("if you want update to the last name to the Author name press 5");
		System.out.println("if you want update to the the  Year Of Publish of the book press 6");
		System.out.println("if you want update to the country to the book  press 7");
		index = sc.nextInt();
		if (index > 0 && bookIndex < 8) {
			switch (index){
			case 1: {
				System.out.println("enter the name");
				BooksVec[bookIndex].nameBook = sc.next();
			}
				break;
			case 2: {
				System.out.println("enter the MKT");
				BooksVec[bookIndex].MKT = sc.next();
			}
				break;
			case 3: {
				System.out.println("enter the edition");
				BooksVec[bookIndex].edition = sc.nextInt();
			}
				break;
			case 4: {
				System.out.println("enter the first name to the outhor");
				BooksVec[bookIndex].fname = sc.next();
			}
				break;
			case 5: {
				System.out.println("enter the last name to the outhor");
				BooksVec[bookIndex].lname = sc.next();
			}
				break;
			case 6: {
				System.out.println("enter the Year Of Publish of the book");
				BooksVec[bookIndex].YOfPublish = sc.nextInt();
			}
				break;
			case 7: {
				System.out.println("enter the Country");
				BooksVec[bookIndex].country = sc.nextInt();
			}
				break;
				default:
				break;
			}
			
		}
		else {
			System.out.println("the number is not legal");
			updateBook();
		}
		}
		System.out.println("the sucssesful update");
		choice();
	}
	public static void deleteBook() {
		// TODO Auto-generated method stub
		
		System.out.println("select number index to the book to want to delete ");
		Scanner sc = new Scanner (System.in);
		int index = sc.nextInt();
		if (index > totalBook ){
			System.out.println("The index does not exist");
		BooksVec[totalBook]= BooksVec[totalBook + 1];
			}
		else {
			for (int i=index; i < totalBook; i++){
				BooksVec[i]= BooksVec[i + 1];
			}
			BooksVec[totalBook] = new Book("", "", 0, "","",0,0);
			
		}
		choice();		
	}
	
	
}

	

	