#include <stdio.h>

int soma(int n){

    int soma = 0, i;

    for(i = 1; i <= n; i++){

    soma += soma(i);

    }

    return printf("%i",soma);
}

int main(void){

    int n;

    soma(n);

    return 0;
}