package apresentacao;

import java.util.Scanner;

import dados.Cliente;
import dados.Cidade;
import dados.Reserva;
import negocio.ReservaPassagem;
public class Main {

    private static ReservaPassagem rp = new ReservaPassagem();

    private static Scanner s = new Scanner(System.in);

    public static void imprimeMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Fazer Reserva");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Cadastrar Cidade");
        System.out.println("4 - Mostrar Reservas");
        System.out.println("5 - Mostrar Clientes");
        System.out.println("6 - Mostrar Cidades");
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
                    fazerReserva();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    cadastrarCidade();
                    break;
                case 4:
                    mostrarReservas();
                    break;
                case 5:
                    mostrarClientes();
                    break;
                case 6:
                    mostrarCidades();
                    break;
                default:
                    System.out.println("valor incorreto");
                    break;
            }
        }
    }

    public static void fazerReserva() {

        Cliente c = escolherCliente();

        if(c != null) {

            int opcao = -1;

            while (opcao != 0) {

                System.out.println("Digite 0 para sair:");
                System.out.println("Digite 1 para reservar somente a ida");
                System.out.println("Digite 2 para reservar ida e volta");
                opcao = s.nextInt();

                switch (opcao) {
                    case 1:
                        Reserva r = novaReserva();
                        rp.reservarIda(c,r);
                        break;
                    case 2:
                        Reserva r1 = novaReserva();
                        Reserva volta = novaReserva();
                        rp.reservarVolta(c,r1,volta);
                        break;
                    default:
                        System.out.println("Numero invalido");
                        break;
                }
            }

        }
    }

    public static Reserva novaReserva(){

        System.out.println("Digite a data do voo:");
        String data = s.nextLine();
        data = s.nextLine();

        System.out.println("Digite a hora do voo:");
        String hora = s.nextLine();
        hora = s.nextLine();

        System.out.println("Digite o preço do voo:");
        float preco = s.nextFloat();

        System.out.println("Digite a classe do voo:");
        String classe = s.nextLine();
        classe = s.nextLine();

        System.out.println("Digite a poltrona no voo:");
        int poltrona = s.nextInt();

        Cidade origem = escolherCidade();
        Cidade destino = escolherCidade();

        Reserva r = new Reserva();
        r.setDataVoo(data);
        r.setHoraVoo(hora);
        r.setPreco(preco);
        r.setClaseVoo(classe);
        r.setPoltrona(poltrona);
        r.setOrigem(origem);
        r.setDestino(destino);

        return r;
    }

    public static Cliente novoCliente(){
        Cliente c = new Cliente();

        System.out.println("Digite o nome:");
        String nomeCliente = s.nextLine();
        nomeCliente = s.nextLine();
        c.setNome(nomeCliente);

        System.out.println("Digite o cpf:");
        int cpf = s.nextInt();
        c.setCpf(cpf);

        System.out.println("Digite o Endereço:");
        String endereco = s.nextLine();
        endereco = s.nextLine();
        c.setEndereco(endereco);

        System.out.println("Digite o telefone:");
        int telefone = s.nextInt();
        c.setTelefone(telefone);

        rp.cadastrarCliente(c);

        return c;
    }

    public static void cadastrarCliente(){
        rp.cadastrarCliente(novoCliente());
    }

    public static void mostrarClientes(){
        for(Cliente c: rp.mostrarClientes()){
            System.out.println(c.toString());
        }
    }

    public static Cliente escolherCliente(){

        mostrarClientes();

        System.out.println("Digite o cpf do cliente:");

        Cliente c = rp.buscarCliente(s.nextInt());

        if(c != null){
            return c;
        }

        return null;
    }

    public static Cidade novaCidade(){
        Cidade c = new Cidade();

        System.out.println("Digite um nome:");
        String nomeCidade = s.nextLine();
        nomeCidade = s.nextLine();
        c.setNome(nomeCidade);

        System.out.println("Digite um estado:");
        String estado = s.nextLine();
        estado = s.nextLine();
        c.setEstado(estado);

        rp.cadastrarCidade(c);

        return c;
    }

    public static void cadastrarCidade(){

        rp.cadastrarCidade(novaCidade());
    }

    public static void mostrarCidades(){
        for(int i = 0 ; i < rp.mostrarCidades().size(); i++){
            System.out.println("Cidade: "+i);
            System.out.println(rp.mostrarCidades().get(i).toString());
        }
    }

    public static Cidade escolherCidade(){

        mostrarCidades();
        System.out.println("Escolher uma cidade: ");
        int codigo = s.nextInt();

        if(codigo > rp.mostrarCidades().size()){
            System.out.println("Cidade inváilida");
            return null;
        }else{
            return rp.mostrarCidades().get(codigo);
        }
    }

    public static void mostrarReservas(){

        Cliente c = escolherCliente();

        for(Reserva r: rp.mostrarReservas(c.getCpf())){
            System.out.println(r.toString());
        }
    }
}