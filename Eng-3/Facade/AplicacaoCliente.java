
public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Raphael Lisboa");
		ContaBancaria conta = new ContaBancaria("182736-1");

		Fachada facade = new Fachada()
		facade.fazerDeposito(1000, cliente, conta);
	}
}
