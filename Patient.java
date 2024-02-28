package CCE103TABAOSARES;

public class Patient extends Person{

	//attributes
	String medResult;
	
	//constructor
	Patient(String name, char gender, int age, String medResult) {
		super(name, gender, age);
		
		this.medResult = medResult;		
	}
	//method overriding
	void info()
	{
		super.info();
	}	
	//method within the class	
	void getMedResult()
	{
		System.out.println("Medical Result: " + medResult);
	}			
}