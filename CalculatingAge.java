import java.text.*;
import java.time.*;
import java.util.*;
public class CalculatingAge {
	
	   public static void main(String args[]) throws ParseException {
	      //Reading name and date of birth from the user
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.nextLine();
	      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
	      String dob = sc.next();
	      //Converting String to Date
	      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	      Date date = formatter.parse(dob);
	      //Converting obtained Date object to LocalDate object
	      Instant instant = date.toInstant();
	      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
	      LocalDate givenDate = zone.toLocalDate();
	      //Calculating the difference between given date to current date.
	      Period period = Period.between(givenDate, LocalDate.now());
	      System.out.print("Hello "+name+" your current age is: ");
	      System.out.print(period.getYears()+" Years "+period.getMonths()+" Months and "+period.getDays()+" Days");
	   }
	}