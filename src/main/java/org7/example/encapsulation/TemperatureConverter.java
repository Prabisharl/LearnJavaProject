package org7.example.encapsulation;

public class TemperatureConverter {
    private double celsius;

    public void setCelsius(double celsius){
        this.celsius=celsius;
    }

    public double getfahrenheit(){
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter t=new TemperatureConverter();
        t.setCelsius(30);
        System.out.println("Fahrenheit: "+t.getfahrenheit());
}
}

