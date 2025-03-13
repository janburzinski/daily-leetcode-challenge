import java.util.ArrayList;

class Solution {
  public boolean isCircularSentence(String sentence) {
    String[] sentenceParts = sentence.split(" ");
    int parts = sentenceParts.length;

    char lastChar = sentenceParts[parts - 1].charAt(sentenceParts[parts - 1].length() - 1);

    for (int i = 0; i < parts; i++) {
      if (sentenceParts[i].charAt(0) != lastChar)
        return false;
      lastChar = sentenceParts[i].charAt(sentenceParts[i].length() - 1);
    }

    return true;
  }
}