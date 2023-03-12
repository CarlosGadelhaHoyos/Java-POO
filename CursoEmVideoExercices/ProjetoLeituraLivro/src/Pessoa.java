import java.util.Scanner;

public class Pessoa{
    private String nome = null; 
    private int idade = 0;
    private String sexo = null;
    private int colecaoLivros = 0;
    Scanner scan = new Scanner(System.in);

    public void comprarLivro(){
        this.setColecaoLivros(colecaoLivros + 1);
    }

    public Pessoa(){
        System.out.println("====Definindo Leitor====\n");
        System.out.print("Qual seu nome?\nR: ");
        this.setNome();

        System.out.print("Qual sua idade?\nR: ");
        this.setIdade();
        scan.nextLine(); //clean the \n after the insertion of the data above

        System.out.print("Qual seu sexo? Masculino [m], Feminino [f]\nR: ");
        this.setSexo();

        System.out.print("Quantos livros você tem?\nR: ");
        this.setColecaoLivros(scan.nextInt());
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
     * @return char return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo() {
        this.sexo = scan.nextLine();
        this.sexo.strip().toLowerCase();
    }

    /**
     * @return int return the colecaoLivros
     */
    public int getColecaoLivros() {
        return colecaoLivros;
    }

    /**
     * @param colecaoLivros the colecaoLivros to set
     */
    public void setColecaoLivros(int colecaoLivros) {
        this.colecaoLivros = colecaoLivros;
    }

}