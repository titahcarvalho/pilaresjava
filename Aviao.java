package poo;

public class Aviao extends Carro {  //herança - reutilização de variáveis e métodos
	double envergadura;
	
	void aterrizar() {
		System.out.println("---------------______________");
	}	
	void acelerar() {
		System.out.println("_______________--------------");//aqui ele herdou a sobreescrita do método acelerar da classe Carro
	}
	
	
}
