/*

Atividade: Encapsulamento com a Classe Aluno

Nesta atividade, você vai praticar o conceito de encapsulamento em Java, protegendo os atributos de uma classe e permitindo o acesso a eles somente por meio de métodos públicos.

Valor 10 pontos.

Entrega: código fonte e print da execução do código.
Objetivo da atividade

    Entender por que atributos devem ser privados.

    Aprender a usar métodos getters e setters para controlar o acesso.

    Implementar regras de validação para manter a integridade dos dados.

Descrição do problema

Crie uma classe chamada Aluno que deve armazenar as seguintes informações:

    nome (texto)

    matricula (texto)

    nota (número decimal)

⚠️ Importante: os atributos devem ser privados, ou seja, não podem ser acessados diretamente de fora da classe.
Regras que você deve aplicar

    O atributo nota deve ser validado no momento em que for definido:

        Só pode receber valores entre 0 e 10.

        Caso o valor esteja fora desse intervalo, a nota não deve ser alterada.

    Crie um método aprovado() que retorna:

        true se a nota for maior ou igual a 6.

        false se a nota for menor que 6.

    Crie uma classe Main que faça o seguinte:

        Crie um objeto Aluno.

        Defina o nome, a matrícula e a nota.

        Exiba as informações do aluno e diga se ele foi aprovado ou reprovado.

Exemplo esperado na saída do programa:

Aluno:Maria-Matrícula:2023001

Nota:8.5

Situação:Aprovado
Tentativa válida
Tentativa 1 	
Envio: 04/09/2026 - 20:52
	
Nota: 10 / 10
Tentativa 2 de 2

Resposta
p
Distribuído por Tiny
Arquivos permitidos: JPG, JPEG, PNG, GIF, TXT, PDF,
 DOC, DOCX, XLS, XLSX, PPT, PPTX, RAR, ZIP, 7Z
Quantidade máxima de arquivos: 1
Tamanho máximo por arquivo: 150mb
Fórum
*/
public class Aluno {

    private String nome;
    private String matricula;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public boolean aprovado() {
        return nota >= 6;
    }
}