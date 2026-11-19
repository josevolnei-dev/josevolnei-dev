// Define uma interface pública chamada Validavel. 
// Uma interface não é uma classe comum; ela funciona como um "contrato" de comportamento.
public interface Validavel {

    // Declara um método abstrato (sem corpo/sem chaves) chamado validar.
    // Ele exige que qualquer classe que assine este contrato receba uma String (o código) 
    // e devolva obrigatoriamente um valor booleano (true ou false).
    boolean validar(String codigo);
    
}
/*

Explicação da Relação: Esta é a Interface. Ela não guarda dados e não 
tem lógica pronta. O papel dela é unificar comportamentos: ela diz o que 
deve ser feito, mas deixa para as classes que a implementam decidirem 

como vai ser feito.




*/