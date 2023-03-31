// package java-demo.char;

public class Demo {
  public static void main(String[] args) {
    String name = "demo";
    System.out.println(name.length());

    // 字符数组
    char[] strArr = { 'a', '1' };

    for (char str : strArr) {
      System.out.println(Character.isLetter(str));
      System.out.println(Character.isDigit(str));
      System.out.println("------");
    }
  }
}
