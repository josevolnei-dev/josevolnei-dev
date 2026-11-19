/*Codifique um algoritmo em Java que leia o valor de uma compra e 
* o método de pagamento (à vista ou não) e mostre o valor final a ser pago. 
* Para considerar o valor final a ser pago, considere que a loja oferece desconto 
* para compras à vista, mas o desconto varia dependendo do valor da compra. Se o valor
  * for menor que R$ 100, não há desconto. Se for entre R$ 100 e R$ 500, o desconto é de 5%. 
* Se for maior que R$ 500, o desconto é de 10%. Além disso, se o pagamento for em dinheiro, 
 * há um adicional de 2% de desconto sobre o valor já descontado.



*//*Codifique um algoritmo em Java que leia o valor de uma compra e 
* o método de pagamento (à vista ou não) e mostre o valor final a ser pago. 
* Para considerar o valor final a ser pago, considere que a loja oferece desconto 
* para compras à vista, mas o desconto varia dependendo do valor da compra. Se o valor
  * for menor que R$ 100, não há desconto. Se for entre R$ 100 e R$ 500, o desconto é de 5%. 
* Se for maior que R$ 500, o desconto é de 10%. Além disso, se o pagamento for em dinheiro, 
 * há um adicional de 2% de desconto sobre o valor já descontado.



*/

/*
Primeiro passo

Você lê:

valor da compra
se é à vista ou não
se paga em dinheiro
2. Segundo passo (desconto base)
< 100 → 0%
100 a 500 → 5%

500 → 10%

3. Terceiro passo

Aplica o desconto no valor.

4. Quarto passo

Se for dinheiro:

tira mais 2% em cima do valor já com desconto


*/
import java.util.Scanner;

public class Questao23 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double valorCompra, valorFinal;
int pagamento; // 1 = à vista, 2 = não à vista
int dinheiro; // 1 = dinheiro, 2 = outro

System.out.print("Digite o valor da compra: ");
valorCompra = sc.nextDouble();

System.out.print("Forma de pagamento (1 à vista / 2 não à vista): ");
pagamento = sc.nextInt();

System.out.print("Pagamento em dinheiro? (1 sim / 2 não): ");
dinheiro = sc.nextInt();

double desconto = 0;

// regra do valor da compra
if (valorCompra < 100) {
desconto = 0;
}
else if (valorCompra <= 500) {
desconto = 0.05;
}
else {
desconto = 0.10;
}

// aplica desconto base
valorFinal = valorCompra - (valorCompra * desconto);

// desconto extra se for dinheiro
if (dinheiro == 1) {
valorFinal = valorFinal - (valorFinal * 0.02);


System.out.println("Valor final a pagar: R$ " + valorFinal);

sc.close();
}
}
