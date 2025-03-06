#include <stdio.h>
#include <stdlib.h>

/**
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2].
 * Each integer appears exactly once except a which appears twice and b which is missing.
 *
 * The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
Example 2:

Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].

 */

int *findMissingAndRepeatedValues(int **grid, int gridSize, int *gridColSize, int *returnSize)
{
  int availableNums = gridSize * gridSize;
  int *count = (int *)calloc(availableNums + 1, sizeof(int));
  if (count == NULL)
    return NULL;

  int doubleNum = -1;
  int missingNum = -1;

  for (int i = 0; i < gridSize; i++)
  {
    for (int j = 0; j < gridColSize[i]; j++)
    {
      {
        count[grid[i][j]]++;
      }
    }
  }

  // determine double num and determine missing num
  // by looping over all the nums that should be appearing since nums from [1,n^2] should appear in the grid
  for (int i = 1; i <= availableNums; i++) // i = 1 because the we have a range of [1,n^2]
  {
    if (count[i] == 2)
    {
      doubleNum = i;
    }
    else if (count[i] == 0)
    {
      missingNum = i;
    }
  }

  free(count);

  // result
  *returnSize = 2; // [a,b] => a: repeatedNum; b: missing Num;
  int *result = (int *)malloc((*returnSize) * sizeof(int));
  if (result == NULL)
    return NULL;

  result[0] = doubleNum;
  result[1] = missingNum;

  return result;
}