package main;

public class SingleRoom implements main2.Food
{
	String name;
	int contact;
	String gender;
	
	private String singleroomManager = "Nikita";
	protected String doubleroomManager = "Tanya";
	public String tripleroomManager = "Prathita";
	String Manager = "Saiyam";
	
	public SingleRoom()
	{
		this.name = "New";
	}
	
	SingleRoom(String name, int contact, String gender)
	{
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}
	
	public SingleRoom newSingleRoom()
	{
		SingleRoom ob = new SingleRoom();
		return ob;
	}
	
	public void order()
	{
		System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
	
		System.out.println("For any help, contact:\nSingle Room manager:" + singleroomManager);
		System.out.println("Double Room manager:" + doubleroomManager);
		System.out.println("Triple Room manager:" + tripleroomManager);
		System.out.println("Manager:" + Manager);
	}
}
