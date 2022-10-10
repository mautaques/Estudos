#include <stdio.h>

int soma(int n){

    int i, soma = 0;

    for(i = 1;i <= n;i++){

        printf("%i + ",i);
        soma += i;

    }

    printf("\n");
    return printf("%i",soma);
}

int main(void){

    int n;

    scanf("%i",&n);

    soma(n);

    return 0;
}