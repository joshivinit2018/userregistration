import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String email = "abc.xyz@bl.co.in";
      String regex = ("^[a-z]{1,}[.]([a-z]*)[@][a-z]{1,}[.]"
											+ "[a-z]{1,}[.]([a-z]*)");
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(email);
      System.out.println("email is: " + email);
      System.out.println("Is the fname is valid? " + email.matches(regex));
   }
}
