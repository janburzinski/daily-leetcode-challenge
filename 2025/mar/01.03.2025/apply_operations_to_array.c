#include <stdio.h>
#include <stdlib.h>

/**
 * You are given a 0-indexed array nums of size n consisting of non-negative integers.

You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:

If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
After performing all the operations, shift all the 0's to the end of the array.

For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
 */

void print_array(int *arr, int arr_size)
{
  for (int i = 0; i < arr_size; i++)
    printf("[%d] %d\n", i, arr[i]);
  printf("\n");
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *applyOperations(int *nums, int numsSize, int *returnSize)
{
  *returnSize = numsSize;
  int *resNums = (int *)calloc((*returnSize), sizeof(int));
  if (resNums == NULL)
    return NULL;

  memcpy(resNums, nums, (*returnSize) * sizeof(int));

  // check for existing duplicates
  for (int i = 0; i < numsSize - 1; i++)
  {
    // we have a duplicate
    if (resNums[i] == resNums[i + 1])
    {
      resNums[i] *= 2;
      resNums[i + 1] = 0;
    }
  }

  // DEBUG hihi
  printf("davor:\n");
  print_array(resNums, numsSize);

  // move the 0's to the back of the array
  for (int k = 0; k < numsSize; k++)
  {
    // we have found a 0 we need to move
    if (resNums[k] == 0 && k < numsSize - 1)
    {
      // swap
      int temp = resNums[k];
      resNums[k] = resNums[k + 1];
      resNums[k + 1] = temp;
    }
  }

  printf("danach: \n");
  print_array(resNums, numsSize);

  return resNums;
}