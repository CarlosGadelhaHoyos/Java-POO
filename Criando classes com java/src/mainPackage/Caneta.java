package mainPackage;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void rabiscar() {
		
		if (this.tampada == false) {
		
			System.out.println("\nRabiscando...");
			
		}else {
			
			System.out.println("\n~~~~ERRO~~~~\nA caneta não pode rabiscar se estiver tampada!\n");
		}
	}
	
	public void tampar() {
		
		this.tampada = true;
	}
	
	public void destampar() {
		
		this.tampada = false;
	}
	
	public void status() {
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