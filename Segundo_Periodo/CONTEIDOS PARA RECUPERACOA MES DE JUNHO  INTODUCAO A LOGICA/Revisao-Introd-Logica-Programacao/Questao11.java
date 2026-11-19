/*cria um algoritimo que calcule  a medidia de duas notas
*peca o usuario para digita  se a media for >= 6 aprovado
senao reprovado
 */
import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nota n1");
        int n1 = sc.nextInt();
        System.out.println("Digite nota n2");
        int n2 = sc.nextInt();
        double media = (n1 + n2) /2;

        if(media >= 6){
            System.out.println("aprovado");

        }else{
            System.out.println("reprovado");
        }


        sc.close();
    }
}