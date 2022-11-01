package main;

import java.util.Scanner;

public class Hotel implements Runnable
{
	static Holder ob = new Holder();
	static Scanner sc = new Scanner(System.in);
	
	static SingleRoom managers = new SingleRoom();
	
	static void CustDetails(int i, int roomno)
	{
		String name, name2=null, name3=null;
		int contact, contact2=0, contact3=0;
		String gender, gender2=null, gender3=null;
		
		System.out.print("\nEnter customer name: ");
		name = sc.next();
		System.out.print("Enter contact number: ");
		contact = sc.nextInt();
		System.out.print("Enter gender: ");
		gender = sc.next();
		if (i < 5) 
		{
			System.out.print("Enter second customer name: ");
			name2 = sc.next();
			System.out.print("Enter contact number: ");
			contact2 = sc.nextInt();
			System.out.print("Enter gender: ");
			gender2 = sc.next();
			
			if(name.equalsIgnoreCase(name2))
			{
				System.out.println("!!!Duplicate customer name!!!");
			}
			
			if(i < 3) 
			{
				System.out.print("Enter third customer name: ");
				name3 = sc.next();
				System.out.print("Enter contact number: ");
				contact3 = sc.nextInt();
				System.out.print("Enter gender: ");
				gender3 = sc.next();
				
				if(name.equalsIgnoreCase(name3) || name2.equalsIgnoreCase(name3))
				{
					System.out.println("!!!Duplicate customer name!!!");
				}
			}
		}
		
		switch(i)
		{
		case 1:
			ob.luxury3[roomno] = new TripleRoom(name, contact, gender, name2, contact2, gender2, name3, contact3, gender3); 
			break;
		case 2:
			ob.deluxe3[roomno] = new TripleRoom(name, contact, gender, name2, contact2, gender2, name3, contact3, gender3);
			break;
		case 3:
			ob.luxury2[roomno] = new DoubleRoom(name, contact, gender, name2, contact2, gender2); 
			break;
		case 4:
			ob.deluxe2[roomno] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
			break;
		case 5:
			ob.luxury[roomno] = new SingleRoom(name, contact, gender);
			break;
		case 6:
			ob.deluxe[roomno] = new SingleRoom(name, contact, gender);
			break;
		default:
			System.out.println("Wrong option");
			break;	
		}
	}
	
	static void bookroom(int i)
	{
		int j;
		int roomno;
		
		System.out.println("\nChoose room number from : ");
		switch(i)
		{
		case 1: 
			for(j=0; j<ob.luxury3.length; j++)
			{
				if(ob.luxury3[j] == null)
				{
					System.out.print(j + 1 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno--;
				if(ob.luxury3[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		case 2: 
			for(j=0; j<ob.deluxe3.length; j++)
			{
				if(ob.deluxe3[j] == null)
				{
					System.out.print(j + 11 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno = roomno - 11;
				if(ob.deluxe3[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		case 3: 
			for(j=0; j<ob.luxury2.length; j++)
			{
				if(ob.luxury2[j] == null)
				{
					System.out.print(j + 31 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno = roomno - 31;;
				if(ob.luxury2[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		case 4: 
			for(j=0; j<ob.deluxe2.length; j++)
			{
				if(ob.deluxe2[j] == null)
				{
					System.out.print(j + 41 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno = roomno - 41;
				if(ob.deluxe2[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		case 5: 
			for(j=0; j<ob.luxury.length; j++)
			{
				if(ob.luxury[j] == null)
				{
					System.out.print(j + 61 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno = roomno - 61;
				if(ob.luxury[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		case 6: 
			for(j=0; j<ob.deluxe.length; j++)
			{
				if(ob.deluxe[j] == null)
				{
					System.out.print(j + 71 + ",");
				}
			}
			System.out.print("\nEnter room number: ");
			try
			{
				roomno = sc.nextInt();
				roomno = roomno - 71;
				if(ob.deluxe[roomno]!= null)
					throw new NotAvailable();
				CustDetails(i, roomno);
			}
			catch(Exception e)
			{
				System.out.println(e);
				return;
			}
			break;
			
		default:
			System.out.println("Enter valid option");
			break;	
		}
		System.out.println("Room Booked");
		
		//System.out.println("For any help, contact:\n Single Room manager:" + managers.singleroomManager); //private
		System.out.println("For any help, contact:\nDouble Room manager:" + managers.doubleroomManager);
		System.out.println("Triple Room manager:" + managers.tripleroomManager);
		System.out.println("Manager:" + managers.Manager);
	}
	
	static void features(int i) 
	{
		switch (i) 
		{
		case 1:
			System.out.println("Number of triple beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:6000 ");
			break;
		case 2:
			System.out.println("Number of triple beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:5000  ");
			break;
		case 3:
			System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
			break;
		case 4:
			System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
			break;
		case 5:
			System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2000  ");
			break;
		case 6:
			System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1000 ");
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
	}
	
	static void availability(int i) {
		int j, count = 0;
		switch (i) 
		{
		case 1:
			for (j = 0; j < ob.luxury3.length; j++) {
				if (ob.luxury3[j] == null)
					count++;
			}
			break;
			
		case 2:
			for (j = 0; j < ob.deluxe3.length; j++) {
				if (ob.deluxe3[j] == null)
					count++;
			}
			break;
			
		case 3:
			for (j = 0; j < ob.luxury2.length; j++) {
				if (ob.luxury2[j] == null)
					count++;
			}
			break;
			
		case 4:
			for (j = 0; j < ob.deluxe2.length; j++) {
				if (ob.deluxe2[j] == null)
					count++;
			}
			break;
			
		case 5:
			for (j = 0; j < ob.luxury.length; j++) {
				if (ob.luxury[j] == null)
					count++;
			}
			break;
			
		case 6:
			for (j = 0; j < ob.deluxe.length; j++) {
				if (ob.deluxe[j] == null)
					count++;
			}
			break;
			
		default:
			System.out.println("Enter valid option");
			break;
		}
		System.out.println("Number of rooms available : " + count);
	}
	
	static void getManagersList()
	{
		System.out.println("\nManager List 1:");
		main2.Manager m1 = new main2.Manager();
		System.out.println("\nManager List 2:");
		main2.Manager2 m2 = new main2.Manager2();
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		    System.out.println("Welcome to our Hotel");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	Thread t;
	
	Hotel()
	{
		t = new Thread(this);
		t.start();
	}
	
	
}
