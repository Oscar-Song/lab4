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
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.value*9/5 + 32);

    }


    public String toString()
        {
            // TODO: Complete this method
            return this.value + " C";
        }
}
