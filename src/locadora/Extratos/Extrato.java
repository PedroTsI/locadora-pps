package locadora.Extratos;

import locadora.Aluguel;
import locadora.Cliente;

public abstract class Extrato {
    protected Cliente cliente;
    protected final String fimDeLinha = System.getProperty("line.separator");

    public Extrato() {}

    public String extrato() {
        StringBuilder extrato = new StringBuilder(this.primeiraLinhaExtrato());

        for (Aluguel aluguel : this.cliente.getAlugueis()) {
            extrato.append(this.aluguelExtrato(aluguel));
        }

        extrato.append(this.valorTotalExtrato());
        extrato.append(this.pafExtrato());

        return extrato.toString();
    }

    abstract String aluguelExtrato(Aluguel aluguel);
    abstract String pafExtrato();
    abstract String primeiraLinhaExtrato();
    abstract String valorTotalExtrato();
}