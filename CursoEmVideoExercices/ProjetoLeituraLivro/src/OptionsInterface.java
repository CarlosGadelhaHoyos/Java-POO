import java.util.Scanner;
public class OptionsInterface {
    Scanner scan = new Scanner(System.in);

    public OptionsInterface(){
        System.out.println("\n==== Projeto livro ====\n");
        System.out.println("Antes de prosseguir é necessario definir os detalhes do usuário e ao menos um livro");
        Pessoa p = new Pessoa();
        Livro l = new Livro(p);
        showClassesOptions();
    }

    public void showClassesOptions(){
        int escolhaOpcao;
        System.out.println("\nO que deseja fazer?\n");
        System.out.print("[1] Mostrar opções para PESSOA\n[2] Mostrar opções para LIVRO\n\nR: ");
        escolhaOpcao = scan.nextInt();

        if(escolhaOpcao == 1){
            showPessoaOptions();
        }else if(escolhaOpcao == 2){
            showLivroOptions();
        }
    }

    public void showPessoaOptions(){

        System.out.println("==== Opções PESSOA ====\n[1] Mudar nome\n[2] Mudar idade\n[3] Comprar Livro");
    }
}
