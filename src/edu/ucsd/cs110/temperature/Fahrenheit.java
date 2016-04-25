package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Fahrenheit toC = new Fahrenheit(((this.value -32)*(5))/9);
        return toC;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit toF  = new Fahrenheit(((this.value*5)/9) + 32);
        return toF;
    }


    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}

