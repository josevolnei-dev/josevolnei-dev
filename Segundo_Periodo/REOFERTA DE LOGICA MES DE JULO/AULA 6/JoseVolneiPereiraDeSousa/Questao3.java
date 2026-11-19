/*Codifique um algoritmo em Java que resolva o seguinte problema:
    o  usuário deverá informar seu nome, seu ano de nascimento e o
algoritmo deverá exibir na tela para o usuário, o nome informado
e a idade do mesmo. Para calcular a idade, considere o ano atual
    menos o ano informado
pelo usuário.

 */
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int anoNascimento;
        int idade;

        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println(" Digite o ano de nascimento");
        anoNascimento = sc.nextInt();
        idade = 2026 - anoNascimento;
        System.out.println(" Nome " + nome);
        System.out.println(" Idade " + idade + " anos ");

        sc.close();
    }
}
