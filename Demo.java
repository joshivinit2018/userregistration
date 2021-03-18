import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String phone = "91 7588111280";
      String regex = ("^[0-9]{2}\\s[0-9]{10}$");
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(phone);
      System.out.println("email is: " + phone);
      System.out.println("Is the fname is valid? " + phone.matches(regex));
   }
}
