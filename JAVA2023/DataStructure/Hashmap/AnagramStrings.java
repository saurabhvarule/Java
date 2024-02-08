import java.util.*;
import java.io.*;

class Anagram {
  public static boolean isAnagramUsinOneMap(String name1, String name2) {
    Map<Character,Integer> m1 = new HashMap<Character,Integer>();
    int i =0;
    while(i<name1.length()) {
      if(m1.containsKey(name1.charAt(i))) {
        int val = m1.get(name1.charAt(i));
        m1.put(name1.charAt(i),val+1);
      } else {
        m1.put(name1.charAt(i), 1);
      }
      i++;
    }
    i=0;
    while (i<name1.length()) {
      if (m1.containsKey(name2.charAt(i))) {
        int val = m1.get(name2.charAt(i));
        m1.put(name2.charAt(i), val-1);
      } else {
        return false;
      }
      i++;
    }
    Set<Map.Entry<Character,Integer>> data = m1.entrySet();
    Iterator<Map.Entry<Character,Integer>> itr = data.iterator();
    while(itr.hasNext()) {
      Map.Entry entry = itr.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
      if((int)entry.getValue() == 0) {
        continue;
      } else {
        return false;
      }
    }
    
    return true;

  }
  public static boolean isAnagram(String name1, String name2) {
    if(name1.length() != name2.length()) {
      return false;
    }
 
    Map<Character,Integer> m1 = new HashMap<>();
    Map<Character,Integer> m2 = new HashMap<>();
    int i=0;
    while(i<name1.length()) {
      if(m1.containsKey(name1.charAt(i))){

        int x = m1.get(name1.charAt(i));
        m1.put(name1.charAt(i), x+1);

      }else{
        m1.put(name1.charAt(i), 1);
      }

      if(m2.containsKey(name2.charAt(i))){
        int x = m2.get(name2.charAt(i));
        m2.put(name2.charAt(i), x+1);

      }else{
        m2.put(name2.charAt(i), 1);
      }
      i++;
    }
    System.out.println(m1);
    return m1.equals(m2);
  }
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    String name1 = "";
    String name2 = "";

    try {
      System.out.println("Enter name 1:");
      name1 = br.readLine();
      System.out.println("Enter name 1:");
      name2 = br.readLine();
    } catch (IOException ie) {

    }

    if(isAnagramUsinOneMap(name1,name2)) {

      System.out.println("These Strings " + name1 + " & " + name2 + " are Anagram" );

    } else {
      System.out.println("These Strings " + name1 + " & " + name2 + " are not Anagram" );
    }

  }
}