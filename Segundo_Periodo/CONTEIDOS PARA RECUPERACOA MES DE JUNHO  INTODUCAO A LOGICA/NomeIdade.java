import java.util.Scanner;

public class NomeIdade{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        int anoNascimento;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();

        idade = 2026 - anoNascimento;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        teclado.close();
    }
}