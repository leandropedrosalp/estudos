package solid.dip.solucao;

public class CarroDeCorrida implements Veiculo {

    private int combustivelMaximo;
    private int combustivelRestante;
    private int potencia;

    public CarroDeCorrida(final int combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
        combustivelRestante = combustivelMaximo;
    }

    @Override
    public void acelerar() {
        potencia++;
        combustivelRestante--;
    }
}