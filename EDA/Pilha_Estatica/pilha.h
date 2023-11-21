#ifndef PILHA_H
#define PILHA_H
#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int topo;
    int tamanho;
    int* vetor;
} Pilha;

int cheia(Pilha* pilha) {
    return pilha->topo == pilha->tamanho;
}

int vazia(Pilha* pilha) {
    return pilha->topo == 0;
}

void empilhar(Pilha* pilha, int valor) {
    if (!cheia(pilha))  {
        pilha->vetor[pilha->topo++] = valor;
    }
}

int desempilhar(Pilha* pilha) {
    if (!vazia(pilha)) {
        return pilha->vetor[--pilha->topo];
    }
    return -1;
}

#endif
