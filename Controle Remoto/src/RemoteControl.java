public class RemoteControl implements Controler{

    private int volume;
    private boolean on;
    private boolean playing;

//CONSTRUCTOR
    public RemoteControl(){

        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

//GETTERS AND SETTERS 

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

//METHODS

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
        }else if(this.isOn() && this.getVolume() == 100){
            System.out.println("The volume is already " + this.getVolume());
        }else{
            System.out.println("It's impossible to increase the volume.");
        }
    }

    public void minusVolume() {
        if(this.isOn()){
            this.setVolume(this.getVolume()-5);
        } else if(this.getVolume() == 0){
            System.out.println("O volume atual já é 0");
        }else{
            System.out.println("Impossible to  the volume. It is off");
        }
    }

    public void mute() {
        if(this.isOn() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Impossible to mute. It is off");
        }
    }

    public void unmute() {
        if(isOn() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Impossible to unmute. It is off");
        }
    }

    public void play() {
        if(this.isOn() && !(this.isPlaying())){
            this.setPlaying(true);
        }else{
            System.out.println("Impossible to play. It is off");
        }
    }
 
    public void pause() { 
        if(this.isOn() && this.isPlaying()){
            this.setPlaying(false);
        }else if(this.on && !this.isPlaying()){
            System.out.println("It is already paused.");
        }else{
            System.out.println("Impossible to pause. It is off");
        }
    }
}