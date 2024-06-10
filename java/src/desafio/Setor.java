package desafio;

public enum Setor {
    AGROPECUARIA("Agropecuária"),
    INDUSTRIA("Indústria"),
    SERVICOS("Serviços");

    private String tipo;

    Setor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}