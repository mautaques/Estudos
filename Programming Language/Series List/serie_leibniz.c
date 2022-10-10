#include <stdio.h>

int main(void){

    int n, num=4, den=1, sinal=1;
    float res, soma=0;

    printf("Digite um número de repetições:");
    printf("\n");
    scanf("%i",&n);

    for(int i=0; i<n; i++){

        res = sinal * (float)num/(float)den;

        printf("\n%i/%i = %.2f",num,den,res);

        sinal *= -1;

        den = den + 2;

        soma = soma + res;
    }

    printf("\n\n");
    printf("Somatório: %f",soma);

    return 0;
}