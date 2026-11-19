/*Codifique um algoritmo em Java que resolva o seguinte 
problema: O usuário deverá informar dois números inteiros
e o algoritmo deverá realizar a soma desses números e
exibir o resultado na tela
para o usuário

 */
import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");

        int n2 = sc.nextInt();

        int soma = (n1 + n2);
        System.out.println("A soma " + n1 + "  + " + n2 +  "  =  " + soma);

        sc.close();
    }
}
