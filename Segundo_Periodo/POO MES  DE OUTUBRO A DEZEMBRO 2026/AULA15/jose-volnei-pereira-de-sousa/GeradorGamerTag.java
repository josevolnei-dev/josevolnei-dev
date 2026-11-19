
import java.util.Scanner;

public class GeradorGamerTag {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite o nome completo do jogador:");
        String nome = sc.nextLine();

        
        nome = nome.trim();

        
        String[] partes = nome.split(" ");

        
        char primeiraLetra = partes[0].charAt(0);

        
        String sobrenome = partes[partes.length - 1];

        
        String gamerTag = (primeiraLetra + "_" + sobrenome).toLowerCase();

        
        String codigo = sobrenome.substring(0, 3);

        
        codigo = (codigo + nome.length()).toLowerCase();

        
        System.out.println("\n*** Inscrição Confirmada — Arena Byte ***");
        System.out.println("Nome Completo: " + nome);
        System.out.println("Gamer Tag: " + gamerTag);
        System.out.println("Código de Jogador: " + codigo);

        sc.close();
    }
}
