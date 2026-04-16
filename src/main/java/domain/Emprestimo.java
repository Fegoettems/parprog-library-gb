package domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Emprestimo(Livro livro, Usuario usuario) {
        if (!livro.isDisponivel()) {
            throw new IllegalStateException("Livro não está disponível para empréstimo.");
        }

        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();

        livro.emprestar();
    }

    public void devolverLivro() {
        if (dataDevolucao != null) {
            System.out.println("Livro já foi devolvido.");
            return;
        }

        livro.devolver();
        this.dataDevolucao = LocalDate.now();
    }

    public void exibirResumoEmprestimo() {
        System.out.println("Resumo do Empréstimo:");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNome() +
                " (" + usuario.exibirTipoUsuario() + ")");
        System.out.println("Data do Empréstimo: " +
                dataEmprestimo.format(FORMATTER));
    }
}
