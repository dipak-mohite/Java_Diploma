import java.lang.*;
class SringDemo
{
 public static void main(String args[])
 {
   String str1= new String("Osmanabad");
   String str2 = "Latur";
   String str3 = "Latur";
   System.out.println("Lower Case :"+str2.toLowerCase());
   System.out.println("Upper Case :"+str2.toUpperCase());

  
   System.out.println("Replacement :"+str2.replace('a','x'));
   System.out.println("Substring :"+str1.substring(3,7));
   System.out.println("Substring :"+str1.substring(3));
  
  
  System.out.println("Compare :"+str1.compareTo(str2));
  System.out.println("String equals :"+str1.equals(str2));
  System.out.println("String equals :"+str2.equals(str3));
   
   System.out.println("Concating :"+str1.concat(str2));
  
   
 }
}