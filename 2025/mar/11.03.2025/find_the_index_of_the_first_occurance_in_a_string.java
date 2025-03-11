class Solution {
  public int strStr(String haystack, String needle) {
    // check if the length of the haystack is shorter than the length of the needle
    // because if so, it would be impossible to find the needle in the haystack
    if (haystack.length() < needle.length())
      return -1;

    // loop from the beginning of the haystack to the point
    // where the remaining string is atleast as long as the needle
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) // i + needle.length(), da wir so z.B.
                                                                     // substring(2,2+2=4)
        return i;
    }
    return -1;
  }
}
