package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius(){
        Celsius toC = new Celsius(((this.value -32)*(5))/9);
        return toC;
    }

    @Override
    public Temperature toFahrenheit() {
        Celsius toF = new Celsius(((this.value*5)/9) + 32);
        return toF;
    }


    public String toString()
        {
            // TODO: Complete this method
            return "";
        }
}
