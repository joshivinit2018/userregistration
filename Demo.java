import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String lname = "Joshi";
      String regex = "^[A-Z]{1}[a-z]{3,}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(lname);
      System.out.println("last name is: " + lname);
      System.out.println("Is the fname is valid? " + lname.matches(regex));
   }
}
