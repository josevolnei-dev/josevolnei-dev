public class Main {

    public static void main(String[] args) {

        Cupom cupom = new Cupom("DESC10");

        Ingresso ingresso = new Ingresso("EVENTO123");

        System.out.println("=== VALIDACAO DO CUPOM ===");

        System.out.println("Codigo correto: " +
            (cupom.validar("DESC10") ? "Valido" : "Invalido"));

        System.out.println("Codigo incorreto: " +
            (cupom.validar("ERRADO") ? "Valido" : "Invalido"));

        System.out.println();

        System.out.println("=== VALIDACAO DO INGRESSO ===");

        System.out.println("Codigo correto: " +
            (ingresso.validar("EVENTO123") ? "Valido" : "Invalido"));

        System.out.println("Codigo incorreto: " +
            (ingresso.validar("OUTRO") ? "Valido" : "Invalido"));
    }
}