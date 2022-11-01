package main;

import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice1, choice2;
		char wantToContinue;
		
		SingleRoom obj = new SingleRoom();
		main2.Food ob = obj.newSingleRoom();
		
		DoubleRoom obj2 = new DoubleRoom();
		main2.Food ob2 = new DoubleRoom(obj2);
		
		main2.Food ob3 = new TripleRoom();
		
		new Hotel();
		
		x: do {
			
			System.out.println("\nEnter Your Choice :\n1.Show Room Details\n2.Show Room Availability \n3.Book Room\n4.Order food\n5.Show Managers List\n6.Quit\n");
			choice1 = sc.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("\nChoose Room Type :\n1.Luxury Triple Bedroom \n2.Deluxe Triple Bedroom \n3.Luxury Double Bedroom \n4.Deluxe Double Bedroom \n5.Luxury Single Bedroom \n6.Deluxe Single Bedroom \n");
				choice2 = sc.nextInt();
				Hotel.features(choice2);
				break;
			
			case 2:
				System.out.println("\nChoose Room Type :\n1.Luxury Triple Bedroom \n2.Deluxe Triple Bedroom \n3.Luxury Double Bedroom \n4.Deluxe Double Bedroom \n5.Luxury Single Bedroom \n6.Deluxe Single Bedroom \n");
				choice2 = sc.nextInt();
				Hotel.availability(choice2);
				break;
				
			case 3:
				System.out.println("\nChoose Room Type :\n1.Luxury Triple Bedroom \n2.Deluxe Triple Bedroom \n3.Luxury Double Bedroom \n4.Deluxe Double Bedroom \n5.Luxury Single Bedroom \n6.Deluxe Single Bedroom \n");
				choice2 = sc.nextInt();
				Hotel.bookroom(choice2);
				break;
				
			case 4:
				System.out.print("Room Number -");
				choice2 = sc.nextInt();
				if (choice2 > 90)
					System.out.println("Room doesn't exist");
				else if (choice2 > 70)
				{
					System.out.println("Ordering food for deluxe SingleRoom\n");
					ob.order();
				}	
				else if (choice2 > 60)
				{
					System.out.println("Ordering food for luxury SingleRoom\n");
					ob.order();
				}
				else if (choice2 > 40)
				{
					System.out.println("Ordering food for deluxe DoubleRoom\n");
					ob2.order();
				}	
				else if (choice2 > 30)
				{		
					System.out.println("Ordering food for luxury DoubleRoom\n");
					ob2.order();
				}
				else if (choice2 > 10)
				{
					System.out.println("Ordering food for deluxe TripleRoom\n");
					ob3.order();
				}	
				else if (choice2 > 0)
				{
					System.out.println("Ordering food for luxury TripleRoom\n");
					ob3.order();
				}
				else
					System.out.println("Room doesn't exist");
				break;
				
			case 5:
					Hotel.getManagersList();
					break;
				
			case 6:
				break x;
				
			default:
				System.out.println("Invalid Option !!!");
			}
			
			System.out.println("\nContinue : (y/n)");
			wantToContinue = sc.next().charAt(0);
		if (!(wantToContinue == 'y' || wantToContinue == 'Y' || wantToContinue == 'n'
				|| wantToContinue == 'N')) {
			System.out.println("Invalid Option");
			System.out.println("\nContinue : (y/n)");
			wantToContinue = sc.next().charAt(0);
		}

	} while (wantToContinue == 'y' || wantToContinue == 'Y');
		
	}


}
