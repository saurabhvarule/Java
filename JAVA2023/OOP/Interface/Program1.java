interface A {
  int x = 10;
  String name = new String("Saurabh");

}
interface B {
  int y = 20;
}

interface C {
  int z = 30;
}

class Extra {
  static int data = 4;
}

class Demo extends Extra implements A,B,C{
  public static void main(String[] args) {
    System.out.println(x);
    System.out.println(name);
    /*
    x = 20;
    name = "Harshal";
    */    // --Error : variables are final in interface
    System.out.println(y);
    System.out.println(z);
    System.out.println(data);
    

  } 
}