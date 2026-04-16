package domain;

public class Aluno extends Usuario{

    private String curso;

    public Aluno(String nome, Long id, String curso) {
        super(nome, id);
        this.curso = curso;
    }

    @Override
    public String exibirTipoUsuario() {
        return "Aluno";
    }
}
