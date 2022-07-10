public class ControleRemoto {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public String nome;

    public ControleRemoto(){

        
    }

    //metodos especiais

    public int getVolume() {
        return volume;
    }

    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    public boolean isLigado() {
        return ligado;
    }

    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
