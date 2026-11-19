public class Main {
    public static void main(String[] args) {

        Assinatura basica = new AssinaturaBasica("Básica", 29.90);

        Assinatura consumo = new AssinaturaPorConsumo(
            "Por Consumo", 19.90, 5, 3.00
        );

        Assinatura premium = new AssinaturaPremiumComDesconto(
            "Premium", 59.90, 10
        );

        System.out.println("=== SISTEMA DE ASSINATURAS ===");

        basica.exibirDados();
        System.out.println();

        consumo.exibirDados();
        System.out.println();

        premium.exibirDados();
    }
}