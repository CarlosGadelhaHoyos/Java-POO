import java.util.Scanner;

public class Pessoa{
    private String nome;
    private int idade;
    private int quantLivros;
    Scanner scan = new Scanner(System.in);

    public Pessoa() {
        System.out.println("\n==== Definindo Pessoa ====\n");
        System.out.print("Qual seu nome?\nR: ");
        this.nome = scan.nextLine();
        System.out.print("Qual sua idade?\nR: ");
        this.idade = scan.nextInt();
        this.quantLivros = 0;
    }

    public void comprarLivro(){
        this.quantLivros++;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome() {
        this.nome = scan.nextLine();
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade() {
        this.idade = scan.nextInt();
    }

    /**
     * @return int return the quantLivros
     */
    public int getQuantLivros() {
        return quantLivros;
    }

    /**
     * @param quantLivros the quantLivros to set
     */
    public void setQuantLivros(int quantLivros) {
        this.quantLivros = quantLivros;
    }

}