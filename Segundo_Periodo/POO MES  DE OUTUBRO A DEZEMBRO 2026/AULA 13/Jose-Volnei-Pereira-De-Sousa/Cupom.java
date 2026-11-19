public class Cupom implements Validavel {
    private String codigoValido;

    public Cupom(String codigoValido) {
        this.codigoValido = codigoValido;
    }

    @Override
    public boolean validar(String codigo) {
        return this.codigoValido.equals(codigo);
    }
}