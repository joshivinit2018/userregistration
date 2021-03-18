import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String pwd2 = "Vintax77";
      String regex = ("(?=.*[A-Z])[a-zA-Z0-9]{8,}");
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(pwd2);
      System.out.println("pwasward 1 rule is is: " + pwd2);
      System.out.println("Is the fname is valid? " + pwd2.matches(regex));
   }
}
