package domain;

public class Professor extends Usuario{

    private String departamento;

    public Professor(String nome, Long id, String departamento) {
        super(nome, id);
        this.departamento = departamento;
    }

    @Override
    public String exibirTipoUsuario() {
        return "Professor";
    }
}
