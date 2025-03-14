class Solution {
  public int strStr(String haystack, String needle) {
    // if haystack is smaller, needle cant be found
    if (haystack.length() < needle.length())
      return -1;
    // we go from the beginning of the string to the last possible index, where the
    // needle could be found
    // if the haystack is 10 chars long, and the needle 3, we would only go up to 7
    // for the last check
    // because that would be the last place where it would even be possible for the
    // string to be located
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}