#include <stdio.h>

int digito(int x){
    
    int inteiro;

    if (x == '0') inteiro = 0;
    else if(x == '1') inteiro = 1;
    else if(x == '2') inteiro = 2;
    else if(x == '3') inteiro = 3;
    else if(x == '4') inteiro = 4;
    else if(x == '5') inteiro = 5;
    else if(x == '6') inteiro = 6;
    else if(x == '7') inteiro = 7;
    else if(x == '8') inteiro = 8;
    else if(x == '9') inteiro = 9;
    else return printf("não é um digito");

    return printf("%i",inteiro);
}

int main(void){

    char caractere;

    scanf("%i",&caractere);

    digito(caractere);

    return 0;
}