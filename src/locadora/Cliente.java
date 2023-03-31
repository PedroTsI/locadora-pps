package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Aluguel> getAlugueis() {
		return dvdsAlugados;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		dvdsAlugados.add(aluguel);
	}
	
	public double getValorTotal() {
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		
		double valorTotal = 0.0;
		while(alugueis.hasNext()) {
			Aluguel cada = alugueis.next();
			valorTotal += cada.getCustoAluguel();
		}
		
		return valorTotal;
	}
	
	public int getPontosTotaisDeAlugadorFrequente() {
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		
		int pontosDeAlugadorFrequente = 0;
		while(alugueis.hasNext()) {
			Aluguel cada = alugueis.next();
			pontosDeAlugadorFrequente += cada.getPAF();
		}
		
		return pontosDeAlugadorFrequente;
	}
}