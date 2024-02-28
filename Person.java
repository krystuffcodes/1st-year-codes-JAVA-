package CCE103TABAOSARES;

public class Person {

	//attributes
	String name;
	char gender;
	int age;
	//constructor
	Person(String name, char gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
			
	void info()
	{
		System.out.println("Name: "+ name);
		System.out.println("Gender: "+ gender);
		System.out.println("Age: "+ age);	
	}	
}