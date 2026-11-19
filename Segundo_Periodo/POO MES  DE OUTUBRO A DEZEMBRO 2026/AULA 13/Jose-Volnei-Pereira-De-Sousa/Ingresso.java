public class Ingresso implements Validavel {
    private String codigoAcesso;

    public Ingresso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public boolean validar(String codigo) {
        return this.codigoAcesso.equals(codigo);
    }
}