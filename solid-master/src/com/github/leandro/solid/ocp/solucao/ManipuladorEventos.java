package solid.ocp.solucao;

public class ManipuladorEventos {

    private Veiculo veiculo;

    public ManipuladorEventos(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void alterarModoConducao(final ModoConducao modoConducao) {
        veiculo.setPotencia(modoConducao.getPotencia());
        veiculo.setAlturaSuspensao(modoConducao.getAlturaSuspensao());
        // Agora, quando precisamos adicionar outro modo (por exemplo, ECONOMIA), basta criar uma nova classe: Economia.
    }
}
