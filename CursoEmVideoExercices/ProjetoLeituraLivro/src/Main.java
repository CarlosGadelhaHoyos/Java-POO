public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Luana", 16, 1);
        p.comprarLivro();
        Livro l = new Livro("Livro 1", "Thomas", 300, 21, false, p);
        l.detalhes();
    }
}