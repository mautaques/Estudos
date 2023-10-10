#include <stdio.h>

int main(void){

    int n, k, i, j, cont = 0;

    printf("\nDigite o tamanho do vetor: ");

    scanf("%d",&n);

    printf("\nDigite um número: ");

    scanf("%d",&k);

    int V[n];

    printf("\nDigite um elemento para o vetor: \n");

    for(i = 0; i < n; i++){
        scanf("%d",&V[i]);
    } 

    for(i = 0; i < n; i++){
        for(j = i + 1; j < n; j++){  
            if(V[i] + V[j] == k){
                printf("\nTRUE");
                return;
            }
        }
    }

    printf("\nFALSE");
}