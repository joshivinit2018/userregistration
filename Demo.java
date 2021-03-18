  
import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String pwd3 = "Joshi@72";
      String regex = "(?=[^#?!@$%^&*-]*[#?!@$%^&*-][^#?!@$%^&*-]*$)(?=.*[A-Z])(?=.*[0-9]).{8,}";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(pwd3);
      System.out.println("pass 3rd rule  is: " + pwd3);
      System.out.println("Is the pwd is valid? " + pwd3.matches(regex));
   }
}
