package solid.lsp.violacao;

public class Carro extends Veiculo {

    //"Se você pode invocar um método mudarMarcha() da classe Veiculo (base), deve poder também invocar o método mudarMarcha() da classe Carro (derivada)"
    // Nesse caso não é possivel devido a restrição de R para D ou D para R
    @Override
    public void mudarMarcha(Marcha marcha) {
        if (Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)) {
            throw new RuntimeException("Não é possível mudar para a marcha REVERSA quando " + getMarcha().toString() + " engrenagem está engatada!");
        }
    }
}
