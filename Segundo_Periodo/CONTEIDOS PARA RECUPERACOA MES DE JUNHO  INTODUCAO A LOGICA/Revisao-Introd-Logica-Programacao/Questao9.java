/*  Aula 7 - Questão 4: Codifique um algoritmo em Java que calcule o desconto de 
*   2% sobre o valor total de uma compra cujo valor final seja superior a R$ 200,00 (duzentos reais).
*   Considere como dados de entrada: nome do produto, valor unitário e quantidade comprada. 
*   A saída deverá apresentar o valor total da compra sem o desconto, 
*   o valor do desconto (caso tenha sido atribuído) 
*   e o valor total já com o desconto aplicado (caso exista).
/* /* */
import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
    
        System.out.println(" Digite o  nome do produto ");
        String produto = sc.nextLine();
        System.out.println(" digite  a quantidade ");
        int quantidade = sc.nextInt();
        System.out.println(" Digite valor unitario ");
        double valorUnitario = sc.nextInt();

        double total = (valorUnitario * quantidade);
        double desconto = 0;

        if( total  > 200){
            desconto =  total * 0.02;
        }
        double totalFinal = total - desconto;

        System.out.println(" produto"  +  produto );
        System.out.println(" valorTotal \tR$ " + total );
        System.out.println(" desconto  \tR$ " + desconto  );
        System.out.println("valor com desconto  \tR$  "  +  totalFinal );


        sc.close();
    }
}