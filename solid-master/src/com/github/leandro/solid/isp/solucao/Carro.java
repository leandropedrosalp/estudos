package solid.isp.solucao;

public class Carro extends Veiculo implements ControlesRadio {

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

}