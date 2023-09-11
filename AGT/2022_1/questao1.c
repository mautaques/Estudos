#include <stdio.h>

int main(void){

    int a, b, x;

    while(a != -1){

        printf("\ndigite dois valores, ou digite -1 para parar");

        scanf("\n%i %i",&a,&b);

        if(a != b){
            x = a * b;
            printf("\nFigura 1 : retangulo);
            printf("\nArea : %i",x);
        }else{
            if(a == b){
                x = a * b;
                printf("\nFigura 2 : quadrado);
                printf("\nArea : %i",x);
            }
        }
    }

return 0;
}
