# Find Missing and Repeated Values

- calloc (malloc with init val of 0) count int array with the size of n^2 + 1
- count occurrances in hashmap (loop over the row and cols in the grid)
- find double (which number appears twice?)
- determine which number is not present, since the numbers present should be in range of 1 and n^2 `[1,n^2]`
  - we can just check which number has a count of 0 in the count array
- free counts int array
- and return the result `[a,b]`
  - a being the double num
  - b being the missing num
