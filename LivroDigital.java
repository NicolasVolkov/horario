package Prova.livros;

import Prova.livros.Livro;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;
    public LivroDigital(String Livro, String Autor, int ano, double tamanhoArquivo){
        super(Livro, Autor, ano);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {

        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo < 0 ){
            System.out.println("O tamanho do arquivo não pode ser menor que zero");
        } else{
            this.tamanhoArquivo = tamanhoArquivo;
        }
    }
    @Override
    public void apresentarLivro() {
        super.apresentarLivro();
        System.out.println("Tamanho do arquivo: "+ tamanhoArquivo);
    }
    public void baixar(){
        System.out.println("Baixando livro digital...");
    }
}
