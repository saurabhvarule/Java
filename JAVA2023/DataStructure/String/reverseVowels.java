

class reverseVowels {
  static boolean isVowel(char ch) {
    char[] vowels = {'a','e','i','o','u'};
    for(int i=0; i<vowels.length; i++) {
        if(ch == vowels[i] || ch+32 == vowels[i]) {
            System.out.println(vowels[i]);
            return true;
        }
    }
    return false;
  } 
  public static void main(String[] args) {
    String s = "hello";
    char[] alphabets = s.toCharArray();
    int i = 0;
    int j = s.length()-1;
    while(i>j) {
        boolean resultI = isVowel(alphabets[i]);
        boolean resultJ = isVowel(alphabets[j]);
        System.out.println(resultI);
        System.out.println(resultJ);
        if(resultI == true && resultJ == true) {
            char temp = alphabets[i];
            alphabets[i] = alphabets[j];
            alphabets[j] = temp;
            i++;
            j--;
        }
        if(resultI == false) {
            i++;
        }
        if(resultJ == false) {
            j--;
        }
    }
    System.out.println(new String(alphabets));
  }  
}
