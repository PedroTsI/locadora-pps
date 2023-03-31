package locadora.Extratos;

import locadora.Aluguel;
import locadora.Cliente;

public class ExtratoHTML extends Extrato {

    public ExtratoHTML(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    String aluguelExtrato(Aluguel aluguel) {
        return aluguel.getAlugavel().getTítulo() + ": R$ " + aluguel.getCustoAluguel() + "<BR>"+ this.fimDeLinha;
    }

    @Override
    String pafExtrato() {
        return "<P>Voce acumulou <EM>" + this.cliente.getPontosTotaisDeAlugadorFrequente() + " pontos</EM> de alugador frequente";
    }

    @Override
    String primeiraLinhaExtrato() {
        return "<H1>Registro de Alugueis de <EM>" + this.cliente.getNome() + "</EM></H1><P>" + this.fimDeLinha;
    }

    @Override
    String valorTotalExtrato() {
        return "<P>Valor total pago: <EM>R$ " + this.cliente.getValorTotal() + "</EM>"+ this.fimDeLinha;
    }
}