package poo;

public class Uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1991,"Branco");
		System.out.println("Carro: Uno");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		uno.ligar();
//foi usado o 2 construtor, devido a isso o numero de chassi não apareceu
	}

}
