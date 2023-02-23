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

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return char return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
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
