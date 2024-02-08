import java.util.*;

public class StringSort {
  

  // this method can sort whole string in alphabetcal order
  public String sortInAlphabeticalOrder(String str1) {
    str1 = str1.replaceAll("\\s+", "");
    char[] words = str1.toCharArray();
    Arrays.sort(words);
    return new String(words);

  }
  // this is another method which can sort each word present in string in alphabetical order
  public String sortEachWordInAlphabeticalOrder(String str1) {
    String[] words = str1.split("\\s+");
    for(int i=0; i<words.length; i++) {
      char[] carr = words[i].toCharArray();
      Arrays.sort(carr);
      words[i] = new String(carr);
    }
    String retVal = "";
    for(String word : words) {
        retVal = retVal + word + " ";
    }
    return retVal.trim();
  }

  // this is another way of solving same question using library functions
  // where i used Arrays.sort() method and also used Comparator.comapairingInt() method 
  //to sort the string by the length of each word in ascending order
  public String sortStringByWordLength(String str1) {
    String[] words = str1.split("\\s+");
    Arrays.sort(words,Comparator.comparingInt(String :: length));
    String retVal = "";
    for(String sortWords : words) {
      retVal = retVal +sortWords + " ";
    }
    return retVal.trim();
  }

  // the below methhod is my sorting method where i used insertion sort according to the length of each word present in the string
  public String sort(String str1) {
   // str1 = str1.replaceAll("\\s+", " ");
    String[] sarr = str1.split("\\s+");

    for(int i=1;i<sarr.length; i++) {
      int j;
      String key = sarr[i];
      for(j = i-1; j>=0 && sarr[j].length() > key.length() ; j--) {
        sarr[j+1] = sarr[j];
      }
      sarr[j+1] = key;
    }

   // System.out.print(sarr.length+" \n");
    String str2 = "";
    for (String word : sarr) {
      str2 = str2+word+" ";
    }
    return str2.trim();
  }
  public static void main(String[] args) {

    String str1 = "hello hi this is    saurabh good to   know   you you are a good person";
    System.out.println(str1);
    StringSort obj = new StringSort();
    System.out.println(obj.sort(str1));
    System.out.println(obj.sortStringByWordLength(str1));
    System.out.println(obj.sortEachWordInAlphabeticalOrder(str1));
    System.out.println(obj.sortInAlphabeticalOrder(str1));

  }
}
