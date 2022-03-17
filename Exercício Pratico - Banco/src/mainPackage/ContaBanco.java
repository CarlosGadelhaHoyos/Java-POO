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
			
		}else if(this.saldo < 0 || this.saldo > 0) {
			
			System.out.println("O saldo da sua conta está negativa ou está com algum dinheiro.\nPara o fechamento da conta, seu saldo deve ser igual a 0");
		}
	}
	
	public void depositar() {
		
		
	}
	
	public void sacar() {
		
		
	}
	
	public void pagarMensal(){
		
		
	}
	
}
