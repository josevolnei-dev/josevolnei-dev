/*faca um algoritimo  para calcular a medi se >=6 aprovado
* media >=4 && <6 recuperacao
* se media < 4reprovado */
import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor n1");
        int n1 = sc.nextInt();
        System.out.println("Digite o valor de n2");
        int n2 = sc.nextInt();

        double media = (n1 + n2)/2.0;

        if(media >= 6){
            System.out.println("Aprovado");

        }else if(media >= 4 && media < 6){
            System.out.println("Recuperacao");

        }else{
            System.out.println("Reprovado");
        }



        sc.close();
    }
}