import java.util.Scanner;

public class OptionsInterface {

    Scanner scan = new Scanner(System.in);

    public OptionsInterface(){
        System.out.println("\n==== Projeto livro ====");
        System.out.println("Antes de prosseguir é necessario definir os detalhes do usuário e ao menos um livro");
        Pessoa p = new Pessoa();
        Livro l = new Livro(p);
        showClassesOptions(p, l);
    }

    public void showClassesOptions(Pessoa p, Livro l){
        int escolhaOpcao;
        System.out.println("\nO que deseja fazer?\n");
        System.out.print("[1] Mostrar opções para PESSOA\n[2] Mostrar opções para LIVRO\n\nR: ");
        escolhaOpcao = scan.nextInt();

        if(escolhaOpcao == 1){
            showPessoaOptions(p, l);
        }else if(escolhaOpcao == 2){
            showLivroOptions(p, l);
        }
    }

    public void showPessoaOptions(Pessoa p, Livro l){
        int optionChoosed;
        System.out.print("\n==== Opções PESSOA ====\n[1] Mudar nome\t\t\tNome: " + p.getNome() + "\n[2] Mudar idade \t\tIdade: " + p.getIdade() + "\n[3] Comprar Livro\t\tQuantidade de livros: " + p.getQuantLivros() + "\n[4] Voltar\n\nR: ");
        optionChoosed = scan.nextInt();
        scan.nextLine();

        switch(optionChoosed){
            case 1:
                p.setNome();
            break;
            case 2:
                p.setIdade();
            break;
            case 3:
                p.comprarLivro();
            break;
            case 4:
                showClassesOptions(p, l);
            break;
        }       
        
        showClassesOptions(p, l);
    }

    public void showLivroOptions(Pessoa p, Livro l){
        String traduzidoAbertoFechado;
        int optionChoosed;

        if(l.isAberto() == true){
            traduzidoAbertoFechado = "Aberto";
        }else{
            traduzidoAbertoFechado = "Fechado";
        }

        System.out.print("\n==== Opções LIVRO ====\n[1] Abrir Livro\t\tLivro: " + traduzidoAbertoFechado + "\n[2] Fechar livro\n[3] Avançar página\n[4] Voltar página\n[5] Folear\n[6] Detalhes do livro\n\nR: ");
        optionChoosed = scan.nextInt();
        scan.nextLine();

        switch(optionChoosed){
            case 1:
                l.abrir();
            break;
            case 2:
                l.fechar();
            break;
            case 3:
                l.avancarPag();
            break;
            case 4:
                l.voltarPag();
            break;
            case 5:
                l.folear();
            break;
            case 6:
                l.detalhes();
            break;
        }       
        
        showClassesOptions(p, l);
    }
}
