// package java-demo.statistics;
import java.util.*;
import java.text.*;

public class Demo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
 
    IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
     
    System.out.println("列表中最大的数 : " + stats.getMax());
    System.out.println("列表中最小的数 : " + stats.getMin());
    System.out.println("所有数之和 : " + stats.getSum());
    System.out.println("平均数 : " + decimalFormat.format(stats.getAverage()));    
  }
}
