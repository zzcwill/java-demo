// package java-demo.dataStructure;
import java.util.ArrayList;


public class Demo {
  public static void main(String[] args) {
    ArrayList<String> sites = new ArrayList<String>();
    sites.add("1");
    sites.add("2");
    sites.add("3");
    sites.add("4");
    sites.set(2, "zzc");
    sites.remove(3);
    System.out.println(sites);
    System.out.println(sites.size());
    System.out.println(sites.get(0));  
  }
}
