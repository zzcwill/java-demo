// System.out.println 异步输出方法
// 下面c输出都一样

public class AbcNum {
  public static void main(String[] args) {
    Integer a = 10;
    Integer b = 2;
    Integer c = 0;

    c = a ++;
    System.out.println(a);
    System.out.println(c);

    c = -- b;
    System.out.println(b);
    System.out.println(c);
  }
}