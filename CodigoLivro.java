package Prova.livros;

public class CodigoLivro {
    private String codigo;
    private String identificacao;

    public CodigoLivro(String codigo, String identificacao) {
        this.codigo = codigo;
        this.identificacao = identificacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "CodigoLivro{" +
                "codigo=" + codigo +
                ", identificacao=" + identificacao +
                '}';
    }
}
