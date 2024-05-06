package desafio;

public class Empresa {

	// Atributos
	private String razao_social; 
    private int cnpj;
    private Setor setor;
    private TipoSocietario tipo_societario;
    private String regime_tributario;
    
    // Construtor
	public Empresa(String razao_social, int cnpj, Setor setor, TipoSocietario tipo_societario,
			String regime_tributario) {
		super();
		this.razao_social = razao_social;
		this.cnpj = cnpj;
		this.setor = setor;
		this.tipo_societario = tipo_societario;
		this.regime_tributario = regime_tributario;
	}

	// Gets & Sets
	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
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

	public TipoSocietario getTipo_societario() {
		return tipo_societario;
	}

	public void setTipo_societario(TipoSocietario tipo_societario) {
		this.tipo_societario = tipo_societario;
	}

	public String getRegime_tributario() {
		return regime_tributario;
	}

	public void setRegime_tributario(String regime_tributario) {
		this.regime_tributario = regime_tributario;
	}		
}
