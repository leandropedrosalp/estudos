package solid.lsp.violacao;

public class Veiculo {

    private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }

    public void mudarMarcha(final Marcha marcha) {
        this.marcha = marcha;
    }

}