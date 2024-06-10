package aula3;

/*
É uma espécie de tipo agregado de dados heterogêneos imutáveis. Surgiram na versão 16 do Java.
	- Para facilitar a compreensão, podemos entender que um record:
	- Nos permite criar um tipo (assim como as classes).
	- Com atributos que são, automaticamente privados.
	- E também possuem métodos automáticos de acesso a eles (sem precisar criar gets).
	- São finais, portanto imutáveis (depois que você "instancia" um record, não pode mudar os valores dos atributos).
 
Assim como as classes, um record precisa estar dentro de um arquivo .java que tenha exatamente o mesmo nome do record
- Ainda não se sabe se um dia os records serão amplamente utilizados e substituirão os POJOs/Beans, só o tempo dirá.
*/

public class Records {
	public record Usuario(String login, String senha){
		
	}
	
	public static void main(String[] args) {
		Usuario allex = new Usuario("Allex", "123456");
		System.out.println(allex.login());
		System.out.println(allex.senha());
	}
}
