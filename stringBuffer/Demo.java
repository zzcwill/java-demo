// package java-demo.stringBuffer;

public class Demo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(10);
    sb.append("js");
    System.out.println(sb);  
    sb.append(" is ");
    System.out.println(sb); 
    sb.insert(6, "weblan");
    System.out.println(sb); 
    sb.delete(6,9);
    System.out.println(sb);      
  }
}
