#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
int *twoSum(int *nums, int numsSize, int target, int *returnSize)
{
  *returnSize = 2;
  int *returnNums = (int *)malloc((*returnSize) * sizeof(int));

  for (int i = 0; i < numsSize - 1; i++)
  {
    for (int j = i + 1; j < numsSize; j++)
    {
      if (nums[i] + nums[j] == target)
      {
        returnNums[0] = i;
        returnNums[1] = j;
        break;
      }
    }
  }

  return returnNums;
}

/**
 *
 * Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

___

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

___

Input: nums = [3,3], target = 6
Output: [0,1]

*/