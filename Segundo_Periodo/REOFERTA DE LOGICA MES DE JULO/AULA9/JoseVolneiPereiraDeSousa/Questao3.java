
/*
Considerando o desenvolvimento de um módulo que realiza 
verificações numéricas básicas, elabore um algoritmo em 
Java que:

- Solicite ao usuário a digitação de um número inteiro 
positivo;

- Verifique se o número informado é primo — isto é, divisível
apenas por 1 e por ele mesmo;

- Apresente uma mensagem indicando o resultado da verificação.

A implementação deve utilizar obrigatoriamente as estruturas
de repetição While e Do While.

*/

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = ler.nextInt();
        } while (numero <= 0);

        int divisor = 2;
        boolean primo = true;

        while (divisor < numero) {

            if (numero % divisor == 0) {
                primo = false;
                break;
            }

            divisor++;
        }

        if (numero == 1) {
            primo = false;
        }

        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        ler.close();
    }
}