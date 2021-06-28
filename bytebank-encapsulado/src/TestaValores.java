
public class TestaValores {
	public static void main(String[] args) {
		
		//apos criado o construtor não é necessário mais os setters
		Conta conta = new Conta(1337, 24226);
		
		/*
		 * a conta está inconsistente pois ainda encontra-se vazio.
		 * conta.setAgencia(-50);
		 * conta.setNumero(-330);
		*/
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());

		Conta conta2 = new Conta(1337, 24226);
		
		System.out.println(Conta.getTotal());

	}

}
