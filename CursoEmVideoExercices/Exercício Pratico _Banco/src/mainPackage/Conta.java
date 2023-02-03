package mainPackage;

public class Conta {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//metodos personalizados:
	
	public void abrirConta(String t) {
		
		this.setStatus(true);
		this.setTipo(t.toUpperCase().strip());
		
		if(this.getTipo().equals("CC")) {
			
			this.setSaldo(50);
			System.out.println("\nConta aberta com sucesso!");
		}else if(this.getTipo().equals("CP")) {
			
			this.setSaldo(150);
			System.out.println("\nConta aberta com sucesso!");
		}else {
			
			System.out.println("\nERRO\nTipo de conta inválida!\n");
		}
	}
	
	public void fecharConta() {
		
		if(this.getSaldo() > 0) {
			
			System.out.println("\nA conta não pode ser fechada porque ainda tem dinheiro.\n");
		}else if(this.getSaldo() < 0) {
			
			System.out.println("\nA conta não pode ser fechada pois esatá em débito.\n");
		}else{
			
			this.setStatus(false);
		}
	}
	
	public void depositar(float s) {
		
		if(this.getStatus() == true) {
			
			this.setSaldo(this.getSaldo() + s);
			System.out.println("\nDepósito realizado com sucesso na conta de " + this.getDono());
		}else if(this.getStatus() == false) {
			
			System.out.println("\nImpossível depositar");
		}
	}
	
	public void sacar(float v) {
		
		if(this.getStatus() == true) {
			
			this.setSaldo(this.getSaldo()+ v);
			System.out.println("\nSaque realizado na conta de " + this.getDono());
		}else if(this.getSaldo() < v) {
			
			System.out.println("\nSaldo insuficiente!");
		}else {
			
			System.out.println("\nImpossivel sacar!");
		}
	}
	
	public void pagarMensal() {
		
		int v = 0;
		
		if (this.getTipo() == "cc") {
			
			v = 12;
		}else if(this.getTipo() == "cp") {
			
			v = 20;
		}
		
		if(this.getStatus() == true) {
			
			this.setSaldo(this.getSaldo() - v);
			System.out.println("\nMensalidade paga com sucesso por " + this.getDono());
		}else {
			
			System.out.println("\nImpossível pagar!");
		}
	}
	
	public void estadoAtual() {
		
		System.out.println("__________________________________________");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
		System.out.println("__________________________________________");
	}
	
	//Métodos especiais:
	
	public Conta() {
		
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void setNumConta(int n) {
		
		this.numConta = n;
	}
	
	public int getNumConta() {
		
		return this.numConta;
	}
	
	public void setDono(String d) {
		
		this.dono = d;
	}
	
	public String getDono() {
		
		return this.dono;
	}
	
	public void setSaldo(float s) {
		
		this.saldo = s;
	}
	
	public float getSaldo() {
		
		return this.saldo;
	}
	
	public void setStatus(boolean s) {
		
		this.status = s;
	}
	
	public boolean getStatus() {
		
		return this.status;
	}
	
	public void setTipo(String t) {
		
		this.tipo = t;
	}
	
	public String getTipo() {
		
		return this.tipo;
	}
}












