//This is a stringBuffer example java program
import java.util.Scanner;
public class stringBufferexample
{
	public static void main(String[] args)
	{
		int count=0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str= sc.nextLine();
		int len= str.length();
		for(i=0;i<len;i++)
		{
			char ch= str.charAt(i);
			if((ch>='0')&&(ch<='9'))
			{
				count++;
			}	
		}
		System.out.println("Length of string : "+str.length());
		System.out.println("Numbers of numbers in string : "+count);
		count = len-count;
		System.out.println("Numbers of characters in string : "+count);
	}
}