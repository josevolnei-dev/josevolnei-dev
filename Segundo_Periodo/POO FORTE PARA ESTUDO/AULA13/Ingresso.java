// Declara uma classe pública chamada Ingresso que também assume o contrato da interface Validavel.
public class Ingresso implements Validavel {

    // Atributo privado para armazenar o código de acesso exclusivo deste ingresso.
    private String codigoAcesso;

    // Método Construtor: inicializa o ingresso recebendo o código oficial no momento da criação.
    public Ingresso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    // Sobrescreve (implementa) obrigatoriamente o método validar exigido pela interface Validavel.
    @Override
    public boolean validar(String codigo) {
        // Retorna true se o código digitado for idêntico ao código de acesso do ingresso.
        return this.codigoAcesso.equals(codigo);
    }
    
}
/*

Explicação da Relação: Assim como o Cupom, esta classe implementa
 Validavel. Isso mostra o grande poder das interfaces: duas classes 
 totalmente diferentes (uma de bilheteria e outra de e-commerce) conseguem 
 assumir o mesmo comportamento de validação sem
 precisar herdarem uma da outra.



*/



