import java.util.Scanner;
class arithmetic{


	void input()
	{
		System.out.print("Enter 2 Numbers :");
		Scanner myin = new Scanner(System.in);
		int a = myin.nextInt();
		int b = myin.nextInt();
	}




	
	void add()
	{
		int c = a+b;
		System.out.println("Addition = "+c);
	}

	void sub()
	{
		System.out.print("Enter 2 Numbers :");
		Scanner myin = new Scanner(System.in);
		int a = myin.nextInt();
		int b = myin.nextInt();

		int c = a-b;
		System.out.println("Substraction = "+c);
	}

	void div()
	{
		System.out.print("Enter 2 Numbers :");
		Scanner myin = new Scanner(System.in);
		int a = myin.nextInt();
		int b = myin.nextInt();

		int c = a/b;
		System.out.println("Division = "+c);
	}
	void mul()
	{
		System.out.print("Enter 2 Numbers :");
		Scanner myin = new Scanner(System.in);
		int a = myin.nextInt();
		int b = myin.nextInt();

		int c = a*b;
		System.out.println("Multiplication = "+c);
	}
}

class addtwo extends arithmetic
{
	void wel(){
		System.out.println("Welcome");
	}
	public static void main(String args[]){
		addtwo n1 = new addtwo();
		n1.wel();
		n1.add();
		n1.mul();
		n1.div();

	}
	
}
