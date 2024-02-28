package Tabaosares_Java;
import java.util.Scanner;
public class FoodMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input = new Scanner(System.in);

        int option;
        double bill = 0, payment, change;

        do {
            System.out.println("(1) Combo 1 - 55.00");
            System.out.println("(2) Combo 2 - 65.00");
            System.out.println("(3) Combo 3 - 80.00");
            System.out.println("(4) Exit");
            System.out.print("Order: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    double c1 = 55.00;
                    System.out.println("Rice");
                    System.out.println("Buttered Chicken");
                    System.out.println("Bihon");
                    bill = c1;
                    break;
                case 2:
                    double c2 = 65.00;
                    System.out.println("Java Rice");
                    System.out.println("Fish Fillet");
                    System.out.println("Bihon");
                    System.out.println("Royal");
                    bill += c2;
                    break;
                case 3:
                    double c3 = 80.00;
                    System.out.println("Fried Rice");
                    System.out.println("Fish Fillet");
                    System.out.println("Spaghetti");
                    System.out.println("Chicken Adobo");
                    System.out.println("Halohalo");
                    System.out.println("Mountain Dew");
                    bill += c3;
                    break;
                case 4:
                    System.out.println("Thank you for your order.");
                    break;
                default:
                    System.out.println("Invalid order...");
            }
        } while (option != 4);

        System.out.println("Total bill = " + bill);
        System.out.print("Payment: ");
        payment = input.nextDouble();

        if (payment < bill) {
            System.out.println("Insufficient amount..");
            System.out.print("Payment: ");
            payment = input.nextDouble();
        }

        if (payment == bill) {
            System.out.println("Thank you for giving the exact amount.");
        }

        change = payment - bill;
        System.out.println("Change = " + change);
        System.out.println("Thank you and come again...");

	}

}
