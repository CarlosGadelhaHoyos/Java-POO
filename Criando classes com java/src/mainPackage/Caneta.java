package mainPackage;

public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar() {
		
		if (this.tampada == false) {
		
			System.out.println("\nRabiscando...");
			
		}else {
			
			System.out.println("\n~~~~ERRO~~~~\nA caneta não pode rabiscar se estiver tampada!\n");
		}
	}
	
	void tampar() {
		
		this.tampada = true;
	}
	
	void destampar() {
		
		this.tampada = false;
	}
	
	void status() {
		System.out.println("==================");
		System.out.println("Status da caneta: \n");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
		System.out.println("==================");
	}
}