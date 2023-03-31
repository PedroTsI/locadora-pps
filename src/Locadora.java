//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
import locadora.Classificacoes.Infantil;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************
import locadora.Classificacoes.Lancamento;
import locadora.Classificacoes.Normal;
import locadora.Extratos.Extrato;
import locadora.Extratos.ExtratoHTML;
import locadora.Extratos.ExtratoText;


public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");		 

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", (new Normal())), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", (new Infantil())), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", (new Lancamento())), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", (new Lancamento())), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", (new Infantil())), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", (new Normal())), 3));

		Extrato extrato = new ExtratoHTML(c1);
		Extrato extratoText = new ExtratoText(c1);
		System.out.println("------------------ Extrato HTML ------------------");
		System.out.println(extrato.extrato());
		System.out.println("------------------ Extrato Text ------------------");
		System.out.println(extratoText.extrato());
	}
}
