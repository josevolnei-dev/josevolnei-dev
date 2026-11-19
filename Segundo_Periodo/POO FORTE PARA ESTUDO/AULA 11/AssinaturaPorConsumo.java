public class AssinaturaPorConsumo extends Assinatura {

    public AssinaturaPorConsumo(String nome, double valorBase) {
        super(nome, valorBase);
    }

    @Override
    public double calcularValor() {
        return getValorBase() + 0.50 * getConsumo();
    }
}
/*
Explicação: essa classe representa uma assinatura cujo preço aumenta
 conforme o consumo. Ela herda os atributos e métodos da classe Assinatura e 
 sobrescreve o método calcularValor().
4. Ar





*/