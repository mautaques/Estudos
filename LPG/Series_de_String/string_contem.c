#include <stdio.h>

int main(void){

    int n, i, cont = 0;
    char c;

    scanf("%i %c",&n,&c);

    char v[n];

    for( i = 0; i < n; i++){
        scanf("%s",&v[i]);
    }

    for( i = 0; i < n; i++){
        if(v[i] == c){
            cont++;
        }
    }

    if( cont > 0){
        printf("contém");
    }else{
        printf("não contém");
    }

    return 0;
}
