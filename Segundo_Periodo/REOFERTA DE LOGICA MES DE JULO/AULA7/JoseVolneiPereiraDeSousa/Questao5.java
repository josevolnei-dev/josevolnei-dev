/*Codifique um algoritmo em Java que leia a altura e o peso
de uma pessoa e diga se ela está no peso normal. Para saber
se o peso está normal, o resultado do cálculo deve ser maior
   ou igual a 18 25*/
   import java.util.Scanner;
   public class Questao5 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double altura;
   double peso;
   double imc;

   System.out.println("Digite a altura da pessoa em metros");
   altura = sc.nextDouble();
   System.out.println("Digite o peso da pessoa em kg");
   peso = sc.nextDouble();

         imc = peso / (altura * altura);
         if (imc >= 18 && imc <= 25){
            System.out.println("a pessoa esta com peso normal");

         }else{
            System.out.println(" pesoa fora do peso normal");

         }


         sc.close();
      }
   }