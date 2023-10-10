#include <stdio.h>
#include <stdlib.h>

int mult(int a, int b){

    int c;

    c = a * b;

    return c;

}

int main(){

    int a, b;

    scanf("%d %d",&a,&b);

    printf("%d",mult(a,b));

    return 0;
}