//package JAVA2023.Pattern.Test.Assignment;

/*
   1
  123
 12345
1234567
      1
     123
    12345
   1234567l
 */

public class Program1 {
  public static void main(String[] args) {
    int row = 4;
    for(int i=0; i<row; i++) {
      int num = 1;
      for(int j=0; j<row-(i+1); j++) {
        System.out.print(" ");
      }
      for(int k=0; k<(2*i)+1; k++) {
        System.out.print(num++);
      }
      System.out.println();
    }
    for(int i=0;i<row;i++) {
      int num = 1;
      for(int j=0; j<(2*row-1)-(i+1); j++) {
          System.out.print(" ");
      }
      for(int k=0; k<(2*i)+1; k++) {
        System.out.print(num++);
      }
      System.out.println();
    }
  }
}
