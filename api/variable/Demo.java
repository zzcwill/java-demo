public class Demo {
  public static final String APP_NAME = "Demo";

  // 成员变量
  // 私有变量，仅在该类可见
  private int instanceVar;
  // 静态变量
  private static int staticVar;
  
  public void method(int paramVar) {
      // 局部变量
      int localVar = 4;
      
      // 使用变量
      instanceVar = 1;
      staticVar = 2;
      
      System.out.println("成员变量: " + instanceVar);
      System.out.println("静态变量: " + staticVar);
      System.out.println("参数变量: " + paramVar);
      System.out.println("局部变量: " + localVar);
  }
  
  public static void main(String[] args) {
      Demo v = new Demo();
      v.method(3);
  }
}
