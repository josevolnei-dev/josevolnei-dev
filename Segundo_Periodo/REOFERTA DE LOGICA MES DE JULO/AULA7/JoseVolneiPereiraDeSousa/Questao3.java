/*Codifique um algoritmo em Java que, a partir da idade de um 
nadador, classifique o mesmo nas categorias: criança 
(2 - 6 anos), infantil (7 - 10 anos), juvenil (11 - 17 anos) 
e adultos (maior que 18 anos).

*/
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite a idade do nadador");
            int idade = sc.nextInt();

            if(idade >= 2 && idade <= 6){
                System.out.println(" categoria infantil");

            }else if( idade >= 7 && idade <= 10){
                System.out.println(" categoria juvenil");
                
            }else if( idade >= 11 && idade <= 17){
                System.out.println(" categoria adulto");
            }
        

        sc.close();
    }
}