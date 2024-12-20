
package Events;

//Add Phidgets Library
import com.phidget22.*;

public class SmartPhidget {

    public static void main(String[] args) throws Exception {
        
        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event |  Event code runs when data input from the sensor changes. The following event is a Humidity change event. The contained code will only run when the humidity input changes.
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.print("Humidity: " + e.getHumidity() + "%RH, ");
            }
        });
        
        //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
            	
            	if ( e.getTemperature() > 21){
            		System.out.println( "Temperature: " + e.getTemperature() + " °C" );	
            		System.out.println(" ");
            	}
       
            	else {
            		System.out.println("Room is too cold.");
            		System.out.println(" ");
            	}
         
            }
        });

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
  