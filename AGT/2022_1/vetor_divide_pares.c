#include <stdio.h>

int main(void) {
  int V[10], i;

  for(i=0;i<10;i++){
    scanf("%i",&V[i]);
  }

  for(i=0;i<10;i++){
    if(V[i] % 2 == 0){
      V[i] = V[i] / 2;
    }
  }

  for(i=0;i<10;i++){
    printf("%i, ",V[i]);
  }
  
  return 0;
}
