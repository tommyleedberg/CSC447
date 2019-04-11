#include <stdio.h>
#include <stdlib.h>

void update (int* p) 
{
  *p = *(p + 5);
}

int main () {
  int x = 5;
  update(&x);
  printf ("%d\n", x);
}