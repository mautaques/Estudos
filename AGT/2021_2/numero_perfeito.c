#include <stdio.h>

int main(void) {

int numero, contador=1, somaDivisores = 0, contador2 = 0, v[20];

//Inicio

//printf("escreva um numero qualquer:");
scanf("%i",&numero);

//Calculo do Numero Perfeito


while(contador < numero){ 
 

  if(numero % contador == 0) { // se é divisor
    v[contador2] = contador;
    contador2++;
     //contador -> v[];
  }
  contador ++;
}

// Soma dos Arrays
for (int j = 0; j < contador2; j++){
  somaDivisores += v[j];
}


// verificação numero perfeito

if(somaDivisores == numero)
printf("PERFEITO");
else 
printf("NAO PERFEITO");

return 0;
}
