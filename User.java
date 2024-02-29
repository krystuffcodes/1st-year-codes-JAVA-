package acedron;

public class User {

	//attribute
	private int id;
	private String name;
	
	//constructor
	User(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	int getID()
	{
		return id;
	}
	
	
	
	String getName()
	{
		return name;
	}
	
	//setter
	void setName(String name)
	{
		this.name = name;
	}
	
}
