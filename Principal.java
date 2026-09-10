package Prova.Principall;

import Prova.livros.Livro;
import Prova.livros.LivroDigital;
import Prova.livros.LivroFisico;
import Prova.usuarios.Biblioteca;
import Prova.usuarios.Usuario;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new LivroDigital("Domcasmurro","Pedro Álvares Cabral", 1987, 333);
        Livro livro2 = new LivroFisico("Metamorfose", "Franz Kafka", 1967, 334);
        Usuario usuario1 = new Usuario("Júlio", 2355647);
        Biblioteca biblioteca1 = new Biblioteca("São João", "Londrina", usuario1);
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(usuario1);
        System.out.println(biblioteca1);
        livro1.apresentarLivro();
        livro2.apresentarLivro();
        usuario1.realizarEmprestimo(livro1);
        livro1.apresentarLivro();
        livro2.apresentarLivro();
        livro1.exibirMensagem();
        livro1.exibirMensagem("Mensagem específica");
        ((LivroDigital) livro1).baixar();
        ((LivroFisico) livro2).folhear();
    }
}
