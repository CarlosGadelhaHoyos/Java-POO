public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página autal: " + this.pagAtual);
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Leitor: " + this.leitor.getNome());

        this.aberto = false;
        this.pagAtual = 0;
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
     * @return int return the totPaginas
     */
    public int getTotPaginas() {
        return totPaginas;
    }

    /**
     * @param totPaginas the totPaginas to set
     */
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    /**
     * @return boolean return the aberto
     */
    public boolean isAberto() {
        return aberto;
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
        this.aberto = true;
    }

    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        this.aberto = false;
    }

    @Override
    public void folear(int p) {
        // TODO Auto-generated method stub
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
        this.pagAtual--;
    }

}