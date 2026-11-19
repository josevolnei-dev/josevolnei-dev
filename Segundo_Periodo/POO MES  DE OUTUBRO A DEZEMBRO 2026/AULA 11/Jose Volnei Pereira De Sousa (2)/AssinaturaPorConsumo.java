public class AssinaturaPorConsumo extends Assinatura {
    private int horasExtras;
    private double valorPorHora;

    public AssinaturaPorConsumo(String nome, double valorMensal,
                                int horasExtras, double valorPorHora) {
        super(nome, valorMensal);
        this.horasExtras = horasExtras;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularValor() {
        return valorMensal + (horasExtras * valorPorHora);
    }
}