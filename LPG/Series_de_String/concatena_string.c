#include <stdio.h>

void concatena( char str1[], char str2[]){

    int i, str3[20];

    for(i = 0; i < 20; i++){
        if( i < 10 ){
            str3[i] = str1[i]; 
        }else{
            str3[i] = str2[i];
        }
    }

    for( i = 0; i < 10; i++){
        printf("%s",&str3[i]);
    }
}

int main(void){

    int i;
    char str1[3], str2[3];

    for( i = 0; i < 3; i++){
        scanf("%s",&str1[i]);
    }

    for( i = 0; i < 3; i++){
        scanf("%s",&str2[i]);
    }

    concatena(str1,str2);

    return 0;
}
