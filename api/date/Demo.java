import java.util.Date;
import java.text.*;

public class Demo {
  public static void main(String[] args) {
    // 初始化 Date 对象
    Date date = new Date();

    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

    System.out.println("当前时间为: " + ft.format(date));    
  }
}
