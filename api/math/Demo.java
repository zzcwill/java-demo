// package java-demo.math;

public class Demo {
  private static void test(double num) {   
    System.out.println("Math.floor(" + num + ")=" + Math.floor(num));   
    System.out.println("Math.round(" + num + ")=" + Math.round(num));   
    System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));   
  }

  public static void main(String[] args) {   
    double[] nums = { 1.4, 1.5 };   
    for (double num : nums) {   
      test(num);   
    }   
  }   
}
