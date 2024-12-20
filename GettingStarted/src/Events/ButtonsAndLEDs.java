

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class ButtonsAndLEDs {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    static int counterR = 0; 
    static int counterG = 0;
    
    
    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //
        redLED.setState(true);
        greenLED.setState(true);
        
        System.out.println("Ready?");
        Thread.sleep(1000);
        
        System.out.println("3");
        Thread.sleep(1000);
        
        System.out.println("2");
        Thread.sleep(1000);
        
        System.out.println("1");
        Thread.sleep(1000);
        
        System.out.println("Go!");
        
        redLED.setState(false);
        greenLED.setState(false);
        
   
          
        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
            	
            	int blink = 0;
            	
            	if (e.getState()) {
            		counterR = counterR +1;
            		
            		if (counterR  == 10) {
            			
            			turnRedLEDOn = true;
            			turnGreenLEDOn = true;
            			
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
						turnRedLEDOn = false;
            			turnGreenLEDOn = false;
            			System.out.println(" ");
            	      	System.out.println("Red team wins!");
            	      	
            	      	try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							
							e1.printStackTrace();
						}
            	      	
            	      	while(blink <= 5){
            	
            	      		turnRedLEDOn = true;
							try {
								Thread.sleep(250);
							} catch (InterruptedException e1) {
								
								e1.printStackTrace();
							}
            	      		turnRedLEDOn = false;
            	  	        try {
								Thread.sleep(250);
							} catch (InterruptedException e1) {
								
								e1.printStackTrace();
							}
            	  	        blink ++ ;
            	  	        
            	      	}
            	      	
            	      	System.exit(0);
            	      		
            		}
            	}
            	
            	
            	
            }
        });

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
            	
            	int blink = 0;
            	
            	if (e.getState()) {
            		counterG = counterG +1;
            		
            		if (counterG  == 10) {
            			
            			turnRedLEDOn = true;
            			turnGreenLEDOn = true;
            			
            			try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							
							e1.printStackTrace();
						}
						
            			System.out.println(" ");
            	      	System.out.println("Green team wins!");
            	      	
            	      	turnRedLEDOn = false;
            			turnGreenLEDOn = false;
            			
            			try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							
							e1.printStackTrace();
						}
            	      	
            	      	while(blink <= 5){
            	
            	      		turnGreenLEDOn = true;
							try {
								Thread.sleep(250);
							} catch (InterruptedException e1) {
								
								e1.printStackTrace();
							}
            	      		turnGreenLEDOn = false;
            	  	        try {
								Thread.sleep(250);
							} catch (InterruptedException e1) {
								
								e1.printStackTrace();
							}
            	  	        blink ++ ;
            	      	} 
            	      	
            	      	System.exit(0);
       
            		}
            	}
                
            }
        });	
           
        
        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
        while(true) {
            //turn red LED on based on red button input
            redLED.setState(turnRedLEDOn);
            //turn green LED on based on green button input
            greenLED.setState(turnGreenLEDOn);
            //sleep for 150 milliseconds 
            
        	}
        
        
      
    }
}
  