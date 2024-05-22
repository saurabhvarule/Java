//package JAVA2023.Pattern.Test.Assignment;

/*
   1
  121
 12321
1234321
      1234321
       12321
        121
         1
 */

 class Program3 {
  public static void main(String[] args) {
    int row = 4;
    for(int i=0; i<row; i++) {
      int num = 1;
      for(int j=0; j<row-(i+1); j++) {
        System.out.print(" ");
      }
      for(int k=0; k<(2*i)+1; k++) {
        System.out.print(num);
        if(k>=i) {
          num--;
        } else {
          num++;
        }
      }
      System.out.println();
    }

    for(int i=0;i<row;i++) {
      int num = 1;
      for(int j=0; j<(2*row-2) + i; j++) {
          System.out.print(" ");
      }
      for(int k=0; k < (2*row) - (2*i+1); k++) {
        System.out.print(num);
        if(k >= row-(i+1)) {
          num--;
        } else {
          num++;
        }
      }
      System.out.println();
    }
  }
}
