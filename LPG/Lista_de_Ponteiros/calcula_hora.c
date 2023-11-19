#include <stdio.h>

void calcula_hora(int totalMinutos, int *ph, int *pm){

    *ph = totalMinutos / 60;
    *pm = totalMinutos % 60;
}

int main(void){

    int totalmin, horas, min;

    scanf("%i",&totalmin);

    printf("\n");

    calcula_hora(totalmin,&horas,&min);

    printf("%i:%i",horas,min);

    return 0;
}