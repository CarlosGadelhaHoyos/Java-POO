public class Pessoa{
    private String nome;
    private int idade;
    private int quantLivros;
        
    public Pessoa(String nome, int idade, int quantLivros) {
        this.nome = nome;
        this.idade = idade;
        this.quantLivros = quantLivros;
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