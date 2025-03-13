import java.util.HashMap;

class Solution {
  public char findTheDifference(String s, String t) {
    HashMap<Character, Integer> count = new HashMap<Character, Integer>();

    for (int i = 0; i < s.length(); i++) {
      count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int j = 0; j < t.length(); j++) {
      char c = t.charAt(j);
      count.put(c, count.getOrDefault(c, 0) - 1);
      if (count.get(c) == -1)
        return c;
    }

    return '\0';
  }
}