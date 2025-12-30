public class MobileVolume {
    private int volume;
    
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume must be between 0-100!");
        }
    }
    
    public int getVolume() {
        return volume;
    }
    
    public static void main(String[] args) {
        MobileVolume phone = new MobileVolume();
        phone.setVolume(50);
        System.out.println("Phone volume: " + phone.getVolume());
        
        phone.setVolume(150); // Invalid
        phone.setVolume(-10); // Invalid
    }
}