
package Methods;

//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        
        
        double brightness = 0;
        
        while (true) {
        	
	        while (brightness <= 0.9) {
	        	redLED.setDutyCycle(brightness);
	        	Thread.sleep(100);
	        	brightness = brightness + 0.1;
	        }
	        
	        while (brightness >= 0.1 ) {
	        	redLED.setDutyCycle(brightness);
	        	Thread.sleep(100);
	        	brightness = brightness - 0.1;
	        }
        
        
        }
    }
}
  
