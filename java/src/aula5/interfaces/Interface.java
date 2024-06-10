package aula5.interfaces;

/*
Interfaces permitem "herança múltipla" de TIPO.
Especifica um contrato que define tudo que uma classe faz, mas não como ela faz.
Pode ser comparada às assinaturas de função em C.

Uma interface não pode ter atributos (a menos que seja uma constante), pois não há herança de estado.

Uma interface deve definir somente a assinatura dos métodos, mas não o corpo (até Java 7)

Até o Java 8, todos os métodos de uma interface só podiam ser públicos. 

Do Java 9 em diante, é possível ter métodos privados.
A partir da versão 8, o Java passa a permitir implementação padrão (default) para os método.
	
	NOTA: O conceito de interfaces é mais amplo e profundo dentro da POO, mas nessa disciplina só veremos até aí.

E se houver conflito da implementação padrão de um método da interface com a implementação de um método herdado (de classe concreta ou abstrata)?
	A implementação da classe sobrescreve a implementação padrão da interface.
E se houver conflito entre as implementações padrão de duas ou mais interfaces?
	A classe que implementa ambas as interfaces é forçada a implementar uma versão que sobrescreva todas as implementações padrão.

EXEMPLO:
	Supondo uma empresa que dá cursos de programação...
	Então programadores também são professores!
*/

public class Interface {

}
