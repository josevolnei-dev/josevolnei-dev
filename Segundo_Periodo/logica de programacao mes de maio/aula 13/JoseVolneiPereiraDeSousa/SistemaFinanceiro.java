import java.util.Scanner;


public class SistemaFinanceiro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        
        System.out.println("informe oito numeros");
        
        for(int i = 0; i < 8; i++){
            numeros[i] = sc.nextInt();
        }
        System.out.println("numeros pares do vetor sao:");
        
        for(int j = 0; j < 8; j++){
            if(numeros[j]%2 == 0){
                System.out.println(numeros[j]);
            }
        }



        sc.close();
    }
}