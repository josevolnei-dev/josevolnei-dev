/*   Questão 4: Codifique um algoritmo em Java que resolva o seguinte problema:
*   O usuário deverá informar dois números que aceite casas decimais e 
*    o algoritmo deverá realizar o cálculo exponencial desses números e 
*   exibir o resultado na tela para o usuário.
*/
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double  n1 = sc.nextDouble();
        System.out.println("Digite o segundo numemero ");
        double n2 = sc.nextDouble();

        double exponencial =  Math.pow(n1,n2);
        System.out.println("calculo exponencia de " + n1 + " e " + n2 + " é "  +  exponencial);
        sc.close();
    }
}
