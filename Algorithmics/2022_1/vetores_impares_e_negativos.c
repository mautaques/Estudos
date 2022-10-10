#include <stdio.h>

int main(void) {
  int V[5], v;

  for(v=0;v<5;v++){
    scanf("%i",&V[v]);
  }
  
  printf("\nnegativos: ");
  
  for(v=0;v<5;v++){
    if(V[v] < 0)
      printf("%i, ",V[v]);
  }
  
  printf("\nímpares: ");
  
  for(v=0;v<5;v++){
    if(V[v] % 2 != 0)
      printf("%i, ",V[v]);
  }
  return 0;
}