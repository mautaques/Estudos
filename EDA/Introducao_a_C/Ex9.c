#include <stdio.h>
#include <string.h>

#define n 50

void main(){

    char str[n];

    scanf("%s", str);

    int tam = strlen(str);

    for(int i = tam - 1; i >= 0; i--){
        if(str[i] != str[tam - 1 - i]){
            printf("false\n");
            return;
        }
    }

    printf("true");
}