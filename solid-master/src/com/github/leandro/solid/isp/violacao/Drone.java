package solid.isp.violacao;

public class Drone extends Veiculo {

    private boolean cameraLigada;

    public boolean isCameraLigada() {
        return cameraLigada;
    }

    @Override
    public void ligarCamera() {
        cameraLigada = true;
    }

    @Override
    public void desligarCamera() {
        cameraLigada = false;
    }

    @Override
    public void ligarRadio() {
        // nada para fazer aqui
    }

    @Override
    public void desligarRadio() {
        // nada para fazer aqui
    }
}