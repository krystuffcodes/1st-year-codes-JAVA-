package Practice102tabaosares;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void menu()
	{
		
		System.out.println("--------------------");
		System.out.println("Student Information");
		System.out.println("--------------------");
		System.out.println("1. Add Record   ");
		System.out.println("2. View Record  ");
		System.out.println("3. Edit Record  ");
		System.out.println("4. Delete Record");
		System.out.println("5. Exit         ");
	}
	
	public static void addRecords(String name, int id) throws IOException
	{
		FileWriter writer = new FileWriter("cce6496.txt",true);
		writer.write(name+" "+id+"\n");
		System.out.println("Records successfully added...");
		writer.close();
	}
	
	public static void viewRecords() throws FileNotFoundException
	{
	  Scanner reader = new Scanner(new FileReader("cce6496.txt"));
	  int ctr = 1;
	  String name1 = " ";
	  int id1 = 0;
	  
	  
	  while(reader.hasNext())
    {
		  name1 = reader.next();
		  id1 = reader.nextInt();
		  System.out.println("\n ");
		  System.out.println("-----Student "+ctr+"-----");
		  System.out.println("Name: "+name1);
		  System.out.println("id1 : "+id1);
		  ctr++;
    }
	}	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		
		do
		{
		menu();	
		System.out.print("Enter option: ");
		option = input.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("------------------- ");
			System.out.print("Enter name: ");
			String name = input.next();
			System.out.print("Enter id  : ");
			int id = input.nextInt();
			try {
				addRecords(name,id);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				viewRecords();
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.out.println("Thank you...");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
		}while (option !=5);

	}

}