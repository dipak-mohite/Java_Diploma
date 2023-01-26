import java.util.Scanner;

 class operations  {
	 static void add(int n, int m)
	 {
		int x = n+m;
		System.out.println("Addition is "+x);
	 }
	 static void sub(int n, int m)
	 {
		int x = n-m;
		System.out.println("Substraction is "+x);
	 }
	 static void mul(int n, int m)
	 {
		int x = n*m;
		System.out.println("Multiplication is "+x);
	 }
	 static void div(int n, int m)
	 {
		int x = n/m;
		System.out.println("Division is "+x);
	 }	
}



public class arithmetic extends operations {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Welcome to Calculator");
		//getting numbers inputs
		
		int i=1;
		do {
			System.out.println("Enter 2 numbers");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			//testing inputs
			System.out.println("You entered = "+a+", "+b);
			//menu bar
			System.out.println("\n********Menu*********\n1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division");
			
			//user choice
			System.out.println("Enter operation to be perform");
			int ch = sc.nextInt();
		
		//switch case
		switch(ch) {
		
		case 1 :
			add(a,b);
			break;
		case 2 :
			sub(a,b);
			break;
		case 3 :
			mul(a,b);
			break;
		case 4 :
			div(a,b);
			break;
		default :
			break;
			
		}
		System.out.println("Press 1 for continue...\nor Press Any Other key for Exit ");
		i = sc.nextInt();
		}while(i==1);
		
	}

}



















