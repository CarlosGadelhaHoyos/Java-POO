public class Pessoa{
    private String nome; 
    private int idade;
    private char sexo;
    private int colecaoLivros;

    public void comprarLivro(){
        this.colecaoLivros++;
    }

    public Pessoa(){
        System.out.println("Qual seu nome?\nR: ");
        System.out.println("Qual sua idade?\nR: ");
        System.out.println("Qual seu sexo? Masculino [m], Feminino [f]\nR: ");
        System.out.println("Quantos livros você tem?\nR: ");
    }
}
