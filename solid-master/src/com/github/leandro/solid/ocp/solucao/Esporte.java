package solid.ocp.solucao;

public class Esporte implements ModoConducao {

    private static final int POTENCIA = 500;
    private static final int ALTURASUSPENSAO = 10;

    @Override
    public int getPotencia() {
        return POTENCIA;
    }

    @Override
    public int getAlturaSuspensao() {
        return ALTURASUSPENSAO;
    }
}
