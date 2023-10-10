#include <stdio.h>
#include <string.h>

#define n 50

char inverte(char str[]){

    int tamanho = strlen(str);

    for(int i = tamanho - 1; i >= 0; i--){
        printf("%c",str[i]);
    }
}

int main(void){

    char str[n];

    scanf("%s", str);

    printf("%c",inverte(str));

    return 0;
}