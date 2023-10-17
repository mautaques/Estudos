#include <stdio.h>

enum coloracao { Vermelho, Preto};
typedef enum colocarao Cor;

typedef struct cor {
    struct cor* vermelho;
    struct cor* preto;
} Cor;

typedef struct no {
    struct no* pai;
    struct no* esquerda;
    struct no* direita;
    Cor cor; 
    int valor;
} No;

typedef struct arvore {
    struct no* raiz;
    int tamanho;
} Arvore;

Arvore* cria() {
    Arvore *arvore;
    arvore = malloc(sizeof(Arvore));
    arvore->raiz = NULL;

    return arvore;
}

No* adiciona(Arvore* arvore, No* pai, float valor) {
    No *no = malloc(sizeof(No));

    no->pai = pai;
    no->esquerda = NULL;
    no->direita = NULL;
    no->valor = valor;

    if (pai == NULL) {
        arvore->raiz = no;
    }

    return no;
}

void remove(Arvore* arvore, No* no){
    if(no->esquerda != NULL)
        remove(arvore, no->esquerda);

    if(no->direita != NULL)
        remove(arvore, no->direita);

    if(no->pai == NULL){
        arvore->raiz = NULL;
    }else{    
        if(no->pai->esquerda == no)
            no->pai->direita = NULL;
        else 
            no->pai->direita = NULL;    
    }

    free(no);
}

void percorre(No* no){
    if (no != NULL) {
        printf("%f", no->valor);

        percorrer(no->esquerda);
        percorrer(no->direita);
    }

}

int vazia(Arvore* arvore){
        return (arvore->raiz == NULL);
    }





void main() {


    return 0;
}