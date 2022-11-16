package Exercicio2;

import java.util.Scanner;

import dados.Animal;
import dados.Dono;
import dados.Endereço;
import negocio.SistemaPetShop;
import dados.Veterinario;

import java.util.Scanner;

public class SistemaPetShop{

	

}

public class Main {
    Scanner scan = new Scanner(System.in);
	SistemaPetShop sistema = new SistemaPetShop(10);

    public SistemaPetShop getSistema() {
		return sistema;
	}

    public cadastrarVeterinarios(){
        Veterinario veterinarios = new veterinarios();
		System.out.println("Digite o nome do Veterinário: ");
		veterinarios.setNome(scan.nextLine());
		System.out.println("Salário do Veterinário: ");
		veterinario.setSalario(Float.valueOf(scan.nextInt()));
		sistema.cadastrarVeterinario(veterinario);
    }

    public mostrarVeterinarios(){
		for(int i=0; i<sistema.getquantidadeVeterinarios(); i++){
			Veterinario vet = sistema.getVeterinario()[i];
			System.out.println(vet+"\n");
		}
    }

    public cadastrarEndereçodoVeterinarios(){
		mostrarTodosVeterinario();
		System.out.println("Digite o Veterinario a cadastrar o Endereço: ");
		int escolha = scan.nextInt();
		Veterinario veterinario = sistema.getVeterinarios()[escolha];
		Endereço temp = new Endereço();
		System.out.println("Rua: ");
		temp.setRua(scan.next());
		System.out.println("Número: ");
		temp.setNumero(scan.nextInt());
		System.out.println("Cidade: ");
		temp.setCidade(scan.next());
		System.out.println("Estado: ");
		temp.setEstado(scan.next());
		System.out.println("Cep: ");
		temp.setCep(scan.next());
		veterinario.setEndereço(temp);
		sistema.setVeterinario(veterinario, escolha);
    }

    public cadastrarAnimal(){
		mostrarTodosVeterinario();
		System.out.println("Digite o Veterinario a cadastrar o Animal: ");
		int escolha = scan.nextInt();
		Veterinario veterinario = sistema.getVeterinarios()[escolha];
		if(veterinario.getquantidadeAnimais() < 10){
			Animal temp = new Animal();
			System.out.println("Nome: ");
			temp.setNome(scan.next());
			System.out.println("Espécie: ");
			temp.setEspecie(scan.next());
			System.out.println("Descrição: ");
			temp.setDescricao(scan.nextLine());
			veterinario.setAnimal(temp, escolha);
		}
    }

    public mostrarAnimais(){
		mostrarTodosVeterinario();
		System.out.println("Digite um Veterinario para ver seus Animais: ");
		int escolha = scan.nextInt();
		Veterinario veterinario = sistema.getVeterinario()[escolha];
		for(int i=0 ; i<veterinario.getAnimais() ; i++){
			System.out.println("Animal ["+escolha+"]"+veterinario.getAnimais()[i].getNome());
		}
		return escolha;
    }

    public cadastrarDono(){
		mostrarAnimais();
		System.out.println("Digite um animal para cadastrar um dono a ele: ");
		int escolha = scan.nextInt();
		Veterinario veterinario = new Veterinario(5);
		Animal animal = veterinario.getAnimais(escolha);
		Dono temp = animal.getDono();
		System.out.println("Digite o Nome do Dono: ");
		temp.setNome(scan.next());
		System.out.println("Digite CPF do Dono: ");
		temp.setCpf(scan.nextInt());
		animal.setDono(temp);
		veterinario = cadastrarAnimal(animal);
		sistema.setVeterinario(veterinario, escolha);
    }

    public cadastrarEndereçodoDono(){
		mostrarDono();
		System.out.println("Digite os Dados do Dono: ");
		System.out.println("Rua: ");
		temp.setRua(scan.next());
		System.out.println("Número: ");
		temp.scan.setNumero(scan.nextInt());
		System.out.println("Bairro: ");
		temp.setBairro(scan.next());
		System.out.println("Cidade: ");
		temp.scan.setNumero(scan.next());
		System.out.println("Estado: ");
		temp.scan.setNumero(scan.next());
		System.out.println("CEP: ");
		temp.scan.setNumero(scan.nextInt());
		
		
    }

	private void cadastrarVeterinario() {
		Veterinario veterinario = new Veterinario(5);
		System.out.println("Digite o nome:");
		veterinario.setNome(scan.nextLine());
		System.out.println("Digite o salário:");
		veterinario.setSalario(Float.valueOf(scan.nextLine()));
		sistema.cadastrarVeterinario(veterinario);
	}
	
	public void mostrarTodosVeterinario() {
		for(int i=0;i<sistema.getQuantVeterinarios();i++) {
			Veterinario vet = sistema.getVeterinarios()[i];
			System.out.println(vet+"\n");
		}
	}
	

    public static void main(String[] args){

        int opcao;
		
		Main main = new Main();
		opcao = main.menu();
		while(opcao != 0 ) {
			switch (opcao) {
				case 1: main.cadastrarVeterinario();
						break;
				case 3: main.mostrarTodosVeterinario();
						break;
				default: 
					System.out.println("Opção Inválida");
			}
			opcao = main.menu();
		}
			
	}
       
 }
