package mainPackage;

public class Main {

	public static void main(String args[]) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.carga = 100;
		c1.tampada = false;
		//c1.ponta = 1.5f; 
		//A ponta não pode mais ser usada por ter a sua visibilidade privada.
		
		c1.status();
		c1.rabiscar();
	}
}
