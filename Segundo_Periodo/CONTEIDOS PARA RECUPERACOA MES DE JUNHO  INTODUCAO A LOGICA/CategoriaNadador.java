import java.util.Scanner;

public class CategoriaNadador{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        if (idade >= 2 && idade <= 6) {
            System.out.println("Categoria: Criança");
        } else if (idade >= 7 && idade <= 10) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 11 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade inválida");
        }

        teclado.close();
    }
}
