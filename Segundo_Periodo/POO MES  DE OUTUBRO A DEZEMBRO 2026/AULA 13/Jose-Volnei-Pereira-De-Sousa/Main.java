public class Main {
    public static void main(String[] args) {
        Cupom meuCupom = new Cupom("PROMO2026");
        Ingresso meuIngresso = new Ingresso("SHOWVIP123");

        System.out.println("--- Testes de Validação do Cupom ---");
        System.out.println("Testando com código correto (PROMO2026): " + meuCupom.validar("PROMO2026"));
        System.out.println("Testando com código incorreto (ERRADO123): " + meuCupom.validar("ERRADO123"));

        System.out.println("\n--- Testes de Validação do Ingresso ---");
        System.out.println("Testando com código correto (SHOWVIP123): " + meuIngresso.validar("SHOWVIP123"));
        System.out.println("Testando com código incorreto (FALSO999): " + meuIngresso.validar("FALSO999"));
    }
}