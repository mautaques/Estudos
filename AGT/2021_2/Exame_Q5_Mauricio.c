#include <stdio.h>
#include <math.h>

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

float areaTriangulo(float a,float b,float c){

float area, p;

  p = (a + b + c)/2;

  area = (p * (p-a) * (p-b) * (p - c));
  
return area;
}

int main(void) {

  int num1, num2, num3, numero;
  float areaNumero;

  printf("Digite o primeiro número: \n");
  scanf(" %d",&num1);
  printf("Digite o segundo número: \n");
  scanf(" %d",&num2);
  printf("Digite o terceiro número: \n");
  scanf(" %d",&num3);

  areaNumero = areaTriangulo(num1,num2,num3);

  printf("\n%1.f",sqrt(areaNumero));

  numero = identificaTriangulo(num1,num2,num3);

  if(num1>=num2+num3 || num2>=num1+num3 || num3>=num2+num1){
      printf("\nnao eh um triangulo");
    
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
