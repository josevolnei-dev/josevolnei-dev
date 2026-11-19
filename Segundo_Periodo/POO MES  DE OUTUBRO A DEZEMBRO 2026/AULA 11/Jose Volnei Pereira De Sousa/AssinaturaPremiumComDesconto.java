public class AssinaturaPremiumComDesconto extends Assinatura {
    private double desconto;

    public AssinaturaPremiumComDesconto(String nome, double valorMensal,
                                        double desconto) {
        super(nome, valorMensal);
        this.desconto = desconto;
    }

    @Override
    public double calcularValor() {
        return valorMensal - (valorMensal * desconto / 100);
    }
}