class details{
	void bill(int a, int b){
		int rate = a;
		int d= b;
		System.out.print("Enter your Name : ");	
		Scanner sb = new Scanner(System.in);		
		String name = sb.nextLine();
		System.out.print("Enter your Mail-Id : ");
		Scanner sc = new Scanner(System.in);		
		String mail = sc.nextLine();
		System.out.print("Enter mobile number : ");
		int mo = sc.nextInt();
		System.out.print("Enter number of passangers : ");
		int n = sc.nextInt();
		int total = n*rate;
		System.out.println("Your Total Bill : "+total);
		System.out.println("\nSelect Payment Method");
		System.out.println("1. NetBanking (100 Rs. Discount)");
		System.out.println("2. Offline");
		int ch1 = sc.nextInt();
		switch(ch1){
			case 1:
				total=total-100;
				System.out.println("\nYour Total Bill (Including Discount): "+total+" Rs.");
				System.out.print("Enter your card number : ");
				int cno = sc.nextInt();
				if(cno==1234567890)
				{
					System.out.print("Enter PIN : ");
					int cpin = sc.nextInt();
					if(cpin==12345)
					{
						System.out.println("\n\nPayment Succcesful!");
					
						System.out.println("\n\n***************  RECIEPT   ***************\nPASSANGER NAME : "+name+"\nMOBILE NO.: "+mo+"\nEMAIL-ID : "+mail+"\nFrom : Mumbai");
						switch(d){
							case 1:
							System.out.println("To : Delhi");
							break;
							case 2:
							System.out.println("To : Kolkatta");
							break;
							case 3:
							System.out.println("To : Chennai");
							break;
							case 4:
							System.out.println("To : Hyderabad");
							break;							
						}
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");   
						LocalDateTime now = LocalDateTime.now();  
						  
						System.out.println("\n\nYour Flight is Booked...\nBooking time : "+dtf.format(now)+"!\nWe have mailed your tickets on "+mail+"\nThank Your For Traveling with Indian Airline!\n");
					}
					else{
						System.out.println("Invalid PIN!");
					}
				}
				else{
					System.out.println("Invalid Card Number!");
				}
				break;
			case 2:
				
				
				System.out.println("\n***************  RECIEPT   ***************\nPASSANGER NAME : "+name+"\nMOBILE NO.: "+mo+"\nEMAIL-ID : "+mail+"\nFrom : Mumbai");
				switch(d){
							case 1:
							System.out.println("To : Delhi");
							break;
							case 2:
							System.out.println("To : Kolkatta");
							break;
							case 3:
							System.out.println("To : Chennai");
							break;
							case 4:
							System.out.println("To : Hyderabad");
							break;
				}	
				System.out.println("\n\nPrint this reciept & Pay Cash at Counter!\nThank Your For Traveling with Indian Airline!");






				break;
			default:
				System.out.println("Invalid Choice");
		}
}
	

	
}

class Booking extends details{
	public static void main(String args[]){
		System.out.println("\n***Welcome to Indian Airline***\n");

		System.out.println("Flihgts currentle available : ");
		System.out.println("1. Flight A8 (Mumbai to Delhi) 	   [Time: 08:00AM  Ticket: 9800 Rs. ]");
		System.out.println("2. Flight A9 (Mumbai to Kolkatta)  [Time: 08:30AM  Ticket: 11400 Rs.]");
		System.out.println("3. Flight B4 (Mumbai to Chennai)   [Time: 09:00AM  Ticket: 19800 Rs.]");
		System.out.println("4. Flight C9 (Mumbai to Hyderabad) [Time: 10:00AM  Ticket: 29800 Rs.]");
		System.out.print("\nSelect Flight : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		System.out.print("\n");
		details d1 = new details();

		switch(ch){
			case 1:
				System.out.println("You choosed Flight A8 (Mumbai to Delhi) : ");	
				d1.bill(9800,1); 
				break;
			case 2:
				System.out.println("You choosed Flight A9 (Mumbai to Kolkatta) : ");	
				d1.bill(11400,2); 
				break;
		
			case 3:
				System.out.println("You choosed Flight B4 (Mumbai to Chennai) : ");	
				d1.bill(19800,3); 
				break;
		
			case 4:
				System.out.println("You choosed Flight C9 (Mumbai to Hyderabad) : ");	
				d1.bill(29800,4); 
				break;

			default :
				System.out.println("Invalid Choice!");
		}



	}
}