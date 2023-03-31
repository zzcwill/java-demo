import java.util.regex.*;

public class Demo {
  public static void main(String[] args){
    String content = "I am i";
    String content2 = "I am zzc";

    String pattern = ".*zzc.*";

    boolean isMatch = Pattern.matches(pattern, content);
    boolean isMatch2 = Pattern.matches(pattern, content2);
    System.out.println(isMatch);
    System.out.println(isMatch2);
 }  
}
