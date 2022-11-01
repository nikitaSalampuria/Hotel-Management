package main;

public class TripleRoom extends DoubleRoom 
{
	String name3;
	int contact3;
	String gender3;
	
	TripleRoom()
	{
		super();
		this.name3 = "New3";
	}
	
	TripleRoom(String name, int contact, String gender, String name2, int contact2, String gender2, String name3, int contact3, String gender3)
	{
		super(name,contact,gender,name2,contact2,gender2);
		this.name3 = name3;
		this.contact3 = contact3;
		this.gender3 = gender3;
	}
	
	public void order()
	{
		System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
	
		//System.out.println("For any help, contact:\n Single Room manager:" + singleroomManager); //private
		System.out.println("For any help, contact:\nDouble Room manager:" + doubleroomManager);
		System.out.println("Triple Room manager:" + tripleroomManager);
		System.out.println("Manager:" + Manager);
	}
}

