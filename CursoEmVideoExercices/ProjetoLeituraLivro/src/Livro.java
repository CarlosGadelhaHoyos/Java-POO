import java.util.Scanner;
public class Livro implements Publicacao{

    private String titulo = null;
    private String autor = null;
    private int totPags = 0;
    private int pagAtual = 0;
    private boolean aberto = false;
    private Pessoa leitor;
    Scanner scan = new Scanner(System.in);

    public Livro(){

        System.out.println("====Definindo atributos do livro====\n");
        System.out.print("Titulo: ");
        this.setTitulo(titulo);
        System.out.print("Autor: ");
        this.setAutor(autor);
        System.out.print("Total de páginas: ");
        this.setTotPags();

        this.setAberto(false);
        this.setLeitor(leitor.getNome());
    }

    public void detalhes(){
        System.out.println("==== Detalhes do livro ====\n");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor:" + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotPags());
        System.out.println("" + leitor.getNome());
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return int return the totPags
     */
    public int getTotPags() {
        return totPags;
    }

    /**
     * @param totPags the totPags to set
     */
    public void setTotPags(int totPags) {
        this.totPags = totPags;
    }

    /**
     * @return int return the pagAtual
     */
    public int getPagAtual() {
        return pagAtual;
    }

    /**
     * @param pagAtual the pagAtual to set
     */
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    /**
     * @return boolean return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @return Pessoa return the leitor
     */
    public Pessoa getLeitor() {
        return leitor;
    }

    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro foi aberto...");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("O livro foi fechado...");
    }

    @Override
    public void folear() {
        this.pagAtual = scan.nextInt();
        System.out.println("Foleando ate " + this.pagAtual + "... Pronto! \nPagina atual: " + this.getPagAtual());
    }

    @Override
    public void avancarPag() {
        if(this.pagAtual == this.totPags){
            System.out.println("Voce nao pode avancar. Ja esta na ultima pagina do livro.");
        }else{
            this.setPagAtual(this.pagAtual++);
            System.out.println("Avancou uma pagina...\nPagina Pagina atual: " + this.getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual == 1){
            System.out.println("Impossivel voltar uma pagina. Voce esta na primeira pagina do livro");
        }else{
            this.setPagAtual(this.pagAtual++);
            System.out.println("Voltou pra pagina anterior...\nPagina atual: " + this.pagAtual());
        }
    }
}