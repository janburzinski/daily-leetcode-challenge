# Merge Strings Alternately

- We keep track of the current position (`pos`), so that we know where we are on the string
- We then just go until there are no more chars left in both string, and insert both chars (chars from word1 first) into the new string

# Find the Difference

- We count all the occurances of characters in string `s`
- We then loop over the string t, and decrement the counter by 1, everytime we see a occurance
  => whichever character has the count `-1`, is the imposter and should get returned
