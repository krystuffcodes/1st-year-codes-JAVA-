package acedron;

import java.util.Scanner;

public class MainEncap {

	public static void main(String[] args) {
		boolean choose = true;
		User u = new User("Prince", 546122);

		//do {
		System.out.println("Name: "+u.getName());
		System.out.println("ID: "+u.getID());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter new Name: ");
		String name = input.next();
		u.setName(name);
		System.out.println();
		System.out.println("---New Edited Name---");
		System.out.println("Name: "+u.getName());
		System.out.println("ID: "+u.getID());
		
		//if (choose != false)
		//{
			//System.out.println("Do you want to continue yes/no");
			
		//}
		
		//}while(choose);
		
		

	}

}
