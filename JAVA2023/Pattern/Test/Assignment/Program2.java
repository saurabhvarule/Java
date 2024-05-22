//package JAVA2023.Pattern.Test.Assignment;
/*

9 8 7 6 5
 8 7 6 5
  7 6 5
   6 5
    5
   5 6
  5 6 7
 5 6 7 8
5 6 7 8 9

 */



public class Program2 {
  public static void main(String[] args) {
    int row = 5;
    int num = 0;
    for(int i=0; i<row; i++) {
      num = (row*2) - (i+1);
      for(int j=0; j<i; j++) {
        System.out.print(" ");
      }
      for(int k=0; k<row-i; k++) {
        System.out.print(num-- + " ");
      }
      System.out.println();
    }
    for(int i=1;i<row;i++) {
      num = row;
      for(int j=0; j<row-(i+1); j++) {
          System.out.print(" ");
      }
      for(int k=1; k<=i+1; k++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
  }
}
