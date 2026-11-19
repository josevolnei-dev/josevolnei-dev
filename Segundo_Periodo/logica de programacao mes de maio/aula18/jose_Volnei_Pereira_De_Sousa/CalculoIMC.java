import java.util.Scanner;

public class CalculoIMC {

    public static void calcularIMC(double peso, double altura) {

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
            System.out.println("Mensagem: Procure ganhar peso de forma saudável.");
        }
        else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
            System.out.println("Mensagem: Continue mantendo hábitos saudáveis.");
        }
        else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
            System.out.println("Mensagem: Atenção à alimentação e exercícios.");
        }
        else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
            System.out.println("Mensagem: Recomenda-se acompanhamento médico.");
        }
        else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
            System.out.println("Mensagem: Busque orientação profissional.");
        }
        else {
            System.out.println("Classificação: Obesidade grau III");
            System.out.println("Mensagem: Procure acompanhamento médico especializado.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        calcularIMC(peso, altura);
    }
}
