import domain.*;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin", "111");
        Livro livro2 = new Livro("Effective Java", "Joshua Bloch", "222");

        Usuario aluno = new Aluno("João Silva", 1L, "Computação");
        Usuario professor = new Professor("Matheus Augusto", 2L, "Engenharia");

        System.out.println("\n");
        Emprestimo emprestimo1 = new Emprestimo(livro1, aluno);
        emprestimo1.exibirResumoEmprestimo();

        System.out.println("\n");
        try {
            Emprestimo emprestimoComErro = new Emprestimo(livro1, professor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        Emprestimo emprestimo2 = new Emprestimo(livro2, professor);
        emprestimo2.exibirResumoEmprestimo();

        System.out.println("\n");
        emprestimo1.devolverLivro();
        emprestimo1.exibirResumoEmprestimo();

        System.out.println("\n");
        Emprestimo emprestimo3 = new Emprestimo(livro1, professor);
        emprestimo3.exibirResumoEmprestimo();
    }
}
