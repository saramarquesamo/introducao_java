package estudo.de.caso.intro;

//Leia um número real e imprima o resultado do quadrado desse numero

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float num1;

        System.out.printf("Insira um número: ");
        num1 = ler.nextInt();


        System.out.printf("O quadrado deste número é = %f", (num1 * num1));

    }
}
