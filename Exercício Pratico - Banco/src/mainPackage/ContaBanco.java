package mainPackage;

public class ContaBanco {

	//Atributos
	public int numConta;
	protected String tipo;
	private char dono;
	private float saldo;
	private boolean status;
	
	//Métodos especiais
	public ContaBanco() {
		
		this.saldo = 0;
		this.status = false;
	}
	
	public void setNumConta(int n){
		
		this.numConta = n;
	}
	
	public int getNumConta() {
		
		return this.numConta;
	}
	
	public void setTipo(String t) {
		
		this.tipo = t;
		t.toLowerCase();
		t.strip();
	}
	
	public String getTipo() {
		
		return this.tipo;
	}
	
	public void setDono(char d) {
		
		this.dono = d;
	}
	
	public char getDono(){
		
		return this.dono;
	}
	
	public void setSaldo(float s) {
		
		this.saldo = s;
	}
	
	public float getSaldo() {
		
		return this.saldo;
	}
	
	public void setStatus(boolean stat) {
		
		this.status = stat;
	}
	
	public boolean getStatus() {
		
		return this.status;
	}
	
	//Métodos
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if(this.tipo.equals("cp")) {
			
			this.saldo = 50;
		}else if(this.tipo.equals("cp")) {
			
			this.saldo = 150;
		}
	}
	
	public void fecharConta() {
		
		if(this.saldo == 0) {
			
			this.status = false;
			
		}else if(this.getSaldo() < 0 || this.getSaldo() > 0) {
			
			System.out.println("O saldo da sua conta está negativa ou está com algum dinheiro.\nPara o fechamento da conta, seu saldo deve ser igual a 0");
		}
	}
	
	public void depositar(float v) {
		
		if(this.getStatus() == true) {
			
			this.setSaldo(this.getSaldo() + v);
		}else {
			
			System.out.println("É impossivel sacar");
		}
	}
	
	public void sacar(float v) {
		
		if(this.getStatus() == true) {
			
			if(this.getSaldo() > v){
				
			}else {
				
				System.out.println("Impossível sacar");
			}
		}
	}
	
	public void pagarMensal(){
		
		float v = 0;
		
		if(this.getTipo().equals("cc")) {
			
			v = 12;
		}else if(this.getTipo().equals("cp")) {
			
			v = 20;
		}
		
		if(this.getStatus() == true ) {
			
			if(this.getSaldo() > v) {
				
				this.setSaldo(this.getSaldo() - v);
			}else if(this.getSaldo() < v) {
				
				System.out.println("Saldo insuficiente");
			}
		}else {
			
			System.out.println("Impossivel pagar");
		}
	}
	
}
