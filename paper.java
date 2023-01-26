import java.util.Scanner;

public class paper {

	public static void main(String[] args) {
		System.out.println("Best of luck for exam...!");
		System.out.println("Press 1 for Start Exam");
		System.out.println("Press 2 for Go Back");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1)
		{
			System.out.println("Exam started...");
			int marks=0;
			int an;
			//question 
			System.out.println("Q.1. What is result of 1+2?");
			System.out.println("1) 4\n2) 5\n3) 3\n4) 2");
			an = sc.nextInt();
			if(an==3)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.2. What is result of 65+2?");
			System.out.println("1) 78\n2) 67\n3) 76\n4) 87");
			an = sc.nextInt();
			if(an==2)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.3. What is result of 80-60?");
			System.out.println("1) 40\n2) 50\n3) 30\n4) 20");
			an = sc.nextInt();
			if(an==4)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.4. What is result of 4*5?");
			System.out.println("1) 20\n2) 16\n3) 13\n4) 16");
			an = sc.nextInt();
			if(an==1)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.5. Who is the Prime Minister of india?");
			System.out.println("1) Rahul Gandhi\n2) Ramnat Kovind\n3) Narendra Modi\n4) Amit Shah");
			an = sc.nextInt();
			if(an==3)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.6. Which city is the capital of INDIA?");
			System.out.println("1) Hydrabad\n2) Delhi\n3) Kolkatta\n4) Mumbai");
			an = sc.nextInt();
			if(an==2)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.7. Which city is the capital of Maharashtra State?");
			System.out.println("1) Kolhapur\n2) Pune\n3) Nagpur\n4) Mumbai");
			an = sc.nextInt();
			if(an==4)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.8. What is result of 89-56?");
			System.out.println("1) 13\n2) 43\n3) 33\n4) 23");
			an = sc.nextInt();
			if(an==3)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.9. What is result of 11+22?");
			System.out.println("1) 13\n2) 43\n3) 23\n4) 33");
			an = sc.nextInt();
			if(an==4)
			{
				 marks = marks+10;
			}
			//question 
			System.out.println("Q.10. What is result of 9*9*9?");
			System.out.println("1) 729\n2) 981\n3) 636\n4) 856");
			an = sc.nextInt();
			if(an==1)
			{
				 marks = marks+10;
			}
			if(marks>35)
			{
				System.out.println("Congrats! RESULT : PASS");		
				System.out.println("and Your Total Score is "+marks+" out of 100");
				
			}
			else
			{
			System.out.println("RESULT : PASS\nYour Total Score is "+marks+" out of 100");
			}
		}
		else
		{
			System.out.println("You have cancelled exam\nThank You!");
		}
	}

}
