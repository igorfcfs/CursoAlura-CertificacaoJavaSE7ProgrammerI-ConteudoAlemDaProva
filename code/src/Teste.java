public class Teste {
	public static void main(String[] args) {
		Person p = new Person("Igor", "Fernando");
		
		//imprima o nome completo da pessoa
//		System.out.println(p.getNome() + p.getSobrenome());
		System.out.println(p.getNomeCompleto());
	}
}
