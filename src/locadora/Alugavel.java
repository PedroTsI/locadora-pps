package locadora;

public interface Alugavel {

	public String getTítulo();
	public double getCustoAluguel(int diasAlugada);
	public int getPAF(int diasAlugada);
}
