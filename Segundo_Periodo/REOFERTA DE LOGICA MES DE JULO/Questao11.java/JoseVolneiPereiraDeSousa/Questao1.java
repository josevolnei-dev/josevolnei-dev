/*Em um sistema de cadastro de participantes
de um evento acadêmico, é necessário 
registrar e consultar nomes para fins de
controle de presença. Desenvolva um
algoritmo em Java que solicite ao usuário
    a entrada de 8 nomes de participantes,
    armazenando-os em um vetor. Em seguida,
    o sistema deve solicitar um nome para
    busca e informar quantas vezes esse nome
    aparece no vetor.
*/import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[8];

        int contador = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome do participante: ");
            nomes[i] = ler.nextLine();
        }

        System.out.print("Digite um nome para buscar: ");
        String busca = ler.nextLine();

        for (int i = 0; i < 8; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                contador++;
            }
        }

        System.out.println("O nome aparece " + contador + " vezes.");

        ler.close();
    }
}