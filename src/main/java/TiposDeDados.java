public class TiposDeDados {


    public static void getTabelaTiposDeDados(){
        System.out.println("                         |-----------------------------------------------------------------|");
        System.out.println("                         |                   (TABELA DE TIPOS DE DADOS)                    |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|(BOOLEANOS) - ♦ Exemplos = True and False | Os tipos Booleanos são basicamente verdadeiro e falso, criando a possibilidade de afirmações|");
        System.out.println("|(CARACTERES) - ♦ Exemplos = S,s,N,B,C,1 | Os tipos Caracteres (Char) podem armazenar apenas um caracter                                 |");
        System.out.println("|(DOUBLE - FLOAT) - ♦ Exemplos = 0.5,2.0,3,5 | Conjunto de Números Racionais ♦ (Q)                                                       |");
        System.out.println("|(INTEIROS) - ♦ Exemplo = 1,2,3,4 | 'Dentro do Circulo de Números Naturais e Números Inteiros (Z - N)                                    |");
        System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------|");
    }

    public static void getTabelaCapacidadeInteiros(){
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|               (TABELA DE CAPACIDADE DE INTEIROS)                |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|  BYTE  |       -128            | ATÉ |           127            |");
        System.out.println("|  SHORT |      -32768           | ATÉ |          32767           |");
        System.out.println("|  LONG  |   -2147483648         | ATÉ |        2147483647        |");
        System.out.println("|  INT   | –9223372036854775808  | ATÉ |   9223372036854775807    |");
        System.out.println("|-----------------------------------------------------------------|");
    }


    public static void getConvercaoAutomaticaDeTiposDeDados(){
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                         (CONVERSÕES AUTOMATICAS DE TIPOS DE DADOS)                                              |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Não se perdem informações em conversões de um tamanho menor para um maior. exemplo: inteiro pode receber números do tipo float. |");
        System.out.println("| 1 - int x = 10; // Declaração de uma variável do tipo int                                                                       |");
        System.out.println("| 2 - double d = x; // variável double recebe um tipo int                                                                         |");
        System.out.println("| 3 - long l = x; // variável long recebe um tipo int                                                                             |");
        System.out.println("| 4 - float f = x; // variável float recebe um tipo int                                                                           |");
        System.out.println("| 5 - Short s = 20; // declaração de uma variável do tipo short                                                                   |");
        System.out.println("| 6 - x = s // variável int recebe um tipo short                                                                                  |");
        System.out.println("|                                                                                                                                 |");
        System.out.println("|                                                                                                                                 |");
        System.out.println("|       |-----------------Teste de conversão-----------------|                                                                    |");
        System.out.println("|       | Valor inicial: " + valorDouble + "                                |                                                                    |");
        System.out.println("|       | Conversão de Double para Int: " + valorInt + "                    |                                                                    |");
        System.out.println("|       | ---------------------------------------------------|                                                                    |");
        System.out.println("|                                                                                                                                 |");
        System.out.println("| Atenção:É possivel perder dados em conversões automáticas, como transformar um double em int.                                   |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");

    }
}
