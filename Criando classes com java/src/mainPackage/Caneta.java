package mainPackage;

public class Caneta {

	String modelo;
	private float ponta;
	public boolean tampada;

	public Caneta(){
		
		this.modelo = "Bic";
		this.ponta = 0.9f;
	}
	
	public void tampar() {
		
		this.tampada = true;
	}
	
	public void destampar() {
		
		this.tampada = false;
	}
	
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