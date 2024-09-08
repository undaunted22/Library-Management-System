package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		int bookIDNew= 1;
         Scanner sc=new Scanner(System.in);
//      Map<Integer,Book> m= new HashMap<>(); 
//      m.put(1, new Book(1, "Anatomy", "christopher nolan", 300, 4));
//      m.put(2, new Book(2, "SST", "christopher cholan", 470, 6));

      
//      l.add(new Book(1, "Anatomy", "christopher nolan", 300, 4));
//      l.add(new Book(2, "SST", "christopher cholan", 470, 6));
//      l.add(new Book(3, "abc", "christopher nolan", 300, 4));
//      l.add(new Book(4, "bbc", "christopher cholan", 470, 6));
//      l.add(new Book(5, "tuma", "christopher nolan", 300, 3));
//      l.add(new Book(6, "drake", "christopher cholan", 470, 7));
//      
//        System.out.println("Enter book details");
//        
//        System.out.println("Book Name: ");
//        String bookName=  sc.next();
//     
//        System.out.println("Writer Name: ");
//        String writerName=sc.next();
//        
//        System.out.println("Price: ");
//        int price=sc.nextInt();
//        
//        System.out.println("Quantity: ");
//        int quantity=sc.nextInt();
//        
//        Book b1 = new Book(bookIDNew, bookName, writerName, price, quantity);
//        
//        List<Book> list1=new ArrayList<>();
//        list1.add(b1);
//        System.out.println(list1);
        
        boolean running = true;
        
        while(running) {
        	int bookID = bookIDNew++;
        	System.out.println("1. Add Book \n2. Exit");
        	int choice = sc.nextInt();
        	if (choice == 2) {
        		break;
        	}
        	
        	switch(choice){
        		case(1): {
        			System.out.println("choice is 1");
        			System.out.println(bookID);
        			break;
        		}
        		case(2):{
        			System.out.println("choice is 2");
        			break;
        		}
        		default:{
        			System.out.println("Incorrect Choice Made.");
        		}
        	}
        	
        }
        
System.out.println("End of Application.");
        
	}

}
