package domain;

public abstract class Usuario {

    protected String nome;
    protected Long id;

    protected Usuario(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract String exibirTipoUsuario();

    public String getNome() {
        return nome;
    }
}
