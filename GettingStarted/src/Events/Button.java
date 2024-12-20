
package Events;

//Add Phidgets Library
import com.phidget22.*;

public class Button {
    //Handle Exceptions
    public static void main(String[] args) throws Exception {
       
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
       

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	
            	if (e.getState() == false) {
            		
            		System.out.println("Red button not Pressed");
            		System.out.println(" ");
            	}
            	else {
            		System.out.println(" ");
            		System.out.println("Red button pressed");
            		
            	}
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	
            	if (e.getState() == false) {
            	
            		System.out.println("Green button not Pressed");
            		System.out.println(" ");
            	}
            	else {
            		System.out.println(" ");
            		System.out.println("Green button pressed");
            		
            	}
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(5000);
        }
    }
}
  
