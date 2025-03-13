class Solution {

  //
  // k > 0: replace the i^th nums with the next k numbers
  // => i+1>n = nextNum = code[0]
  //
  //
  // k < 0: replace the i^th nums with the previous k numbers
  // k = 0: replace the i^th nums with 0
  //
  // code is circular:
  // => we reach the **end** -> next element is code[0]
  // => we reach the **beginning** -> last element is code[n-1]
  //

  public int[] decrypt(int[] code, int k) {
    int numsToReplace = Math.abs(k);
    int[] sol = {};
    int n = code.length;

    if (k > 0) {
      for (int i = 0; i < n; i++) {
        int prevNum = (i - 1 < 0) ? code[n - 1] : code[i - 1]; // Falls i=0, nehme letztes Element
        int nextNum = (i + 1 >= n) ? code[0] : code[i + 1]; // Falls i=n-1, nehme erstes Element

        System.out.printf("prev num: %d; next num: %d; i: %d%n", prevNum, nextNum, i);
      }
    } else if (k < 0) {
      for (int i = 0; i < n; i++) {
        int nextNum;
        if (i - 1 < n) {
          nextNum = code[n - 1];
        } else {
          nextNum = code[i + 1];
        }
        System.out.printf("prev num: %d; nextNum: %d, i: %d", code[i - 1], nextNum, i);
      }
    } else {
      for (int i = 0; i < n; i++) {
        int nextNum = 0;
      }
    }

    return sol;
  }

  public int[] getNextNums(int[] code, int n) {
    return new int[] { 0 };
  }
}
