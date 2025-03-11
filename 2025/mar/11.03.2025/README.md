# Find the Index of the First Occurance in a String (Find the `Needle` in a `Haystack`)

We need to find the index of the first occurance of a string in the `"haystack"`

## For Loop

- We loop from the beginning of the string to haystack.length() - needle.length()
  => haystack.length() - needle.length() basically makes sure, that we only search the part of the string where the needle could actually even be

## Substring

`substring(i,i+needle.length())`

- We extract the content of the string, beginning from i up to i + needle.length()
  => example: substring(2,2+2=4)
  - this basically makes sure that we actually get a string, and not just an empty string, like we would if the beginningIndex and endIndex are both 2
