package locadora.Classificacoes;

import locadora.Classificacao;
import locadora.Enum.CustoEnum;

public class Normal extends Classificacao{

    public Normal() {
        this.custo = CustoEnum.NORMAL.getValor();
    }

    @Override
    protected double calculaValorPorDias(int diasAlugado) {
        //Get Custo vindo da Classe Abstrata
        double valorCorrente = this.getCusto();
		
        if(diasAlugado > 2) {
		    valorCorrente += (diasAlugado - 2) * 1.5;
		}

        return valorCorrente;
    }

    @Override
    protected int getPafValue(int diasAlugado) {
		return 1;
    }
    
}
