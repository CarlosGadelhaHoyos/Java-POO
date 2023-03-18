import java.util.Scanner;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    Scanner scan = new Scanner(System.in);

    public Livro(Pessoa leitor) {
        System.out.print("\n====Definindo detalhes do livro====\n");
        System.out.print("Qual o título do livro?\nR: ");
        this.setTitulo();
        System.out.print("Qual o autor do livro?\nR: ");
        this.setAutor();
        System.out.print("Qual a quantidade de páginas do livro?\nR: ");
        this.setTotPaginas();

        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("\n==== Detalhes do Livro ====\n");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página autal: " + this.pagAtual);
        System.out.println("Aberto: " + this.aberto);
        System.out.println("Leitor: " + this.leitor.getNome());
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
    public void setTitulo() {
        this.titulo = scan.nextLine();
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
    public void setAutor() {
        this.autor = scan.nextLine();
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
    public void setTotPaginas() {
        this.totPaginas = scan.nextInt();
    }

    /**
     * @return boolean return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        this.aberto = true;
        System.out.println("O livro foi aberto...");
    }

    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        this.aberto = false;
        System.out.println("O livro foi fechado...");
    }

    @Override
    public void folear(int p) {
        // TODO Auto-generated method stub
        this.pagAtual = p;
        this.pagAtual = scan.nextInt();
        System.out.printf("Foleando até a página %d...", p);
        System.out.printf("Foleado até a página %d. Página atual: %d", p, this.pagAtual);
    }

    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
        this.pagAtual++;
        System.out.printf("Página avançada. Página atual: %d", this.pagAtual);
    }

    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
        this.pagAtual--;
        System.out.printf("Voltou para a página anterior. Página atual: %d", this.pagAtual);
    }

}