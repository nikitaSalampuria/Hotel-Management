package main;

public class DoubleRoom extends SingleRoom 
{
	String name2;
	int contact2;
	String gender2;
	
	DoubleRoom()
	{
		super();
		this.name2 = "New2";
	}
	
	DoubleRoom(String name, int contact, String gender, String name2, int contact2, String gender2)
	{
		super(name,contact,gender);
		this.name2 = name2;
		this.contact2 = contact2;
		this.gender2 = gender2;
	}
	
	DoubleRoom(DoubleRoom ob)
	{
		this.name = ob.name;
		this.contact = ob.contact;
		this.gender = ob.gender;
		this.name2 = ob.name2;
		this.contact2 = ob.contact2;
		this.gender2 = ob.gender2;
	}
	public void order()
	{
		System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
	
		//System.out.println("For any help, contact:\n Single Room manager:" + singleroomManager);  //private
		System.out.println("For any help, contact:\nDouble Room manager:" + doubleroomManager);
		System.out.println("Triple Room manager:" + tripleroomManager);
		System.out.println("Manager:" + Manager);
	}
}

