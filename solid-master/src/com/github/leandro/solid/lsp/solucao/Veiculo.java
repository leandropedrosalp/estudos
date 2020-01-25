package solid.lsp.solucao;

public class Veiculo {

    private boolean isMovendo;
    private Marcha marcha;

    public void mover() {
        isMovendo = true;
    }

    public void parar() {
        isMovendo = false;
    }

    public boolean isMovendo() {
        return isMovendo;
    }

    public Marcha getMarcha() {
        return marcha;
    }

    public void mudarMarcha(final Marcha marcha) {
        this.marcha = marcha;
    }

}