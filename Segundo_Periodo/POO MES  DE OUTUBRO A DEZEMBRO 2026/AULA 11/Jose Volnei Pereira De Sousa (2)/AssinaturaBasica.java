public class AssinaturaBasica extends Assinatura {

    public AssinaturaBasica(String nome, double valorMensal) {
        super(nome, valorMensal);
    }

    @Override
    public double calcularValor() {
        return valorMensal;
    }
}