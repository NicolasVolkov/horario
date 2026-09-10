package Prova.usuarios;

import Prova.livros.Livro;

public class Usuario {
    private String nome;
    private int matricula;
    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()){
            System.out.println("O nome do usuário não pode estar vazio");
        } else{
            this.nome = nome;
        }
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        if (nome == null || nome.trim().isEmpty()){
            System.out.println("A matrícula do usuário não pode estar vazia");
        } else{
            this.matricula = matricula;
        }
    }
    @Override
    public String toString() {
        return "usuarios.Usuario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
    public void realizarEmprestimo(Livro livro){
        System.out.println("O usuário "+ nome + " pegou emprestado o livro "+ livro.getLivro());
    }
}
