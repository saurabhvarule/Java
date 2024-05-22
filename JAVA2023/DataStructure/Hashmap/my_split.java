public class my_split {
  public static int countWords(String str1, char target) {
    int count = 0;
    int i=0;
    while(i<str1.length()-1) {
      if(str1.charAt(i) == target && str1.charAt(i+1) != target) {
        count++;
        i++;
      }
      i++;
    }

    return count+1;
  }
  public static String[] mySplit(String str1, char target) {
    int size = countWords(str1,target);
    String[] words = new String[size];
    int i=0;
    int count=0;
    String temp = ""; 
    int strlength = str1.length();
    while(i<strlength) {
      if(str1.charAt(i)!= target) {  
        temp = temp + str1.charAt(i);
        if(i == strlength-1) {
          words[count] = temp;
          break;
        }
      } else if(str1.charAt(i+1)!=target ) { 
        words[count++] = temp;
        temp = "";
      }
      i++;
    }
    return words;
  }
  public static void main(String[] args) {
    String str1 = "this is my first example to     split a     string using my own function";
    String[] words = mySplit(str1,' ');
    for(String data : words) {
      System.out.print(data + " ");
    }
  }
}