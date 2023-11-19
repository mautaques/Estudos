#ifndef PILHAD_H
#define PILHAD_H
#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int valor;
    struct No* anterior;
} No;

typedef struct {
    No* topo;
} Pilha;

Pilha* criar() {
    Pilha* pilha = malloc(sizeof(Pilha));
    pilha->topo = NULL;

    return pilha;
}

int vazia(Pilha* pilha) {
    return pilha->topo == NULL;
}

void empilhar(Pilha* pilha, int valor) {
    No* no = malloc(sizeof(No));
    no->valor = valor;
    no->anterior = (struct No*) pilha->topo;
    pilha->topo = no;
}

int desempilhar(Pilha* pilha) {
    if (!vazia(pilha)) {
        int valor = pilha->topo->valor;
        No* antigo = pilha->topo;
        pilha->topo = (No*) pilha->topo->anterior;
        free(antigo);

        return valor;
    }

    return -1;
}

void limpar(Pilha* pilha) {
    while (!vazia(pilha)) {
        desempilhar(pilha);
    }    
    free(pilha);
}

#endif