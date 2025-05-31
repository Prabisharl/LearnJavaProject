package org10.example.abstraction.interfaceExample.publicandabstractmethod;

interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking a phone photo");
    }
    public void playMusic(){
        System.out.println("Playing a music in phone photo");
    }
}
public class MultipleInterfaceEg2 {
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
    }
}
