/*
*Codifique um algoritmo em Java que leia a idade e a renda salarial de uma pessoa e classifique
 * esse usuário da seguinte forma: Caso a idade seja inferior a 18 anos, imprima na tela que o usuário 
 * é menor de idade e por isso não é elegível para receber o benefício. Caso a idade seja maior ou igual
  * a 18 anos, verifique se a renda informada é menor do que R$ 2.000,00 (dois mil reais), e, caso seja, 
  * imprima na tela que o usuário tem direito a receber um benefício básico. Caso a idade seja maior ou igual 
  * a 18 anos, verifique se a renda informada é maior ou igual a R$ 2.000,00 (dois mil reais), e, caso seja, 
  * imprima na tela que o usuário tem direito a receber um benefício parcial, caso contrário, imprima na tela
  * que o usuário não é elegível para receber benefício
 */
import java.util.Scanner;

public class Questao16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade");
        int idade = sc.nextInt();
        System.out.println(" Digite a renda salarial");
        double salarioFixo = sc.nextDouble();
        if (idade < 18) {
            System.out.println("menor de idade nao e elegivel para receber  benefico");

        } else {
            if (idade >= 18 && salarioFixo < 2000) {
                System.out.println("Tem direito a receber o beneficio basico");

            } else {
                if (idade >= 18 && salarioFixo >= 2000) {
                    System.out.println(" Tem direito a receber um beneficio parcial");

                } else {
                    System.out.println(" Nao tem direito a receber beneficio");

                }

            }
        }

        sc.close();
    }
}
/*
import java.util.Scanner;

public class Questao16 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite a idade:");
int idade = sc.nextInt();

System.out.println("Digite a renda salarial:");
double salarioFixo = sc.nextDouble();

if (idade < 18) {
System.out.println("Menor de idade não é elegível para receber benefício.");
} else if (salarioFixo < 2000) {
System.out.println("Tem direito a receber o benefício básico.");
} else if (salarioFixo >= 2000) {
System.out.println("Tem direito a receber um benefício parcial.");
} else {
System.out.println("Não tem direito a receber benefício.");
}

sc.close();
}
}
*/