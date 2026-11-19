/*  Aula 7 - Questão 5: Codifique um algoritmo em Java que leia a altura e 
*   o peso de uma pessoa e diga se ela está no peso normal. 
*   Para saber se o peso está normal, 
*   o resultado do cálculo deve ser maior ou igual a 18.5 e menor que 25.
 */
    
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura");
        double altura = sc.nextDouble();
        System.out.println("Digite o  peso");
        double peso = sc.nextDouble();
    
        double IMC = peso / (altura * altura);
    
    if(IMC >= 18.5 && IMC < 25){
        System.out.println(" peso normal");
    }else{
    System.out.println(" fora de peso normal"); 
    }

        sc.close();
    }
}
