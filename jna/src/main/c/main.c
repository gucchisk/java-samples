#include <stdio.h>
#include "lib.h"

int main() {
  printf("test\n");

  int result = func(3, 4);

  printf("result: %d\n", result);
  
  return 0;
}
