public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Maria");
        aluno.setMatricula("2023001");
        aluno.setNota(8.5);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota: " + aluno.getNota());

        if (aluno.aprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}