
class Solution {
  //
  // example:
  //
  // nums1[1,2,3,0,0,0]
  //
  // nums2[2,5,6]
  //
  // solution: [1,2,2,3,5,6]
  //

  // ### using arrays.sort ###
  // time complexity: O((m+n)log(m+n)) => this is caused by the Arrays.sort
  // function
  // space compelxity: O(1) => since we dont allocate any new memory

  public void merge(int[] nums1, int nums1Size, int[] nums2, int nums2Size) {
    // merge both arrays
    for (int i = 0; i < nums2Size; i++) {
      System.out.printf("nums1[end + i]: %d, nums2[i]: %d", nums1[nums1Size + i], nums2[i]);
      nums1[nums1Size + i] = nums2[i];
    }

    Arrays.sort(nums1);
  }
}