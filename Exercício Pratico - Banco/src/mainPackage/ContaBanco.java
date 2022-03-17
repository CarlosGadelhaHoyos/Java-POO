package mainPackage;

public class ContaBanco {

	//Atributos
	public int numConta;
	protected char tipo;
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
	
	public void setTipo(char t) {
		
		this.tipo = t;
	}
	
	//Métodos
	public void abrirConta() {
		
	}
	
	public void fecharConta() {
		
		
	}
	
	public void depositar() {
		
		
	}
	
	public void sacar() {
		
		
	}
	
	public void pagarMensal(){
		
		
	}
	
}
