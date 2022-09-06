import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("-----------------------");
        System.out.println("♦ Rebase again! ♦");
        System.out.println("-----------------------");
        System.out.println();

        System.out.println("-----------------------");
        System.out.println("♦ Tipos de dados ♦");
        System.out.println("-----------------------");

        TiposDeDados ExempTipoDeDados = new TiposDeDados();

        System.out.println(ExempTipoDeDados.getInteiros());
        System.out.println("--------------------------------------------------");
        System.out.println(ExempTipoDeDados.getPontosFlutuantes());
        System.out.println("--------------------------------------------------");
        System.out.println(ExempTipoDeDados.getBooleanos());
        System.out.println("--------------------------------------------------");
        System.out.println(ExempTipoDeDados.getCaracteres());
        System.out.println("--------------------------------------------------");
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("♦ (CAPACIDADE DE INTEIROS) ♦");
        System.out.println("--------------------------------------------------");
        System.out.println(ExempTipoDeDados.getCapacidadeInteiros());
        System.out.println();

        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|           (CONVERSÕES AUTOMATICAS DE TIPOS DE DADOS)            |");
        System.out.println("|-----------------------------------------------------------------|");
        ExempTipoDeDados.getConvercaoAutomaticaDeTiposDeDados();

        System.out.println();
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|                    (OPERADORES ARITMÉTICOS)                     |");
        System.out.println("|-----------------------------------------------------------------|");
        ExempTipoDeDados.getTabelaOperadores();
    }
}
