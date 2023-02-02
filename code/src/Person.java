public class Person {
	
	private String nome;
	private String sobrenome;
	
//	private String nomeCompleto;
	
	public Person(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
//		this.nomeCompleto = nome + " " + sobrenome;
	}
	
//	public String getNome() {
//		return this.nome;
//	}
//	
//	public String getSobrenome() {
//		return this.sobrenome;
//	}
	
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
//		return this.nomeCompleto;
	}
}