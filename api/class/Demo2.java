class Animal { 
  private String name;  
  private int id; 
  public Animal(String myName, int myid) { 
      name = myName; 
      id = myid;
  } 
  public void eat(){ 
      System.out.println(name+"正在吃"); 
  }
  public void sleep(){
      System.out.println(name+"正在睡");
  }
  public void introduction() { 
      System.out.println("我是" + id + "号" + name); 
  } 
}

class Penguin extends Animal { 
  public Penguin(String myName, int myid) { 
      super(myName, myid); 
  } 
}

public class Demo2{
  public static void main(String[] args){
    Penguin myPenguin = new Penguin( "小鱼", 1 );
    myPenguin.eat();
    myPenguin.sleep();
    myPenguin.introduction();
  }
}