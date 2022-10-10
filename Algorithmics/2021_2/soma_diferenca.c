#include <stdio.h>
#include <math.h>
char escolha;
int cubo(int x,int y){
  int resultadoSomadif;
  
  if(escolha == 'S'){
      
       resultadoSomadif = pow(x,3) + (3 * pow(x,2) * y) + (3 * x * pow(y,2)) + pow(y,3);
      }
      else{
      resultadoSomadif = pow(x,3) - (3 * pow(x,2) * y) + (3 * x * pow(y,2)) - pow(y,3);}
    
return resultadoSomadif;  
}
int main(void) {
  int num1, num2, resultadoFuncao;
  printf("Digite um valor para x: \n");
  scanf("%d",&num1);
  printf("Digite um valor para y: \n");
  scanf("%d",&num2);
  printf("Digite S para soma ou D para diferença: \n");
  scanf(" %c",&escolha);

  resultadoFuncao = cubo(num1,num2);

  printf("%d \n",resultadoFuncao);
  return 0;
}
