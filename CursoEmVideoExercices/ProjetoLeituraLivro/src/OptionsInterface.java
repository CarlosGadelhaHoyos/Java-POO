public class OptionsInterface {
    
    public OptionsInterface(){
        System.out.println("\n==== Projeto livro ====\n");
        System.out.println("Antes de prosseguir é necessario definir os detalhes do usuário e ao menos um livro");
        Pessoa p = new Pessoa();
        Livro l = new Livro(p);
    }

    public void showClassesOptions(){
        System.out.println("O que deseja fazer?");
        System.out.println("[1] Mostrar opções para PESSOA\n[2] Mostrar opções para Livro");
    public void showPessoaOptions(){

        System.out.println("==== Opções PESSOA ====\n[1] Mudar nome\n[2] Mudar idade\n[3] Comprar Livro");
    }
}
