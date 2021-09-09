package br.com.generation.poo;

public class TestaCliente {

	public static void main(String[] args) {


		Cliente cli1 = new Cliente();
		
		cli1.setNome("Vagner");
		cli1.setCpf("004.005.005-51");
		cli1.getEmail("vagner@gmail.com");
		cli1.setEndereço("rUA DOS BOBOS NUMERO ZERO");
		cli1.setIdade(985);
		
		System.out.println(cli1.getNome());

	}

}
