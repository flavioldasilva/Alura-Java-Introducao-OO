
public class TestaSacaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
		/*nao pode acontecer
		 * conta.saldo = conta.saldo - 101; System.out.println(conta.saldo);
		 * 
		 * conta.saca(200); System.out.println(conta.saldo);
		 */
		
	}

}
