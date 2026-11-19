
/*Codifique um algoritmo em Java que calcule o desconto de 2%
 sobre o valor total de uma compra cujo valor final seja 
 superior a R$ 200,00 (duzentos reais). Considere como dados
  de entrada: nome do produto, valor unitário e quantidade 
  comprada. A saída deverá apresentar o valor total da compra 
  sem o desconto, o valor do desconto (caso tenha sido 
  atribuído) e o valor total já com o desconto aplicado 
  (caso exista).

*/
import java.util.Scanner;

public class Questao4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nomeProduto;
    double valorUnitario;
    double quantidade;
    double valorTotal;
    double desconto;
    double valorFinal;

    System.out.println("Digite o nomeProduto do produto");
    nomeProduto = sc.nextLine();
    System.out.println("Digite o valor unitario do produto");
    valorUnitario = sc.nextDouble();
    System.out.println("Digite a quantidade comprada");
    quantidade = sc.nextDouble();
    valorTotal = valorUnitario * quantidade;

    if (valorTotal > 200) {
      desconto = valorTotal * 0.02;
      valorFinal = valorTotal - desconto;
      
      System.out.println("Valor total da compra sem desconto: " + valorTotal);
      System.out.println("Valor do desconto: " + desconto);
      System.out.println("Valor total com desconto aplicado: " + valorFinal);
    } else {
      System.out.println("Valor total da compra sem desconto: " + valorTotal);
      System.out.println("Não houve desconto aplicado.");
    }

    sc.close();
  }
}