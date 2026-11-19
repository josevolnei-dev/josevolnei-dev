// Declara uma classe pública chamada Cupom que assume o contrato da interface Validavel 
// usando a palavra-chave "implements".
public class Cupom implements Validavel {

    // Atributo privado que armazena o código de desconto válido deste cupom específico.
    // É privado (private) para garantir o encapsulamento (segurança dos dados).
    private String codigoValido;

    // Método Construtor: é executado automaticamente quando criamos um novo Cupom com "new Cupom(...)".
    // Ele recebe o código por parâmetro e guarda dentro do atributo da classe.
    public Cupom(String codigoValido) {
        this.codigoValido = codigoValido;
    }

    // A anotação @Override indica que estamos sobrescrevendo/implementando 
    // o método abstrato que era obrigatório lá na interface Validavel.
    @Override
    public boolean validar(String codigo) {
        // Compara se o código que veio por parâmetro é igual ao código salvo no objeto.
        // O método .equals() retorna true se forem iguais e false se forem diferentes.
        return this.codigoValido.equals(codigo);
    }
    
}
/*
Explicação da Relação: Esta é uma Classe Concreta. Ela é obrigada a 
implementar o método da interface Validavel. Como ela tem seus próprios 
atributos (codigoValido), ela cumpre 
o contrato do seu jeito.


*/