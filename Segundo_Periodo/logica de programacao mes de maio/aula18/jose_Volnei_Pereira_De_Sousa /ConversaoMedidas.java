import java.util.Scanner;

public class ConversaoMedidas {

    public static void converter(double valor, String origem, String destino) {

        double metros = 0;

        if (origem.equalsIgnoreCase("metro")) {
            metros = valor;
        } else if (origem.equalsIgnoreCase("centimetro")) {
            metros = valor / 100;
        } else if (origem.equalsIgnoreCase("quilometro")) {
            metros = valor * 1000;
        }

        double resultado = 0;

        if (destino.equalsIgnoreCase("metro")) {
            resultado = metros;
        } else if (destino.equalsIgnoreCase("centimetro")) {
            resultado = metros * 100;
        } else if (destino.equalsIgnoreCase("quilometro")) {
            resultado = metros / 1000;
        }

        System.out.println("Resultado: " + resultado + " " + destino);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        sc.nextLine();

        System.out.print("Unidade de origem (metro, centimetro ou quilometro): ");
        String origem = sc.nextLine();

        System.out.print("Unidade de destino (metro, centimetro ou quilometro): ");
        String destino = sc.nextLine();

        converter(valor, origem, destino);
    }
}
