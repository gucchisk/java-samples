#include <stdio.h>
#include "lib.h"

void say(char* str) {
    printf("say: %s\n", str);
    fflush(stdout);
}

int func(int a, size_t b) {
  printf("a: %d, b: %ld\n", a, b);
  fflush(stdout);
  return a;
}
