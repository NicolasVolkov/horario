package Prova.livros;

public class Livro {
    private String Livro;
    private String Autor;
    private int ano;
    private livros.CodigoLivro codigoLivro;
    public Livro(String Livro, String Autor, int ano) {

        this.Livro = Livro;
        this.Autor = Autor;
        this.ano = ano;
    }

    public String getLivro() {
        return Livro;
    }
    public void setLivro(String livro) {
        if (Livro == null || Livro.trim().isEmpty()){
            System.out.println("O nome do livro não pode estar vazio");
        } else{
            Livro = livro;
        }

    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        if (Autor == null || Autor.trim().isEmpty()){
            System.out.println("O nome do autor não pode estar vazio");
        } else{
            Autor = autor;
        }
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano < 0){
            System.out.println("O ano não pode ser menor que zero");
        } else{
            this.ano = ano;
        }
    }
    public void apresentarLivro(){
        System.out.println("Nome do livro: "+ Livro);
        System.out.println("Nome do autor: "+ Autor);
        System.out.println("Ano de lançamento: "+ ano);
    }
    @Override
    public String toString() {
        return "Prova.livros.Livro{" +
                "Prova.livros.Livro='" + Livro + '\'' +
                ", Autor='" + Autor + '\'' +
                ", ano=" + ano +
                '}';
    }
    public void exibirMensagem(){
        System.out.println("Exibição de mensagem");
    }
    public void exibirMensagem(String mensagem){
        System.out.println("Exibição de mensagem: "+ mensagem);
    }
}
