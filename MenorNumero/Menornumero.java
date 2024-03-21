package MenorNumero;
//Escreva um programa que leia 2 números e verifique se ele é menor em seguida imprima o resultado.

import java.util.Scanner;

public class Menornumero {

    public static void main(String[] args) {
        int n1,n2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite um segundo numero: ");
        n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.println("O numero " + n1 + " é maior que o " + n2);
        } else {
            System.out.println("O numero " + n2 + " é maior que " + n1);
        }
    }
}
