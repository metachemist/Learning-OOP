package Chapter09;


class Television {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public Television(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    public void setVolumeLevel(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if(on && volumeLevel > 1){
            volumeLevel--;
        }
    }
}
public class TV{
public static void main(String[] args){
       /*Television Class*/
        Television tv1 = new Television();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(2);

        Television tv2 = new Television();
        tv2.turnOn();
        tv2.setChannel(40);
        tv2.setVolumeLevel(6);

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
}
}