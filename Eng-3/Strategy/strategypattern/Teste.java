package strategypattern;

public class Teste {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		//	quero que joao faça um aluguel de uma casa sem piscina 
		joao.setAluguel(new AluguelComum());
		joao.realizarAluguel();
		
		System.out.println("--------------------------------");
		
		// aqui é caso o joão quiser fazer um aluguel de uma casa com piscina 
		joao.setAluguel(new AluguelEspecial());
		joao.realizarAluguel();
		
		
	}
	
}