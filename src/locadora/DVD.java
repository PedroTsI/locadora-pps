package locadora;

public class DVD implements Alugavel{
	private String título;
	private Classificacao classificacao;

	public DVD(String título, Classificacao classificacao) {
		this.título = título;
		this.classificacao = classificacao;
	}

    public Classificacao getClassificacao() {
        return classificacao;
    }

	public void setClassificacao(Classificacao newClassificacao) {
		this.classificacao = newClassificacao;
	}

	public String getTítulo() {
		return título;
	}

	public double getCustoAluguel(int diasAlugado) {
		return classificacao.getCustoClassificacaoPorDiasAlugados(diasAlugado);
	}

	public int getPAF(int diasAlugado) {	   
		return classificacao.getPafValue(diasAlugado);
	}
}
