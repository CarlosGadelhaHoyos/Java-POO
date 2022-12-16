public class Lutador{

        private String nome, nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias, derrotas, empates;

        public Lutador(String no, String na, int id, float al, float pe, int vit, int de, int em){

            this.nome = no;
            this.nacionalidade = na;
            this.idade = id;
            this.altura = al;
            this.peso = pe;
            this.peso = vit;
            this.derrotas = de;
            this.empates = em;
        }

        public void apresentar(){

        }

        public void status(){

        }

        public void ganharLuta(){

        }

        public void perderLuta(){

        }

        public void empatarLuta(){

        }
}