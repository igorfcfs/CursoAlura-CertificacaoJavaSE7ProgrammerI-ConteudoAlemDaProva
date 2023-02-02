public class TesteImpressao {
	
	@Override
	public String toString() {
		return "um objeto do tipo TesteImpressao";
	}
	
	public static void main(String[] args) {
		
		/*Imprimir na tela sem quebra de linha
		 * System.out.print();*/
		System.out.print(1); //1
		System.out.print(2.0); //2.0
		System.out.print(" texto "); //[ texto ]
		System.out.print('a'); //a
		
		System.out.print(new TesteImpressao()); //um objeto do tipo TesteImpressao
		System.out.print(new int[10]); //[I@5aaa6d82
		
		char[] letras = {'a', 'b'};
		System.out.print(letras); //ab
		
		/*Imprimir na tela com quebra de linha
		 * voce pode usar o \n ou o System.ou.println();*/
		System.out.println();
		System.out.print("foo\n");
		System.out.print("bar\n");
		
		System.out.println("foo2");
		System.out.println("bar2");
		
		/*O metodo print(), diferente do println(), nao compila sem argumentos*/
//		System.out.print(); //erro de compilacao
//		System.out.println(); //quebra de linha
		
		
		/*Formatar a saida do console
		 * voce pode usar o System.out.format ou o System.out.printf()
		 * Para formatar voce usa %<simbolo do tipo> para indicar alguns tipos
		 * %d - byte, short, int, long
		 * %s - String
		 * %c - char
		 * %f - float, double
		 * %b - boolean
		 * %n - quebra de linha*/
		
		/*Quando vc usar o format/printf, para quebrar a linha, vc pode usar \n ou %n*/
		System.out.format("format%n");
		System.out.printf("printf\n");
		
		System.out.format("Hello %s, Have a nice day!%n", "Igor");
		//Voce tambem pode usar numeros em %s, mas serao convertidos em forma de String
		System.out.format("Hello %s, Have a nice day!%n", 42);
		System.out.format("%c %n", 'a');
		System.out.format("%b %n", false);
		System.out.format("%d %n", 42);
		System.out.format("%f %n", 45.7);
		
		System.out.format("%s : o numero : %d esta correto? : %b%n", "Sim", 42, true);
		
		/*Vc pode definir a ordem das impressoes com %<numero>$<simbolo do tipo>*/
		System.out.format("%s %s%n", "World", "Hello");
		System.out.format("%2$s %1$s%n", "World", "Hello");
		System.out.format("%2$s %2$s%n", "World", "Hello");
		
		/*Voce pode definir a quantidade de caracteres*/
		System.out.format("[%5d]%n", 42);
		System.out.format("[%5s]%n", "foo");
		System.out.format("[%5s]%n", "foofoo");
		
		/*Voce pode habilitar o sinal de positivo de um numero usando %+<simbolo do tipo>*/
		System.out.format("[%+5d]%n", 42);
		System.out.format("[%5d]%n", 42);
		//O sinal de menos ja vem por default, o sinal de menos alinha os caracteres pra esquerda
		System.out.format("[%-5d]%n", -50);
		System.out.format("[%5d]%n", -50);
		
		/*Voce tambem pode fazer os numeros negativos aparecerem entre parenteses 
		 * usando %(<simbolo do tipo>*/
		System.out.format("[%(5d]%n", 42);
		System.out.format("[%(5d]%n", -50);
		
		/*Para alinhar pra esquerda usando %-<quantidade de caracteres><simbolo do tipo>*/
		System.out.format("[%-5d]%n", 42);
		System.out.format("[%-5d]%n", -50);
		System.out.format("[%-5s]%n", "FOO");
		
		/*Voce tambem pode preencher com 0 os caracteres extras 
		 * usando %0<quantidade de caracteres><simbolo do tipo>*/
		System.out.format("[%05d]%n", 42);
		System.out.format("[%05d]%n", -50);
//		System.out.format("[%05s]%n", "FOO"); //erro, vc so pode completar com 0 quando e numero
		
		/*Voce pode usar um separador de milhar se o numero for muito grande
		 * usando %,<simbolo do tipo>*/
		System.out.format("[%,d]%n", 421234123);
		
		/*Voce pode definir quantas casas deseja nos decimais usando
		 * %.<numero de casas decimais desejado><simbolo do tipo>>*/
		System.out.format("[%,.3f]%n", 421234123.99);
		
		/*Exemplo que pode cair na prova*/
		System.out.format("%0,8.2f", 34.589); //00034.59
		System.out.printf("%0,8.2f", 34.589); //00034.59
	}
}
