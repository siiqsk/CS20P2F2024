
package Events;

//Add Phidgets Library
import com.phidget22.*;

public class AttachDetach {

    public static void main(String[] args) throws Exception {
       
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
       

        //Data Event | Event code runs when data from sensor changes. 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Attach Event | Attach Events run when a Phidget is connected to the Object
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Temperature Attach!");
            }
        });
        
        redButton.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Red Button Attach!");
            }
        });
        
        redLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Red LED Attach!");
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Temperature Detach!");
            }
        });
        
        redButton.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Red Button Detach!");
            }
        });
        
        redLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Red LED Detach!");
            }
        });

        //Open
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
 