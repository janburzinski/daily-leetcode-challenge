import java.util.HashMap;

class Solution {

  // anagram is a word formed by rearranging already existing letters in a word

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    HashMap<Character, Integer> count = new HashMap<>();

    for (int i = 0; i < s.length(); i++)
      count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);

    for (int k = 0; k < t.length(); k++) {
      char key = t.charAt(k);
      if (!count.containsKey(key) || count.get(key) == 0) {
             return false;
      }

      count.put(key, count.get(key) - 1);
    }

    return true;
  }
}