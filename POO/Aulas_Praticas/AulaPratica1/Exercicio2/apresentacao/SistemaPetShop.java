package apresentacao;

import java.util.Scanner;

import dados.Animal;
import dados.Endereco;
import dados.Veterinario;
import dados.Dono;

public class SistemaPetShop {

    private static Veterinario[] veterinarios = new Veterinario[3];
    private static int qntVeterinarios = 0;
    private static Scanner s = new Scanner(System.in);

    public static void imprimeMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Veterinário");
        System.out.println("2 - Mostrar Veterinarios");
        System.out.println("3 - Cadastrar Endereço do Veterinário");
        System.out.println("4 - Cadastrar Animal");
        System.out.println("5 - Mostrar Animais");
        System.out.println("6 - Cadastrar Endereço do Dono");
    }

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {

            imprimeMenu();

            opcao = s.nextInt();

            switch (opcao) {

                case 0:
                    break;
                case 1:
                    cadastrarVeterinario();
                    break;
                case 2:
                    mostrarVeterinarios();
                    break;
                case 3:
                    cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    cadastrarAnimalVeterinario();
                    break;
                case 5:
                    mostrarAnimais();
                    break;
                case 6:
                    cadastrarEnderecoDono();
                    break;
                default:
                    System.out.println("valor incorreto");
                    break;
            }
        }
    }

    public static void cadastrarVeterinario() {

        if (qntVeterinarios < 3) {

            Veterinario v = new Veterinario();

            System.out.println("Digite o nome do veterinário: ");

            String nome = s.nextLine();
            nome = s.nextLine();
            v.setNome(nome);

            System.out.println("Digite o salário do veterinário: ");

            float salario = s.nextFloat();
            v.setSalario(salario);

            veterinarios[qntVeterinarios] = v;

            qntVeterinarios++;
        }
    }

    public static void mostrarVeterinarios() {

        for (int i = 0; i < qntVeterinarios; i++) {
            System.out.println("Código: " + i);
            System.out.println(veterinarios[i].toString());
        }
    }

    public static Veterinario escolherVeterinario() {

        System.out.println("Escolha um veterinário: ");
        mostrarVeterinarios();

        int escolha = s.nextInt();

        if (escolha > qntVeterinarios) {
            System.out.println("Número inváldo");
            return null;
        } else {
            return veterinarios[escolha];
        }
    }

    public static void cadastrarEnderecoVeterinario() {

        Veterinario v = escolherVeterinario();

        if (v != null) {
            v.setEndereco(cadastrarEndereco());
        }

    }

    public static Endereco cadastrarEndereco() {

        Endereco e = new Endereco();

        System.out.println("Digite o nome da rua: ");

        String rua = s.nextLine();
        rua = s.nextLine();
        e.setRua(rua);

        System.out.println("Digite o número da casa: ");

        int numero = s.nextInt();
        e.setNumero(numero);

        System.out.println("Digite o nome da bairro: ");

        String bairro = s.nextLine();
        bairro = s.nextLine();
        e.setBairro(bairro);

        System.out.println("Digite o nome da cidade: ");

        String cidade = s.nextLine();
        cidade = s.nextLine();
        e.setCidade(cidade);

        System.out.println("Digite o nome do estado: ");

        String estado = s.nextLine();
        estado = s.nextLine();
        e.setEstado(estado);

        System.out.println("Digite o número do cep: ");

        int cep = s.nextInt();
        e.setCep(cep);

        return e;
    }

    public static Animal cadastrarAnimal() {

        Animal a = new Animal();

        System.out.println("Digite o nome do animal: ");

        String nome = s.nextLine();
        nome = s.nextLine();
        a.setNome(nome);

        System.out.println("Digite a espécie do animal: ");

        String especie = s.nextLine();
        especie = s.nextLine();
        a.setEspecie(especie);

        System.out.println("Digite a descrição: ");

        String descricao = s.nextLine();
        descricao = s.nextLine();
        a.setDescricao(descricao);

        a.setDono(cadastrarDono());

        return a;
    }

    public static void cadastrarAnimalVeterinario() {

        Veterinario v = escolherVeterinario();

        if (v != null) {
            v.setAnimais(cadastrarAnimal());
        }
    }

    public static void mostrarAnimais() {

        Veterinario v = escolherVeterinario();

        if (v != null) {
            for (int i = 0; i < v.getQntAnimais(); i++) {
                System.out.println("Animal Atendido " + i);
                System.out.println(v.getAnimais()[i].toString());
            }
        }

    }

    public static Animal escolherAnimais() {

        System.out.println("Escolha um Animal: ");
        Veterinario v = escolherVeterinario();

        if (v != null) {
            for (int i = 0; i < v.getQntAnimais(); i++) {
                System.out.println("Animal Atendido " + i);
                System.out.println(v.getAnimais()[i].toString());
            }

            int escolha = s.nextInt();

            if (escolha > v.getQntAnimais()) {
                System.out.println("Número inválido");
                return null;
            } else {
                return v.getAnimais()[escolha];
            }
        }
        return null;
    }

    public static Dono cadastrarDono() {

        Dono d = new Dono();

        System.out.println("Digite o nome do dono: ");

        String nome = s.nextLine();
        nome = s.nextLine();
        d.setNome(nome);

        System.out.println("Digite o cpf do dono: ");

        int cpf = s.nextInt();
        d.setCpf(cpf);

        return d;
    }

    public static void cadastrarEnderecoDono() {

    Animal a = escolherAnimais();

    Dono d = a.getDono();

        if(a != null){
            d.setEndereco(cadastrarEndereco());
        }
    }
}
