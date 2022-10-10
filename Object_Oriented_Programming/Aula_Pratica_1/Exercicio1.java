import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n[] = new int[5], i;
		float media=0; 
		
		System.out.println("Digite 5 números: ");
		
		for(i=0;i<5;i++) {
			
	        n[i] = scan.nextInt();
	    }
		
		for(i=0;i<5;i++) {
			
			media += n[i]; 
	    }
		
		System.out.println("media: "+media/5);
	}
}
