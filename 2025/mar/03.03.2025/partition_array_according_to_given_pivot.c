#include <stdio.h>
#include <stdlib.h>

// elements on the left of the pivot: smaller
// elements equal to the pivot: in between
// elements on the right of the pivot: bigger
// elements need to stay in relative order

void print_array(int *arr, int arrNums)
{
  for (int i = 0; i < arrNums; i++)
    printf("[%d] %d\n", i, arr[i]);
  printf("\n");
}

int *pivotArray(int *nums, int numsSize, int pivot, int *returnSize)
{
  // allocating arrays
  *returnSize = numsSize;

  int *resultNums = (int *)calloc((*returnSize), sizeof(int));
  if (resultNums == NULL)
    return NULL;

  int *smallerNums = (int *)calloc((*returnSize), sizeof(int));
  int smallerNumsSize = sizeof(smallerNums) / sizeof(smallerNums[0]);
  if (smallerNums == NULL)
    return NULL;

  int *pivotNums = (int *)calloc((*returnSize), sizeof(int));
  int pivotNumsSize = sizeof(pivotNums) / sizeof(pivotNums[0]);
  if (pivotNums == NULL)
    return NULL;

  int *biggerNums = (int *)calloc((*returnSize), sizeof(int));
  int biggerNumsSize = sizeof(biggerNums) / sizeof(biggerNums[0]);
  if (biggerNums == NULL)
    return NULL;

  // populate arrays
  int biggerNumsIdx = 0;
  int smallerNumsIdx = 0;
  int pivotNumsIdx = 0;
  for (int i = 0; i < numsSize; i++)
  {
    if (nums[i] > pivot)
    {
      biggerNums[biggerNumsIdx++] = nums[i];
    }
    else if (nums[i] == pivot)
    {
      pivotNums[pivotNumsIdx++] = nums[i];
    }
    else
    {
      smallerNums[smallerNumsIdx++] = nums[i];
    }
  }

  // merge arrays
  int mergeIdx = 0;
  for (int i = 0; i < smallerNumsIdx; i++)
  {
    resultNums[mergeIdx++] = smallerNums[i];
  }
  for (int i = 0; i < pivotNumsIdx; i++)
  {
    resultNums[mergeIdx++] = pivotNums[i];
  }
  for (int i = 0; i < biggerNumsIdx; i++)
  {
    resultNums[mergeIdx++] = biggerNums[i];
  }

  free(biggerNums);
  free(smallerNums);
  free(pivotNums);

  return resultNums;
}