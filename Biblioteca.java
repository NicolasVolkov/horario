package Prova.usuarios;

import Prova.usuarios.Usuario;

public class Biblioteca {
    private String nome;
    private String cidade;
    private Usuario usuario;

    public Biblioteca(String nome, String cidade, Usuario usuario) {
        this.nome = nome;
        this.cidade = cidade;
        this.usuario= usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
