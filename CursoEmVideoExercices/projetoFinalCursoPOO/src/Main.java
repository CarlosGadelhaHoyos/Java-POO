public class Main {
    public static void main(String[] args){
        
        // Parei no minuto 12:40 da ultima aula de POO

        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Integracao banco de dados com Python");
        v[2] = new Video("Aula 17 de HTML e CSS");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("jubileu", 12, "M", "apuca");
        g[1] = new Gafanhoto("creuza", 39, "F", "crezurete");

        Visualizacao vis = new Visualizacao(g[0], v[0]);
        System.out.println(vis.toString());
    }
}
