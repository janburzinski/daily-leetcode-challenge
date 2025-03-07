# Merge Sorted Array

=> we are not supposed to allocate a new array, we should be using nums1 to store the final data

## Different Approaches

#### Using existing Librarys (Arrays.sort)

time complexity: O((m+n)log(m+n))
space complexity: O(1)

- We first have to combine nums1 and nums2 together.
- Since Java has a very nice way of being able to sort 2 arrays on its own, we can just use the existing Arrays.sort Method to actually do this

### using two pointers

time complexity:
space complexity: O(1)
