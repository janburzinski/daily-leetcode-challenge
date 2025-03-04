#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 3^x
bool checkPowersOfThree(int n)
{
  while (n > 0)
  {
    // eine 2 taucht in der ternärdarstellung auf:
    if (n % 3 == 2)
    {
      // dies würde bedeuten, dass wir die gleiche potenz 2x verwenden müssen,
      // was wir ja nicht dürfen
      return false;
    }
    n /= 3;
  }
  return true;
}