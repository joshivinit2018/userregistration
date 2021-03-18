import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String fname = "Vinit";
      String regex = "^[A-Z]{1}[a-z]{3,}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(fname);
      System.out.println("first name is: " + fname);
      System.out.println("Is the fname is valid? " + fname.matches(regex));
   }
}
