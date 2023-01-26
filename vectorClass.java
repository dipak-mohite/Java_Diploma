import java.util.*;
import java.util.Scanner;
public class vectorClass {
	
	public static void main(String[] args) {
		Vector v = new Vector();	
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		v.add(new Integer(40));
		v.add(new Integer(50));
		v.add(new Integer(60));
		System.out.println("Size of Vector Before removing element : "+v.size());
		System.out.print("Elements in Vector Before removing element :");
		for(int j = 0;j<v.size();j++)
		{
			System.out.print("\t"+v.elementAt(j));
		}
		System.out.print("\n\nEnter location to remove element : ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		v.removeElementAt(i);
		System.out.print("\nElements in Vector After removing element :");
		for(int j = 0;j<v.size();j++)
		{
			System.out.print("\t"+v.elementAt(j));
		}
		System.out.println("\nSize of Vector After removing element: "+v.size());		
		
	}
}
