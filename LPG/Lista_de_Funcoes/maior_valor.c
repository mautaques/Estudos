#include <stdio.h>

int maiorValor(int x, int y, int z){
    int valor;

    if (x > y){
       if(x > z){
        return printf("%i",x);
       }else{
        return printf("%i",z);
       }
    }else{
        if(y > z){
            return printf("%i",y);
        }else{
            return printf("%i",z);
        }
    }

}

int main(){

    int a, b, c;

    scanf("%i%i%i",&a,&b,&c);

    maiorValor(a,b,c);

    return 0;
}
