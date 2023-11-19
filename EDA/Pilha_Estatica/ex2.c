#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

Pilha* criar(int tamanho) {
    Pilha *pilha = malloc(sizeof(Pilha));
    pilha->tamanho = tamanho;
    pilha->topo = 0;
    pilha->vetor = malloc(sizeof(int) * tamanho);

    return pilha;
}

int main(void){

    char palavra[4];
    int i;

    printf("Informe uma palavra: \n");

    for(i = 0; i < 4; i++){
        scanf("%s",&palavra[i]);
    }

    int tam = strlen(palavra);

    Pilha* p = criar(tam); 

    for(i = 0; i < tam; i++){
        empilhar(p,palavra[i]);
    }

    for(int i = 0; i < tam; i++){
        char ch = desempilhar(p);

        if(palavra[i] != ch){
            printf("não é um palíndromo!\n");
            return 0;
        }
    }
    printf("é um palíndromo!\n");
}