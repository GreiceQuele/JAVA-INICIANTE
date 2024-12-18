package SINTAXE_BASICA;

public class ExemplosSintaxe {

    public static void main(String[] args) {
        
        // 1- primeira impressão de texto
System.out.println("Podemos imprimir isto aqui e também concatenar números como o número "  +45);

        // 2 - tipos primitivos
        //variavel = coloca dados
        // int= integer = inteiros

        int idade = 36;
        int anoAtual = 2024;

        System.out.println("Eu tenho  " + idade + " anos em " + anoAtual );

        double altura = 1.60;
        double pi = 3.14;

        System.out.println("Minha altura: " + altura + " e o valor de PI é:  " + pi);

        //TEXTOS - STRINGS

        String nome = "Greice Quele";

        System.out.println("Meu nome é " + nome);

        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("Está logada? "  + estaLogado);
        System.out.println("Acesso: " + temAcesso);

        // variaveis

        int numero;

        numero = 10;

        System.out.println(numero);

        numero = 15;

        System.out.println(numero);

        //A atribuição dever ser do mesmo tipo declarado
        //numero = "teste" aparece mensagem de erro!

        int x = 10, y = 15, z = 20;

        System.out.println(x + "  " + y + " " + z + " ");

        // operadores básicos
        // aritmeticas

        int a = 10;
        int b = 2;

        // () => resolvido primeiro
        //subtracao -> exibição

        System.out.println("A - B = " + (a-b));
        System.out.println("A + B = " + (a+b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));
        
        double c = 10;
        double d = 3;

        System.out.println("C / D = " + (c/d));

        // contador de incremento (+) e decremento (-)
        int contador = 0;

        contador++ ; 

        System.out.println("Valor contador: " + contador);

        contador--;
        contador--;
        contador--;

        System.out.println("Valor contador: " + contador);

        // op composto

        System.out.println("OP composto soma: " + (a+= 5));
        System.out.println("OP composto subtração: " + (b-= 5));
        System.out.println("OP composto multiplicação: " + (a*= 5));
        System.out.println("OP composto divisão: " + (a/= 5));
        
        







    }   
}
