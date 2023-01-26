import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("***This is Addition Program***");
		System.out.println("Enter 2 numbers : ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c =a+b;
		System.out.println("Addition : "+c);
	}

}
