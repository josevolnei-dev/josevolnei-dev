/*
*   Questão 2: Codifique um algoritmo em Java que resolva o seguinte problema:
*    O usuário deverá informar três números que aceite casas decimais e 
*    o algoritmo deverá realizar o cálculo da média desses números e 
*    exibir o resultado na tela para o usuário.
*
 */
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero primeiro numero");
        double n1 = sc.nextDouble();
        System.out.println("digite o segundo numeronumero ");
        double n2 = sc.nextDouble();

        System.out.println("digite terceiro numero ");
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3)/3;
        System.out.println("(" + n1 + "+"  + n2 + "+" + n3 +  ") / 3 = "  + media);

        sc.close();
    }
}

