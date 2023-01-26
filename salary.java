import java.util.Scanner;

//Program to calculate in hand salary of  employee
//simple program

/*
  salary = user entered total salary 								100%
  tax = government tax on total salscary 							+	002% 
  ht = health insurance through company								3.5%
  homerent = home rent from total salary issued by company			010%
  inhand = inhand salary							
  
  				*
  				*
  				*
  				*
  				*    10
  				*   -----  = 0.10
  				*    100       
  				*
  				*
  				*
  				*
  				****
 */
public class salary {

	public static void main(String[] args) {
		
		System.out.println("Enter your Salary : ");
		Scanner s = new Scanner(System.in);
		double  salary = s.nextDouble();
		double tax = 0;
		tax = ((200/salary)*100);
		double inhand = salary-tax;
		System.out.print("Inhand Salary : "+inhand);
		System.out.println(" Rs.");
	}

}
