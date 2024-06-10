package exercicio2;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	// Atributos
    private List<Livro> acervo;
    private List<Livro> livrosDisponiveis;

    // Construtor
    public Biblioteca() {
        acervo = new ArrayList<>();
        livrosDisponiveis = new ArrayList<>();
    }

    // Getters & Setters
	public List<Livro> getLivrosDisponiveis() {
		return livrosDisponiveis;
	}

	public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {
		this.livrosDisponiveis = livrosDisponiveis;
	}
	
    public List<Livro> getAcervo() {
		return acervo;
	}

	public void setAcervo(List<Livro> acervo) {
		this.acervo = acervo;
	}
    
    // Métodos
    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
        livrosDisponiveis.add(livro);
    }

	public void emprestarLivro(String identificador) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getIdentificador().equals(identificador)) {
                livrosDisponiveis.remove(livro);
                break;
            }
        }
    }

    public void devolverLivro(String identificador) {
        for (Livro livro : acervo) {
            if (livro.getIdentificador().equals(identificador)) {
                livrosDisponiveis.add(livro);
                break;
            }
        }
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }
    }
}