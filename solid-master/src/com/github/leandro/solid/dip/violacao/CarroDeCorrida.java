package solid.dip.violacao;

public class CarroDeCorrida {

    private int combustivelMaximo;
    private int combustivelRestante;
    private int potencia;

    public CarroDeCorrida(final int combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
        combustivelRestante = combustivelMaximo;
    }

    public void acelerar() {
        potencia++;
        combustivelRestante--;
    }

}