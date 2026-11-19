
import java.util.Scanner;

/*  Questão 3: Codifique um algoritmo em Java que resolva o seguinte problema: 
*   O usuário deverá informar seu nome, seu ano de nascimento e 
*    o algoritmo deverá exibir na tela para o usuário,
*   o nome informado e a idade do mesmo. 
*   Para calcular a idade, considere o ano atual menos o ano informado pelo usuário.
*
        variaveis: nome, ano_nascimento, idade
*
*/

public class Questao3 {
    public static void main(String[] args) {
        
        String nome;
        int idade, ano_nascimento;
        // Declaração das variaveis 

        Scanner teclado = new Scanner(System.in); // Metodo para capturar informação do teclado

        System.out.print("Informe o seu nome: ");  // Exibe mensagem ao usuario do programa
        nome = teclado.nextLine(); // captura e guarda a informação "NOME"  fornecida pelo usuario  atraves do teclado

        System.out.print("Informe o seu ano de nascimento: "); // Exibe mensagem ao usuario do programa
        ano_nascimento = teclado.nextInt(); // captura e guarda a informação "Ano de Nascimento"  fornecida pelo usuario  atraves do teclado

        idade = 2026 - ano_nascimento; //calculando a idade do usuario com base no ano atual e ano de nascimento

        System.out.println(nome + ", sua idade é: " + idade + " anos"); // exibindo o nome e a idade do usuario  



    }
}
