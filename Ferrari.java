package poo;

public class Ferrari { //possui o método principal para ser executado

	public static void main(String[] args) {
		Carro ferrari = new Carro ();
		ferrari.ano = 2015;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
	}

}
