package Tabaosares_Java;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChangeRecords {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		int keyid;//hold the id number
		
		System.out.print("Enter the id number: ");
		keyid = input.nextInt();
		
		boolean found = false;
		int numlines = 0;
		
		Scanner CountRecords = new Scanner(new FileReader("cce6496.txt"));
		
		while(CountRecords.hasNextLine())
		{
			CountRecords.nextLine();
			numlines++;
		}
		//parallel array
		String[] nameArray = new String[numlines];
		int[] idArray = new int[numlines];
		
		Scanner reader = new Scanner(new FileReader("cce6496.txt"));
		int index = 0;
		
		String newName;
		int newID;
		
		while(reader.hasNext())
		{
			newName= reader.next();
			newID = reader.nextInt();
			
			if(keyid == newID)
			{
				found = true;
				idArray[index] = newID;
				System.out.print("Enter new name: ");
				nameArray[index] = input.next();
				index++;				
			}
			else
			{
				nameArray[index] = newName;
				idArray[index] = newID;
				index++;
			}
		}
		if (found == false)
			System.out.println("id number is not found...");
		
		FileWriter save = new FileWriter("cce6496.txt");
		
		for(int i = 0;i<numlines;i++)
		{
			save.write(nameArray[i]+" "+ idArray[i]+"\n");
		}
		save.close();
	}
}
