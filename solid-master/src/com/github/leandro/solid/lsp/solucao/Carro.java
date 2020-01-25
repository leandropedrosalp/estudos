package solid.lsp.solucao;

public class Carro extends Veiculo {
    //"Se você pode invocar um método mudarMarcha() da classe Veiculo (base), deve poder também invocar o método mudarMarcha() da classe Carro (derivada)"
    // Nesse caso é possivel devido a restrição de R para D ou D para R foi tratada parando o carro antes de chamar o método mudarMarcha()
    @Override
    public void mudarMarcha(Marcha marcha) {
        Marcha marchaAtual = getMarcha();
        if (movendoParaFrente(marcha, marchaAtual)
                || movendoParaTras(marcha, marchaAtual)) {
            parar();
        }
        super.mudarMarcha(marcha);
    }

    private boolean movendoParaTras(Marcha marcha, Marcha marchaAtual) {
        return isMovendo() && Marcha.R.equals(marchaAtual) && Marcha.D.equals(marcha);
    }

    private boolean movendoParaFrente(Marcha marcha, Marcha marchaAtual) {
        return isMovendo() && Marcha.D.equals(marchaAtual) && Marcha.R.equals(marcha);
    }
}
