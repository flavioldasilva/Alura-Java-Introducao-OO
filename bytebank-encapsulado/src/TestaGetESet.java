
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		//insere conta novo numero
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	}
}
