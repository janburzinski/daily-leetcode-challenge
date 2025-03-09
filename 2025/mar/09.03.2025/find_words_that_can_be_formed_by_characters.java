import java.util.ArrayList;
import java.util.HashMap;

class Solution {
  public int countCharacters(String[] words, String chars) {
    int totalLength = 0;
    HashMap<String, Integer> charOccurances = new HashMap<>();

    // see which characters we even have avaialble
    for (String c : chars.split("")) {
      charOccurances.put(c, charOccurances.getOrDefault(c, 0) + 1);
    }

    // check what the word now needs
    for (String word : words) {
      if (canForm(word, new HashMap<String, Integer>(charOccurances))) {
        totalLength += word.length();
      }
    }

    return totalLength;
  }

  boolean canForm(String word, HashMap<String, Integer> charOccurances) {
    for (String c : word.split("")) {
      if (charOccurances.getOrDefault(c, 0) == 0)
        return false;
      charOccurances.put(c, charOccurances.getOrDefault(c, 0) - 1);
    }
    return true;
  }
}