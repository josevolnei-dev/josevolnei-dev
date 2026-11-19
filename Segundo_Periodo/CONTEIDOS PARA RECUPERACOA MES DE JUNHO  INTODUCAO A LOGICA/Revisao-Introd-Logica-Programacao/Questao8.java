/* Aula 7: Questão 3: Codifique um algoritmo em Java que, a partir da idade de um nadador, 
*   classifique o mesmo nas categorias: 
*   criança (2 - 6 anos), 
*   infantil (7 - 10 anos), 
*   juvenil (11 - 17 anos) e 
*   adultos (maior que 18 anos).
*/

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade ");
        int idade = sc.nextInt();
        if( idade >= 2 && idade <= 6 ){
            System.out.println(" crianca ");
        }else if( idade >= 7 && idade <= 10){
            System.out.println(" infantil ");

        }else if( idade >= 11 && idade <= 17){
            System.out.println(" juvenil ");
        }else if (idade >= 18){
            System.out.println(" maior de idade ");
        }else{
            System.out.println(" idade invalida ");
        }

        sc.close();
    }
}