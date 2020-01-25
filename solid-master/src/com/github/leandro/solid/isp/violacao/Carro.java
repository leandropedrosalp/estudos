package solid.isp.violacao;

public class Carro extends Veiculo {

    private boolean radioLigado;

    public boolean isRadioLigado() {
        return radioLigado;
    }

    @Override
    public void ligarRadio() {
        radioLigado = true;
    }

    @Override
    public void desligarRadio() {
        radioLigado = false;
    }

    @Override
    public void ligarCamera() {
        // nada para fazer aqui
    }

    @Override
    public void desligarCamera() {
        // nada para fazer aqui
    }
}