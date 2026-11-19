import java.util.Scanner;

public class NomeAnoDiasVividos{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        int anoNascimento;
        int idade;
        int diasVividos;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = teclado.nextInt();

        idade = 2026 - anoNascimento;

        diasVividos = idade * 365;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Dias vividos: " + diasVividos);
        
        teclado.close();
    }
}