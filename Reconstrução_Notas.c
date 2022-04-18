#include <stdio.h>

int main(void) {
  int nota1, nota2, media, frequencia;

  printf("Digite duas notas e uma frequência: \n");
  scanf("%d",&nota1);
  scanf("%d",&nota2);
  scanf("%d",&frequencia);

  media = (nota1 + nota2) / 2;

  printf("%d\n",media);

  if(frequencia>=75){
    if(media>=7){
      printf("aprovado \n");

    }else{
        printf("exame \n");

    }
  }else{
      printf("reprovado \n");
    
  } 
 
  return 0;
}