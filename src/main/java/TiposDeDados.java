public class TiposDeDados {

    String Inteiros;
    String PontosFlutuantes;
    String Caracteres;
    String Booleanos;
    String CapacidadeInteiros;

    public String getInteiros() {
        Inteiros = "(INTEIROS) - ♦ Exemplo = 1,2,3,4 | 'Dentro do Circulo de Números Naturais e Números Inteiros (Z - N)' ' ♦";
        return Inteiros;
    }

    public String getPontosFlutuantes() {
        PontosFlutuantes = "(QUEBRADOS) - ♦ Exemplos = 0.5,2.0,3,5 | Conjunto de Números Racionais ♦ (Q)";
        return PontosFlutuantes;
    }

    public String getCaracteres() {
        Caracteres = "(CARACTERES) - ♦ Exemplos = S,s,N,B,C,1 | Os tipos Caracteres (Char) podem armazenar apenas um caracter♦";
        return Caracteres;
    }

    public String getBooleanos() {
        Booleanos = "(BOOLEANOS) - ♦ Exemplos = True and False | Os tipos Booleanos são basicamente verdadeiro e falso, criando a possibilidade de afirmações♦";
        return Booleanos;
    }

    public String getCapacidadeInteiros(){
        CapacidadeInteiros = "♦ Byte = -128 até 127 ♦\n♦ Short = -32768 até 32767 ♦\n♦ Int = -2147483648 até 2147483647 ♦\n♦ Long = –9223372036854775808 até 9223372036854775807 ♦";
        return CapacidadeInteiros;
    }

    public static void getTabelaOperadores(){
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("|               (TABELA DE OPERADORES ARITMÉTICOS)                |");
        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("| OPERAÇÃO JAVA | OPERADOR | EXPRESSÃO ALGÉBRICA | EXPRESSÃO JAVA |");
        System.out.println("|   ADIÇÃO      |     +    |        f + 7        |     f + 7      |");
        System.out.println("|  SUBTRAÇÃO    |     -    |        p - c        |     p - c      |");
        System.out.println("| MULTIPLICAÇÃO |     *    |        Bm           |     B + m      |");
        System.out.println("|   DIVISÃO     |     /    |     x/y ou x-y      |      x/y       |");
        System.out.println("|    RESTO      |     %    |        r mod s      |     r % s      |");
        System.out.println("|-----------------------------------------------------------------|");
    }

    public static void getConvercaoAutomaticaDeTiposDeDados(){
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;

        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Não se perdem informações em conversões de um tamanho menor para um maior. exemplo: inteiro pode receber números do tipo float. |");
        System.out.println("| 1 - int x = 10; // Declaração de uma variável do tipo int                                                                       |");
        System.out.println("| 2 - double d = x; // variável double recebe um tipo int                                                                         |");
        System.out.println("| 3 - long l = x; // variável long recebe um tipo int                                                                             |");
        System.out.println("| 4 - float f = x; // variável float recebe um tipo int                                                                           |");
        System.out.println("| 5 - Short s = 20; // declaração de uma variável do tipo short                                                                   |");
        System.out.println("| 6 - x = s // variável int recebe um tipo short                                                                                  |");
        System.out.println("|                                                                                                                                 |");
        System.out.println("| Atenção:É possivel perder dados em conversões automáticas, como transformar um double em int.                                   |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println();
        System.out.println("|-----------------Teste de conversão-----------------|");
        System.out.println("| Valor inicial: " + valorDouble + "                                |" );
        System.out.println("| Conversão de Double para Int: " + valorInt + "                    |");
        System.out.println("| ---------------------------------------------------|");
    }
}
