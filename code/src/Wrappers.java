public class Wrappers {
	public static void main(String[] args) {
		/*Wrapper Classes
		 * boolean = Boolean
		 * byte = Byte
		 * short = Short
		 * int = Integer
		 * char = Character
		 * long = Long
		 * double = Double
		 * float = Float*/
		
		Double d1 = new Double(22.5);
		Double d2 = new Double("22.6");
		Double d3 = 22.5;
		
		Character c = new Character('a');
		Character c2 = 'a';
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = true;
		Boolean b3 = new Boolean("true"); //true
		Boolean b4 = new Boolean("True"); //true
		Boolean b5 = new Boolean("TrUe"); //true
		Boolean b6 = new Boolean("false"); //false
		Boolean b7 = new Boolean("verdadeiro"); //false
		Boolean b8 = new Boolean("true "); //false
		
		//Wrapper => primitivo
		//xxxValue
		
		Long l = new Long("123");
		
		long l1 = l.longValue();
		int i = l.intValue();
		double d = l.doubleValue();
		
		boolean b = new Boolean("T").booleanValue();
		char c1 = new Character('a').charValue();
		
		//String => primitivo
		//parse.XXX
		double d20 = Double.parseDouble("123.6");
		int i20 = Integer.parseInt("123123");
		int i21 = Integer.parseInt("10",10);
		int i22 = Integer.parseInt("11",16);
//		int i23 = Integer.parseInt("A",10); //erro, 'A' nao existe na base decimal
		int i24 = Integer.parseInt("A",16);
		int i25 = Integer.parseInt("11", 2);
		
		//String => wrapper
		//construtor - incomum atualmente
		//valueOf - padrao atualmente
		Double d30 = new Double("23.7");
		Double d31 = Double.valueOf("25.7");
		Integer i30 = new Integer("23");
		Integer i31 = Integer.valueOf("5A5", 16);
		
		//primitivo => String
		//toString
		String d40 = Double.toString(24.6);
		String i40 = Integer.toString(123, 10);
		
		//wrapper = String
			//toString
	}
}
