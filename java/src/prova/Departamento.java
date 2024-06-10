package prova;

public enum Departamento {
    A("Departamento A"),
    B("Departamento B"),
    C("Departamento C");

    private String tipo;

    Departamento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
