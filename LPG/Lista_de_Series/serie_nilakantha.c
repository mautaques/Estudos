#include <stdio.h>

int main(void){

    int n, num=4, den=1, sinal=1, aux=1;
    float res, soma=3;

    printf("Digite um número de repetições:");
    printf("\n");
    scanf("%i",&n);

    for(int i=0; i<n; i++){

        den = aux + 1 * aux + 2 * aux + 3;

        res = sinal * (float)num/(float)den;

        printf("\n%i/%i = %.2f",num,den,res);

        sinal *= -1;

        aux = aux + 2;

        soma = soma + res;
    }

    printf("\n\n");
    printf("Somatório: %f",soma);

    return 0;
}
