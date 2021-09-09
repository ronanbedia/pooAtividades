package br.com.generation.poo;

public class Funcionario {

	public static void main(String[] args) {
		
	FuncionarioAtributos func1 = new FuncionarioAtributos();
	
	func1.setNome("Ronan");
	func1.setCargo("Chefe");
	func1.setSalario(1000000000);
		
	System.out.println("O " + func1.getNome() + " trabalha como " + func1.getCargo() + " e ganha "
						+ func1.getSalario() + " por mês.");
		

	}

}
