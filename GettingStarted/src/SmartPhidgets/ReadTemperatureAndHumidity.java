
package SmartPhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTemperatureAndHumidity  {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        
        while(true){
        	
        	if ((humiditySensor.getHumidity() > 30)){
        		
        		System.out.print("Humidity: " + humiditySensor.getHumidity() + "%RH, ");
        		Thread.sleep(150);
        	}
        	
        	else {
        		System.out.print("Humidity is low, ");
        	}
        	
        	if ((temperatureSensor.getTemperature() > 21)){
        		
        		System.out.println( "Temperature: " + temperatureSensor.getTemperature() + " °C" );
        		Thread.sleep(150);
        	}
        	
        	else {
        		System.out.println("Room is too cold.");
        	}
            
        }
    }
}
  