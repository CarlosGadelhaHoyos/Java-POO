public class Main {
    
    public static void main(String[] args){
        
        RemoteControl rc = new RemoteControl();

        rc.turnOn();
        rc.plusVolume();
        rc.play();
        rc.openMenu();
        rc.closeMenu();
    }
}
