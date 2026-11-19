// Classe principal do sistema, responsável por executar o programa através do método main.
public class Main {

    // Ponto de entrada padrão do Java onde a execução começa.
    public static void main(String[] args) {
        
        // Instancia (cria) um objeto do tipo Cupom na memória, definindo seu código válido como "PROMO2026".
        Cupom meuCupom = new Cupom("PROMO2026");
        
        // Instancia (cria) um objeto do tipo Ingresso na memória, definindo seu código como "SHOWVIP123".
        Ingresso meuIngresso = new Ingresso("SHOWVIP123");

        // Imprime títulos e executa os testes de validação para o Cupom.
        System.out.println("--- Testes de Validação do Cupom ---");
        
        // Testa passando o código correto ("PROMO2026") -> Deve retornar true.
        System.out.println("Testando com código correto (PROMO2026): " + meuCupom.validar("PROMO2026"));
        
        // Testa passando um código incorreto ("ERRADO123") -> Deve retornar false.
        System.out.println("Testando com código incorreto (ERRADO123): " + meuCupom.validar("ERRADO123"));

        // Imprime títulos e executa os testes de validação para o Ingresso.
        System.out.println("\n--- Testes de Validação do Ingresso ---");
        
        // Testa passando o código correto ("SHOWVIP123") -> Deve retornar true.
        System.out.println("Testando com código correto (SHOWVIP123): " + meuIngresso.validar("SHOWVIP123"));
        
        // Testa passando um código incorreto ("FALSO999") -> Deve retornar false.
        System.out.println("Testando com código incorreto (FALSO999): " + meuIngresso.validar("FALSO999"));
        
    }
    
}

/*
Explicação da Relação: A classe Main é o motor de testes. Ela simula o
 uso real criando os objetos (new) e acionando o comportamento padronizado 
 pela interface (.validar(...)), gerando a saída visual no console 
necessária para o print da atividade.





*/