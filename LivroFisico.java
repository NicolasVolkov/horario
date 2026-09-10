package Prova.livros;

public class LivroFisico extends Livro {
    private int quantidadeDePaginas;
    public LivroFisico(String Livro, String Autor, int ano, int quantidadeDePaginas){
        super(Livro, Autor, ano);
        this.quantidadeDePaginas = quantidadeDePaginas;
    }
    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }
    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        if (quantidadeDePaginas < 0 ){
            System.out.println("A quantidade de páginas não pode ser menor que zero");
        } else{
            this.quantidadeDePaginas = quantidadeDePaginas;
        }
    }

    @Override
    public void apresentarLivro() {
        super.apresentarLivro();
        System.out.println("Quantidade de páginas: "+ quantidadeDePaginas);
    }
    public void folhear(){
        System.out.println("Follheando o livro físico...");
    }
}
