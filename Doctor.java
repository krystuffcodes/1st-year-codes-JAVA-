package CCE103TABAOSARES;
import java.text.DecimalFormat;

public class Doctor extends Person{

	//attributes
	 String prescription;
	 double fee;
	
	//constructor
	Doctor(String name, char gender, int age,String prescription,double fee) {
		super(name, gender, age);
		
		this.prescription = prescription;
		this.fee = fee;
	}
	//method - overriding
	void info()
	{
		super.info();
	}
	//method within Doctor class
	void calculateFee()
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		double medfee = 500.00;
		double total = medfee + fee;
		System.out.println("Prescription: "+ prescription);
		System.out.println("Total bill: " + df.format(total));		
	}	
}