package desafio;

/* 	Uma interface em Java é uma coleção de métodos abstratos e constantes 
	que podem ser implementados por classes concretas.
*/
public interface CadastroListener {
    void onEmpresaCadastrada(
		String razaoSocial, 
		int cnpj, 
		Setor setor, 
		TipoSocietario tipoSocietario
    );
}