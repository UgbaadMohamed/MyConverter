package com.example.myconverter.Model;

public class Calculator {

        private int celsius;
        private int fahrenheit;
        private int temperature;


        //meget vigtig med tom konstrukturør.
        public Calculator(){

        }

        public Calculator(int celsius, int fahrenheit, int temperature) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.temperature = temperature;
        }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCelsius() {
            return celsius;
        }

        public void setCelsius(int celsius) {
            this.celsius = celsius;
        }

        public int getFahrenheit() {
            return fahrenheit;
        }

        public void setFahrenheit(int fahrenheit) {
            this.fahrenheit = fahrenheit;
        }


}
