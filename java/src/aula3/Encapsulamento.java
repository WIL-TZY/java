package aula3;

/*
Encapsulamento é uma técnica utilizada para não expor os detalhes internos de 
um objeto para aqueles que vão somente utilizá-lo.
Vantagens:
	- Reduz a complexidade para quem quer somente usar um objeto
	- Reduz acoplamento que por consequência evita efeitos colaterais

Ao invés de expôr todos os elementos de um objetado projetado, o ideal é ENCAPSULAR todos os 
seus detalhes. Dessa forma, só é exposto aquilo que importa aos usuários para evitar 
complexidade sem necessidade.

Como encapsular objetos em Java?
- Usar modificadores de acesso privados para os atributos.
- Atributos privados não podem ser acessados fora da classe do objeto.
- Evitamos que quem use a classe possa saber os detalhes internos do objeto.
- Implementar métodos get e set para cada um dos atributos.
- A forma que permitimos alguém obter ou modificar o valor de um atributo.
*/

public class Encapsulamento {
	/*
	O que é necessário para dirigir um carro?
		- Ignição (para ligar o carro)
		- Câmbio (para alterar força e velocidade)
		- Acelerador (para alterar velocidade do carro)
		- Freio (para brecar o carro)
	*/
	
	// Exemplo
	public class ContaBancaria {
		private String numero;
		private double saldo;
		
		public ContaBancaria(String numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		void creditar(double valor) {
			saldo = saldo + valor;
		}
		void debitar(double valor) {
			saldo = saldo - valor;
		}
		
		String getNumero() {
			return numero;
		}
		
		void setNumero(String numero) {
			this.numero = numero;
		}
		
		double getSaldo() {
			return saldo;
		}
			
		void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	}
	
	/*
	Mas, é necessário ter todos esses gets e sets?

	Existe uma longa discussão na comunidade Java sobre gets e sets

	Alguns argumentam que na maioria das vezes os gets e sets simplesmente permitem o acesso aos 
	atributos e nunca realizam nenhum validação ou outro tipo de procedimento e por isso seriam desnecessários.
	Os gets e sets ainda são um padrão na comunidade Java (POJO/Beans) e dificilmente vão desaparecer, mas as novas 
	versões da plataforma criaram um alternativa
	*/
}
