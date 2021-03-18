import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String pwd1 = "Vintax77";
      String regex = ("[a-zA-Z0-9]{8,}");
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(pwd1);
      System.out.println("pwassward 1 rule is is: " + pwd1);
      System.out.println("Is the fname is valid? " + pwd1.matches(regex));
   }
}
