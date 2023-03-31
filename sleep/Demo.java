import java.util.*;
import java.text.*;

public class Demo {
  public static void getTime() {
    // 初始化 Date 对象
    Date date = new Date();

    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

    System.out.println(ft.format(date));    
  }

  public static void main(String[] args) {
    try {
      getTime();
      Thread.sleep(1000 * 3); // 休眠3秒
      getTime();
    } catch (Exception e) {
      System.out.println("Got an exception!");
    }
  }
}
