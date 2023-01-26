import java.util.Scanner;  
public class MiniBankingSystem  
{  
    public static void main(String args[] )  
    {  
        int balance = 100000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);             
        while(true)  
        {    
	    System.out.println("Welcome to Mini Banking System");              
            System.out.println("1. Withdraw");  
            System.out.println("2. Deposit");  
            System.out.println("3. Check Balance");  
            System.out.println("4. EXIT");  
            System.out.print("Choose the operation to perform:"); 
            int choice = sc.nextInt();  
            switch(choice)  
            {  
      	 	case 1:  
       		System.out.print("Enter money to be withdrawn:");  
        withdraw = sc.nextInt();  
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
        case 2:  
        System.out.print("Enter money to be deposited  :  "); 
        deposit = sc.nextInt();  
        balance = balance + deposit;  
        System.out.println("Money successfully depsited");  
        System.out.println("");  
        break;  
        case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
        case 4:  
        System.exit(0);  
        default :
        System.out.println("Invalid Choice! Please Re-Try\n");
            }        
        }  
    }  
}
