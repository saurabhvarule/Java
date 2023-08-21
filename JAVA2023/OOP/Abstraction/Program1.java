abstract class Parent {
  static int x = 10;
  abstract void m1();

  void m2(){
      System.out.println("In m2");
  }
}

class Child extends Parent {
  void m1() {
      System.out.println("In child m1");

  }
  int x = 30;
  public static void main(String[] args) {
      Parent obj1 = new Child();
      Child obj2 = new Child();
      obj1.m1();
      obj2.m2();
      System.out.println(obj1.x);
      obj1.x = 20;
      System.out.println(obj1.x);  
      System.out.println(obj2.x);  


  } 
}