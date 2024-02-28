package CCE103TABAOSARES;
import java.util.Scanner;

public class Main_Inheretance {

	public static void main(String[] args) {

		int choice;
		do {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----------------");
		System.out.println("| For Patients |");
		System.out.println("----------------");
		System.out.print("Enter name: ");
		String name = input.next();
		
		System.out.print("Enter gender: ");
		char gender = input.next().charAt(0);
		System.out.print("Enter age: ");
		int age = input.nextInt();
		
		Patient p = new Patient(name, gender, age, "Normal");
		System.out.println("----------------");
		System.out.println("| For Doctors  |");
		System.out.println("----------------");
		System.out.print("Enter name: ");
		String name1 = input.next();
		
		System.out.print("Enter gender: ");
		char gender1 = input.next().charAt(0);
		System.out.print("Enter age: ");
		int age1 = input.nextInt();
		
		System.out.println("----------------");
		System.out.print("Enter fee: ");
		int fee = input.nextInt();
		System.out.println("-------------");
		
		Doctor d = new Doctor(name1, gender1, age1, "Rest", fee);
		
		System.out.println("");
		System.out.println("---Patient Info---");
		p.info();
		p.getMedResult();
		System.out.println();
		System.out.println("---Doctor Info---");
		d.info();
		d.calculateFee();
		System.out.println();
	
		System.out.println("--------------------------------------");
		System.out.println("Enter [1] to continue / [2] if dont.");
		System.out.println("--------------------------------------");
		System.out.print("Input your choice: ");
		choice = input.nextInt();
		} while(choice != 2) ;
		{
			System.out.println("Thankyou...");
		}					
	}
}
