#include <stdio.h>

int main(void) {
  int V[10], i, menor, posicao;

  for(i=0;i<10;i++){
    scanf("%i",&V[i]);
  }

  menor = V[0];

  for(i=0;i<10;i++){
    if(V[i] < menor){
      menor = V[i];
      posicao = i;
    }
  }

  printf("o menor é: %i, e sua posição é: %i",menor,posicao);
  
  return 0;
}
