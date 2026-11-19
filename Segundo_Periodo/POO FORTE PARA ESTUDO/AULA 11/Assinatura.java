
public abstract class Assinatura { // Cria a classe pai abstrata chamada Assinatura.

    protected String nome; // Atributo que guarda o nome do plano.
    protected double valorMensal; // Atributo que guarda o preço mensal.

    public Assinatura(String nome, double valorMensal) { // Construtor da classe pai.
        this.nome = nome; // Guarda o nome recebido no atributo nome.
        this.valorMensal = valorMensal; // Guarda o preço recebido no atributo valorMensal.
    } // Fecha o construtor.

    public abstract double calcularValor(); // Método abstrato que as classes filhas devem implementar.

    public void exibirDados() { // Método que mostra os dados do plano.
        System.out.println("Plano: " + nome); // Imprime o nome do plano.
        System.out.printf("Valor mensal: R$ %.2f%n", calcularValor()); // Imprime o valor calculado com duas casas decimais.
    } // Fecha o método exibirDados.

} // Fecha a classe Assinatura.
/*
Explicação de onde veio cada parte
- class Assinatura: cria uma classe chamada Assinatura.
- abstract: torna a classe abstrata. Não podemos criar diretamente um objeto
 dessa classe com new Assinatura(...).
- protected: permite acesso dentro da classe, nas subclasses e no mesmo pacote, 
conforme as regras do Java.
- String nome: é um atributo criado nessa classe para guardar texto.
- double valorMensal: é outro atributo criado nessa classe para guardar um valor decimal.
- Assinatura(...): é o construtor. Tem o mesmo nome da classe.
- this.nome: é o atributo do objeto atual.
- nome: é o parâmetro recebido pelo construtor.
- abstract double calcularValor(): declara um método sem implementação. As classes concretas 
precisam fornecer o cálculo.
- void exibirDados(): método comum que já tem seu código implementado.
- System.out.println: imprime texto e pula uma linha.
- System.out.printf: imprime texto formatado. %.2f significa duas casas decimais e %n
 representa uma quebra de linha.
De onde veio? Esta classe é a origem dos atributos nome e valorMensal, do método
 exibirDados() e da declaração de calcularValor(). As outras classes vão herdar dela.

2. Arquiv









*/