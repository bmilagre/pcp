#include <stdio.h>

void printNumbersGoto(int n){
  int current_n = 0;
  //goto check_jump;

  check_jump:
    if(current_n <= n)
      goto jump_forward;
    else
      return;

  jump_forward:
    printf("%d ", current_n);
    current_n++;
    goto check_jump;
}

void printNumbersFor(int n){
  for (int i = 0; i <= n; i++) {
    printf("%d ", i);
  }
}

void printNumbersRecursiveFunction(int n){
  if(n > 0){
    printNumbersRecursiveFunction(n-1);
  }

  printf("%d ", n);
}

void printReverseNumbersRecursiveFunction(int n){
  printf("%d ", n);

  if(n > 0){
   printReverseNumbersRecursiveFunction(n-1);
  }
}

int main(){
  printNumbersGoto(7);
  printf("= printNumbersGoto(7)\n");
  printNumbersFor(7);
  printf("= printNumbersFor(7)\n");
  printNumbersRecursiveFunction(7);
  printf("= printNumbersRecursiveFunction(7)\n");
  printReverseNumbersRecursiveFunction(7);
  printf("= printReverseNumbersRecursiveFunction(7)\n");

  return 0;
}
