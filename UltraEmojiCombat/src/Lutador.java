public class Lutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias; 
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vit, int de, int em){

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.peso = vit;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){

    }

    public void status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

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
     * @return String return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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
     * @return float return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return float return the peso
     */
    public float getPeso() {
        return peso;
        this.setCategoria();
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    /**
     * @return int return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * @return int return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    /**
     * @return int return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}