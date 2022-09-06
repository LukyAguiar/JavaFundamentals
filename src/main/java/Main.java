import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int response;
        Scanner readResponse = new Scanner(System.in);

        OperadoresAritmeticos ResponseOperadores = new OperadoresAritmeticos();
        TiposDeDados ResponseTiposDeDados = new TiposDeDados();

        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                     *  Seja Bem vindo ao Livrinho do Lucas *                                     |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| * Digite o número do conteudo que deseja ver                                                                     |");
        System.out.println("| * Tipos de Dados (1)                                                                                             |");
        System.out.println("| * Operadores Aritméticos (2)                                                                                     |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
        System.out.print("Escolha: ");
        response = readResponse.nextInt();

        if(response == 1){
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.println("| * Digite o número do conteudo que deseja ver                                                                     |");
            System.out.println("| * Tabela Tipos De Dados (1)                                                                                      |");
            System.out.println("| * Tabela Capacidade Inteiros (2)                                                                                 |");
            System.out.println("| * Convercao Automatica De Tipos De Dados (3)                                                                     |");
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.print("Escolha: ");
            response = readResponse.nextInt();
            if(response == 1){
                ResponseTiposDeDados.getTabelaTiposDeDados();
            }else if(response == 2){
                ResponseTiposDeDados.getTabelaCapacidadeInteiros();
            }else if(response == 3){
                ResponseTiposDeDados.getConvercaoAutomaticaDeTiposDeDados();
            }
        }else if(response == 2){
            ResponseOperadores.getTabelaOperadores();
        }
    }
}
