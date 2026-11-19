/* Codifique um algoritmo em Java que leia 3 números inteiros
e diga qual o maior e o menor deles.

*/import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println(" Digite o segundo numero");
        int num2 = sc.nextInt();
        System.out.println(" Digite o terceiro numero");
        int num3 = sc.nextInt();

        int maior = num1;
        int menor = num1;
        if(num2 > maior){
            maior = num2;
        }
        if(menor < num2){
            menor = num2;
        }
    if( maior > num3){
        maior = num3;

    


    }
    if(menor < num3){
        menor = num3;


        }
        System.out.println("maior" + menor);
        System.out.println("menor" + maior);

    

        sc.close();
    }
}

