import java.util.function.*;
import java.util.*;

class Pessoa {
	String nome;
	int idade;
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public String toString() {
		return nome;
	}
}

//@FunctionalInterface
//interface Matcher<T>{
//	boolean test(T t);
//}

class MaioresDeIdade implements /*Matcher*/Predicate<Pessoa> {

	@Override
	public boolean test(Pessoa p) {
		return p.idade >= 18;
	}
}

class FiltradorDePessoas{
	List<Pessoa> filtra(List<Pessoa> todas, /*Matcher*/Predicate<Pessoa> matcher){
		List<Pessoa> resultado = new ArrayList<Pessoa>();
		for(Pessoa p : todas) {
			if(matcher.test(p)) {
				resultado.add(p);
			}
		}
		return resultado;
	}
}

public class Lambda {
	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Igor", 15),
				new Pessoa("Jorge", 41),
				new Pessoa("Karina", 41),
				new Pessoa("Felipe", 10));
		
		FiltradorDePessoas filtrador = new FiltradorDePessoas();
		
		//Sintaxe de um lambda: (parametros) -> {codigo}
		
//		Matcher<Pessoa> criterio = new MaioresDeIdade();
//		/*Matcher*/Predicate<Pessoa> criterio = new /*Matcher*/Predicate<>() {
//			public boolean test(Pessoa p) {
//				return p.idade >= 18;
//			}
//		};
		
//		Predicate<Pessoa> criterio = (Pessoa p) -> {return p.idade >= 18;};
//		Predicate<Pessoa> criterio = (p) -> {return p.idade >= 18;};
//		Predicate<Pessoa> criterio = p -> {return p.idade >= 18;};
//		Predicate<Pessoa> criterio = p -> p.idade >= 18;
		
//		List<Pessoa> resultado = filtrador.filtra(pessoas, criterio);
		List<Pessoa> resultado = filtrador.filtra(pessoas, p -> p.idade >= 18);
		System.out.println(resultado);
		
		List<Pessoa> resultado2 = filtrador.filtra(pessoas, p -> p.nome.startsWith("I"));
		System.out.println(resultado2);
		
		//Regras
		/*(String s1, String s2) -> {codigo};
		 * (s1, s2) -> {codigo}
		 * p -> {codigo}*/
		
		//valido
		 Runnable r = () -> {};
		 Runnable r2 = () -> System.out.println("msg");
		 Runnable r3 = () -> {
			 System.out.println("msg1");
			 System.out.println("msg2");
		};
	}
}