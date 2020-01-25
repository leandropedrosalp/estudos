package solid.ocp.solucao;

public class Economico implements ModoConducao {

    private static final int POTENCIA = 300;
    private static final int ALTURASUSPENSAO = 20;

    @Override
    public int getPotencia() {
        return POTENCIA;
    }

    @Override
    public int getAlturaSuspensao() {
        return ALTURASUSPENSAO;
    }
}
