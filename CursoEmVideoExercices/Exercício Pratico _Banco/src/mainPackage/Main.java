package mainPackage;

public class Main {

	public static void main(String args[]) {
		
		Conta c1 = new Conta();
		c1.abrirConta("cc");
		c1.setNumConta(1111);
		c1.setDono("Jubileu");
		
		Conta c2 = new Conta();
		c2.abrirConta("cp   ");
		c2.setNumConta(2222);
		c2.setDono("Creuza");
		
		c1.depositar(100);
		c2.depositar(500);
		
		c1.estadoAtual();
		c2.estadoAtual();
	}
}
