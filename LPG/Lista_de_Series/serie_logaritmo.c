#include <stdio.h>

int main(void) {
  int n, i, sinal=1, num=1, den=0;
  float res, soma=0;

  printf("Digite um número: ");
  scanf("%i",&n);
  
  for(i=1;i<=n;i++){

    den++;

    res = (float)num/(float)den; 

    soma += res;

    printf("\n%i/%i  %.2f",num,den,res);

    num *= -1;
    
  }

  printf("\n\n");
  printf("Somatório: %.2f",soma);
  
  return 0;
}
