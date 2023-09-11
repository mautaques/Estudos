#include <stdio.h>
#include <stdbool.h>

int identificaTriangulo(float a,float b,float c){
  int numeroTriangulo;
  
  if(a == b && b == c){
     numeroTriangulo = 0;
    
    }else{
          if(a == b || b == c || c == a ){
            numeroTriangulo = 1;
            
            }else{
              numeroTriangulo = 2;
             }
            
         }


    
return numeroTriangulo;  
}
 int main(void) {
 int numero;  
 float num1, num2, num3;
   
  printf("Digite o primeiro número: \n");
  scanf(" %f",&num1);
  printf("Digite o segundo número: \n");
  scanf(" %f",&num2);
  printf("Digite o terceiro número: \n");
  scanf(" %f",&num3);

   numero = identificaTriangulo(num1,num2,num3);

  if(num1>=num2+num3 || num2>=num1+num3 || num3>=num2+num1){
      printf("\nnão é um triangulo");
    
      }else{
            if( numero == 0){
                printf("\nequilatero");
            }else{
                  if( numero == 1){
                       printf("\nisoceles");
                  }else{
                   printf("\nescaleno");
                  }
            }
      }
  return 0;
}
