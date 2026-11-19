
public class RotaAcessivelMain {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ROTA ACESSÍVEL (DEMO POO) ===\n");

        // 1. Criando instâncias (Objetos)
        Usuario usuario1 = new Usuario(1, "Ana Souza", "ana@email.com", "Colaboradora");
        
        Estabelecimento cafe1 = new Estabelecimento(
            1,
            "Cafeteria Sabor & Grão",
            "Alimentação",
            "Rua das Flores, 123",
            true,  // Possui rampa
            false, // Banheiro adaptado
            false  // Elevador
        );

        // 2. Exibindo os dados do estabelecimento
        cafe1.exibirDetalhes();

        // 3. Usuário realiza uma avaliação sobre a acessibilidade do local
        Avaliacao avaliacao1 = new Avaliacao(
            1,
            usuario1,
            cafe1,
            4,
            "O local possui rampa excelente na entrada, mas o banheiro é apertado para cadeira de rodas."
        );

        // 4. Exibindo a avaliação gerada
        avaliacao1.exibirAvaliacao();
    }
}