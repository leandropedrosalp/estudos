package solid.srp.violacao;

public class Veiculo {

    private int combustivelMaximo;
    private int combustivelRestante;

    public Veiculo(final int combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
        combustivelRestante = combustivelMaximo;
    }

    // isso não é responsabilidade de um carro.
    public void reabastecer() {
        combustivelRestante = combustivelMaximo;
    }

    public int getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public int getCombustivelRestante() {
        return combustivelRestante;
    }

    public void setCombustivelRestante(final int combustivelRestante) {
        this.combustivelRestante = combustivelRestante;
    }

    public void acelerar() {
        combustivelRestante--;
    }
}