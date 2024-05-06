package desafio;

public class Empresa {

	// Atributos
	private String razaoSocial; 
    private int cnpj;
    private Setor setor;
    private TipoSocietario tipoSocietario;
    // private String regimeTributario;
    
    // Construtor
	public Empresa(String razaoSocial, int cnpj, Setor setor, TipoSocietario tipoSocietario) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.setor = setor;
		this.tipoSocietario = tipoSocietario;
		// this.regimeTributario = regimeTributario;
	}

	// Gets & Sets
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public TipoSocietario getTipoSocietario() {
		return tipoSocietario;
	}

	public void setTipoSocietario(TipoSocietario tipoSocietario) {
		this.tipoSocietario = tipoSocietario;
	}
}
