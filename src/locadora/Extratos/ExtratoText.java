package locadora.Extratos;

import locadora.Aluguel;
import locadora.Cliente;

public class ExtratoText extends Extrato {

    public ExtratoText(Cliente cliente) {
        this.cliente = cliente;
    }

    String primeiraLinhaExtrato() {
        return "Registro de Alugueis de " + this.cliente.getNome() + this.fimDeLinha;
    }

    String aluguelExtrato(Aluguel aluguel) {
        return "\t" + aluguel.getAlugavel().getTítulo() + "\t R$ " + aluguel.getCustoAluguel() + this.fimDeLinha;
    }

    String valorTotalExtrato() {
        return "Valor total pago: R$ " + this.cliente.getValorTotal() + this.fimDeLinha;
    }

    String pafExtrato() {
        return "Voce acumulou " + this.cliente.getPontosTotaisDeAlugadorFrequente() + " pontos de alugador frequente";
    }
}