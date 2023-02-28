import java.util.Scanner;
public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    Scanner scan = new Scanner(System.in);

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
        // TODO Auto-generated method stub
    }

    @Override
    public void fechar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void folear() {
        // TODO Auto-generated method stub
    }

    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
    }

    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
    }
}