package locadora;

public class Jogo implements Alugavel{

	private String titulo;
    private String console;
    private Classificacao classificacao;
    private int codigodepreco;


    public Jogo(String titulo, String console, Classificacao classificacao) {
        this.titulo = titulo;
        this.console = console;
        this.classificacao = classificacao;
    }

    public void setClassificacao(Classificacao newClassificacao) {
        this.classificacao = newClassificacao;
    }


    public int getCodigoDePreço() {
        return codigodepreco;
    }


    public void setCodigoDePreço(int codigodepreco) {
        this.codigodepreco = codigodepreco;
    }


    public String getTítulo() {
        return titulo;
    }


    public String getConsole() {
        return console;
    }


    public Classificacao getClassificacao() {
        return classificacao;
    }


    public double getCustoAluguel(int diasAlugado) {
        return classificacao.getCustoClassificacaoPorDiasAlugados(diasAlugado);
    }


    public int getPAF(int diasAlugado) {
        return classificacao.getPafValue(diasAlugado);
    }

}
