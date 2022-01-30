package mainPackage;

public class Caneta {

	public String modelo;
	private float ponta;
	
	public void setModelo(String m) {
		
		this.modelo = m;
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public void setPonta(float p) {
		
		this.ponta = p;
	}
	
	public float getPonta() {
		
		return this.ponta;
	}
	
	public void status() {
		System.out.println("==================");
		System.out.println("Status da caneta: \n");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("==================");
	}
}