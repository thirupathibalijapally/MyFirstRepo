import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;



//  w w  w  . j a va  2  s .co  m
public class Main {
  public static void main(String args[]) {
    Random rnd = new Random();
    String firstname = "James";
    String lastname = "Bond";

    String result;

    result = Character.toString(firstname.charAt(0)); // First char
    if (lastname.length() > 5)
      result += lastname.substring(0, 5);
    else
      result += lastname;
    result += Integer.toString(rnd.nextInt(99));
    System.out.println(result);
    
 
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println(timestamp);
    System.out.println(timestamp.getTime());
    
	 //System.out.println(t);
  }
}
