public class Main {
    public static void main(String[] args) {
    
        Lutador prettyBoy = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        prettyBoy.apresentar();
        System.out.println(prettyBoy.getPeso());
    }
}
