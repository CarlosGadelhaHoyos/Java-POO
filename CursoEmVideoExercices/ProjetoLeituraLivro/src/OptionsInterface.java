public class OptionsInterface {
    
    public OptionsInterface(){
        System.out.println("\n==== Projeto livro ====\n");
        System.out.println("Antes de prosseguir é necessario definir os detalhes do usuário e ao menos um livro");
        Pessoa p = new Pessoa();
        Livro l = new Livro(p);
    }

}
