package estudo.de.caso.intro;

//Peça ao usuário para digitar três valores inteiros e imprima a soma deles

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3;

        System.out.printf("Insira um número: ");
        num1 = ler.nextInt();

        System.out.printf("Insira o segundo número: ");
        num2 = ler.nextInt();

        System.out.printf("Insira o terceiro número: ");
        num3  = ler.nextInt();


        System.out.printf( "O total da soma é = %d", (num1 + num2 + num3));


    }
}
