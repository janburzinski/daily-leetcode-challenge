# Find Words that can be formed by Characters

- determine wheather a string can be formed by the given chars or not

  - each char can only be used once

- keep count of the number of char occurances and check if we have enugh letters to form the word
  => we simply copy the hashmap of `charOccurances` and remove the letters we would need

  - we return `false` if the count of a characters is 0, but we would need one
  - else we return `true`

- the result (return) should be the combined length of all the "good" strings
