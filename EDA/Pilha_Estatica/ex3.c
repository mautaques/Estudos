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
    int tam, n;

    printf("Informe o tamanho da pilha: \n");

    scanf("%d",&tam);

    Pilha* p = criar(tam); 

    printf("informe um número: \n");

    scanf("%d",&n);

    while (!cheia(p)) {
        int valor;
        
        printf("Informe um valor: \n");

        scanf("%d", &valor);

        empilhar(p, valor);
    }

    for(int i = 0; i < tam; i++){
        int num = desempilhar(p);

        if(n == num){
            printf("true\n");
            return 0;
        }
    }
    printf("false");

}