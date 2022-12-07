public class RemoteControl implements Controler{

    public int volume;
    public boolean on;
    public boolean playing;

    public RemoteControl(){

        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean isPlaying(){ 
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void turnOn() {
        this.setOn(true);
    }

    public void turnOff() {
        this.setOn(false);
    }

    public void openMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("Is it on? "+ this.isOn());
        System.out.println("Is it playing? "+ this.isPlaying());
        System.out.printf("Volume: "+this.getVolume()+" ");
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println();
    }

    public void closeMenu() {
        System.out.println("closing menu...");
    }

    public void plusVolume() {
        if(this.isOn()){
            this.setVolume(this.getVolume()+5);
        }
    }

    public void minusVolume() {
        if(this.isOn()){
            this.setVolume(this.getVolume()-5);
        } else if(this.getVolume() == 0){
            System.out.println("O volume atual já é 0");
        }
    }

    public void mute() {
        if(this.isOn() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void unmute() {
        if(isOn() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if(this.isOn() && !(this.isPlaying())){
            this.setPlaying(true);
        }
    }
 
    public void pause() { 
        if(this.isOn() && this.isPlaying()){
            this.setPlaying(false);
        }
    }
}