package solid.srp.solucao;

import solid.srp.violacao.Veiculo;

public class BombaCombustivel {

    public void reabastecer(final Veiculo veiculo) {
        final int combustivelRestante = veiculo.getCombustivelRestante();
        final int CcombustvelAdicional = veiculo.getCombustivelMaximo() - combustivelRestante;
        veiculo.setCombustivelRestante(combustivelRestante + CcombustvelAdicional);
    }
}
