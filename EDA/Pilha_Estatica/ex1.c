#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

Pilha* criar(int tamanho) {
    Pilha *pilha = malloc(sizeof(Pilha));
    pilha->tamanho = tamanho;
    pilha->topo = 0;
    pilha->vetor = malloc(sizeof(int) * tamanho);

    return pilha;
}

int main(void){
    int n;

    printf("Informe o tamanho da pilha: ");

    scanf("%d",&n);

    Pilha* p = criar(n); 

    while (!cheia(p)) {
        int valor;
        
        printf("Informe um valor: ");
        scanf("%d", &valor);

        empilhar(p, valor);
    }

    while(!vazia(p)){
        printf("%d ", desempilhar(p)); 
    }

    return 0;
}