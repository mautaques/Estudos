import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade[] = new int[5], i, aux=0, z;
		String nome[] = new String[15];
		
		for(i=0;i<5;i++) {
			
			System.out.println("Digite um nome: ");
			
			for(i=0;i<15;i++) {
				nome[i] = scan.next();
		    }
			
			System.out.println("Digite a idade: ");
			
			for(i=0;i<5;i++) {
				idade[i] = scan.nextInt();
		    }
		}
			
			for(i=0;i<5;i++) {
			 for(z=0;z<5;z++) {
			   if(idade[i]<idade[z]){
				aux = idade[i];
				idade[i] = idade[i+1];
				aux = idade[i+1];
			   }
			 }
		    }
			
			for(i=0;i<5;i++) {
				System.out.println(idade[i]);
		    }
	    }
	
	
}
