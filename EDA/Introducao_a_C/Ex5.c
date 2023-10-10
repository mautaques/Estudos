#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 50

void concatena(char* s, int n, char c){
    char concat[MAX];
    sprintf(concat, "%d%c", n, c);
    strcat(s,concat);
}

char* rle(char str[]) {
   	char *retorno = malloc(sizeof(char) * MAX);
    retorno[0] = '\0';

    char caractere = str[0];
    int contador = 1;

    int tamanho = strlen(str);
    
    for (int i = 1; i < tamanho; i++) {
        if (str[i] == caractere) {
            contador++;
        } else {
            concatena(retorno, contador, caractere);
            
            caractere = str[i];
            contador = 1;
        }
    }

    concatena(retorno, contador, caractere);
 
    return retorno;
}

int main() {
	char s[] = "AAAABBBCCDAA";
	
    printf("%s\n",s);
    printf("%s\n",rle(s));
}