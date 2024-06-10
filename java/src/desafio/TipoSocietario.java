package desafio;

public enum TipoSocietario {
    LTDA("Sociedade Limitada"),
    SA("Sociedade Anônima"),
    EIRELI("Empresa Individual de Responsabilidade Limitada");

    private String tipo;

    TipoSocietario(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
