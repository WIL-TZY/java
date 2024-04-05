package aula7;

/*
Muitas das coleções do java guardam os objetos dentro de tabelas hash. 
Essas tabelas são utilizadas para que a pesquisa de um objeto seja feita de maneira rápida. 

Cada objeto é "classificado" pelo seu hashCode e, com isso, conseguimos espalhar cada objeto agrupando-os pelo hashCode. 
Quando buscamos determinado objeto, só vamos procurar entre os elementos que estão no grupo daquele hashCode. 
Dentro desse grupo, vamos testando o objeto procurado com o candidato usando equals(). 

Para que isso funcione direito, o método hashCode de cada objeto deve retornar 
o mesmo valor para dois objetos, se eles são considerados iguais.
Em outras palavras:
	a.equals(b) implica a.hashCode() == b.hashCode() 

IMPORTANTE!!
Implementar hashCode de tal maneira que ele retorne valores diferentes para dois objetos considerados iguais 
QUEBRA o contrato da classe Object e resultará em collections que usam espalhamento (como HashSet, HashMap e Hashtable), 
NÃO encontrarem objetos iguais dentro de uma mesma coleção.
*/
public class HashCode {
    private String a;
    private String b;
	
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + a.hashCode();
        result = 31 * result + b.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashCode other = (HashCode) obj;
        return a.equals(other.a) && b.equals(other.b);
    }
}
