package prova;

public enum Cargo {
    Vendedor("Vendedor"),
    Gerente("Gerente");

    private String tipo;

    Cargo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
