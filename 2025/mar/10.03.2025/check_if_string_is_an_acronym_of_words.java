import java.util.List;

class Solution {
  public boolean isAcronym(List<String> words, String s) {
    StringBuilder a = new StringBuilder(); // save the first letter of each word

    for (String word : words) {
      String firstChar = String.valueOf(word.charAt(0));
      a.append(firstChar);
      System.out.printf("%s - %s\n", word, firstChar);
    }

    System.out.printf("a stringbuilder: %s\n", a.toString());

    return a.toString().equals(s);
  }
}
