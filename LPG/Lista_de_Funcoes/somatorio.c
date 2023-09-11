#include <stdio.h>

int soma_especial(int n, int k, int x){

    int i = x, soma = 0, contador = 0;

    while(contador < n){

        if(i % k == 0){
            printf("%i + ",i);
            soma += i;
            contador++;
        }
        i++;
    }
    printf("\n\n");
    return printf("%i",soma);
}

int main(void){

    int n, k, x;

    scanf("%i %i %i",&n,&k,&x);

    soma_especial(n, k, x);

    return 0;
}
