#include <stdio.h>

int main (void){

    int x, y;

    printf("Digite dois valores como (x,y): ");
    printf("\n");
    scanf("%i %i",&x ,&y);

    if ( x == 0 && y == 0 )
        printf("Origem");
    
    else if ( x > 0 && y > 0 )
        printf("Primeiro quadrante");
    
    else if ( x < 0 && y > 0 )
        printf("Segundo quadrante");
    
    else if ( x < 0 && y < 0 )
        printf("Terceiro quadrante");
    
    else
        printf("Quarto quadrante");

    return 0;
}
