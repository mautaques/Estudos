#include <stdio.h>

int main(void) {

  int n, i, den = 1, num;
  float res, soma;

  printf("escolha um número: ");
  scanf("%i",&n);

  num = 1;

  for(i=1; i<=n; i++){

    res = (float)num/(float)den;

    printf("\n%i/%i",num,den);
    //printf("\n%.2f",res);

    den++;

    soma += res++;
  }
  printf("\n");
  printf("\nsomatório: %.2f",soma);
  
  return 0;
}