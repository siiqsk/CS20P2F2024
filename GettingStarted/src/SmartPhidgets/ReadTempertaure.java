package SmartPhidgets;

import java.text.DecimalFormat;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTempertaure {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        
        DecimalFormat shorten = new DecimalFormat("#00.00");
        
        while (true) {
            System.out.println("Temperature: " + shorten.format((temperatureSensor.getTemperature() * 1.8)+ 32) + " °F" );
            Thread.sleep(150);
        }
    }
}
  