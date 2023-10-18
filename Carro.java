package poo;
import java.util.Random;
public class Carro { //classe apenas como modelo
	int ano;
	String cor; //dois atributos
	public Carro() { //construtor sem parametros
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi:" + chassi );
		
	}
							//agora possui dois parametros nesse construtor
	public Carro(int ano, String cor){ //todo construtor precisa ter o memso nome da classe
		this.ano = ano;
		this.cor = cor;
				 
         System.out.println("           _____________");
         System.out.println("          /    /     |  \\");
         System.out.println(" ________/____/______|___\\");
         System.out.println(" [0[\\\\[0[___    |  - ____||");
         System.out.println(" \\_____|//. \\|_____|/, \\//");
         System.out.println("   \\_\\ \\__//        \\__//");
         System.out.println("  _________**UNO**___________________");
            
	}
	void ligar() {
		System.out.println("Engine on...");
	}
	void desligar() {
		System.out.println("Engine off...");
	}
	void acelerar() {
		System.out.println("Vrumm...");
	} //três métodos
}
