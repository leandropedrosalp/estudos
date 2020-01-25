package solid.dip.solucao;

public class Motorista {

    private Veiculo veiculo;

    // Motorista conhece qualquer veículo
    public Motorista(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void aumentarVelocidade() {
        veiculo.acelerar();
    }
}
