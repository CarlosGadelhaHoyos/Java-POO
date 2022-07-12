public class Lutadores {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    /*O que os lutadores farão?
     * Lista: apresentar, ganhar luta, perder luta, empatar luta e status.
    */

    public Lutadores(String no, String na, int id, float al, float pe, String ca, int vi, int de, int em){

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.categoria = ca;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public void apresentar(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatar(){

    }

    public void status(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {

        if(this.peso < 52.2){
        
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3f){

            this.categoria = "Leve";
        }else if(this.peso <= 83.9){

            this.categoria = "Médio";
        }else if(this.peso <= 120.2){

            this.categoria = "Pesado";
        }else{

            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
