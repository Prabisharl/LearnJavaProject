package com.example.string;

public class Samples {
    public static void main(String[] args) {
        String[] souls=new String[10];
        souls[0]="Ragin";
        souls[1]="Prabi";
        souls[2]="Popy";
        souls[3]="Rithvik";

      getArray(souls);

        }
    public static void getArray(String[] souls ) {
        for (int i = 0; i < souls.length; i++) {
            System.out.println(souls[i]);

        }
    }
}

