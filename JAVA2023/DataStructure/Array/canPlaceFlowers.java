/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length 

*/

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int count = 0;
      int tmpN = n;
      for(int i=0; i<flowerbed.length; i++) {
          if(flowerbed[i] == 1 ) {
              count++;
          }
      }
      boolean flag1 = false;
      boolean flag2 = false;

      if(count>0 && n>0) {
          int i;
          if(flowerbed[0] == 0 && flowerbed[1] == 0) {
              flowerbed[0] = 1;
              n--;
          }
          for(i=1; i<flowerbed.length-1 && n>0; i++) {
              if(i % 2 == 0 && flowerbed[i] == 1) {
                  flag1 = true;
              }
              if(i % 2 != 0 && flowerbed[i] == 1) {
                  flag2 = true;
              }
              if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                  flowerbed[i] = 1;
                  n--;
              }        
          }
          if(n>0 && flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2]==0) {
              flowerbed[i] = 1;
              n--;
          }
      }
      System.out.println(n);
      int length = flowerbed.length;
      if(length%2!=0) {
          length++;
      }
      length /= 2;

      if(n == 0) {
          return true;
      } else if(tmpN<=length-count && flag1 == false && flag2 == false) {
          return true;
      }else {
          return false;
      }
  }
}
