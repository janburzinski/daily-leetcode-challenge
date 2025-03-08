#include <stdlib.h>
#include <stdio.h>

int fib(int n)
{
  if (n <= 1)
    return n;
  return fib(n - 1) + fib(n - 2);
}

int main()
{
  int x = fib(7);
  if (x != 8)
    return printf("error while calculating fibonacci sequence\n");
  printf("everything is perfect :-) %d\n", x);
  return 0;
}