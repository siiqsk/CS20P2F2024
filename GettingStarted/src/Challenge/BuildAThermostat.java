
package Challenge;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class BuildAThermostat {
    public static void main(String[] args) throws Exception{
    
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        
        System.out.println("Welcome to the thermostat system. Your current set temperature is at 21°C. ");
        System.out.println(" ");
        System.out.println("To increase your temperature by 1°C, press the green button. ");
        System.out.println("To decrease your temperature by 1°C, press the red button. ");
        
        
        int currentTemp = 21;
        
        Boolean change1 = true;
        Boolean change2 = true;
        
        int time = 10000;
        int last = (int) System.currentTimeMillis();
        
        System.out.println(" ");
        System.out.println("Current temperature: " + temperatureSensor.getTemperature() + " °C, Set temperature: " + currentTemp );
        System.out.println(" ");
        
        while (true) {
        	
        	 if ((((int) System.currentTimeMillis()) - last) == time ) {
        		 System.out.println(" ");
        		 System.out.println("Current temperature: " + temperatureSensor.getTemperature() + " °C, Set temperature: " + currentTemp );
        		 System.out.println(" ");
        		 last = (int) System.currentTimeMillis();
        	 }
        	
        	 if (((greenButton.getState()) == true) && (change2 == true) ) {
	       		 currentTemp = currentTemp + 1;
	       		 System.out.println("Increased temperature by 1°C. ");
	       		 change2 = false;
             }
       	  
             else if (((greenButton.getState()) == false) && (change2 == false)) {
            	 change2 = true;  
             }
             

             if (((redButton.getState()) == true) && (change1 == true) ) {
	       		 currentTemp = currentTemp - 1; 
	       		 System.out.println("Decreased temperature by 1°C. ");
	       		 change1 = false;
             }
       	  
             else if (((redButton.getState()) == false) && (change1 == false)) {
            	 change1 = true;  
             }
             
             if ( ((temperatureSensor.getTemperature()) <= (currentTemp + 2)) && ((temperatureSensor.getTemperature()) >= (currentTemp - 2)) ) {
            	 greenLED.setState(true);
            	 redLED.setState(false);
        		
             }
        	
             else {
            	 redLED.setState(true);
            	 greenLED.setState(false);
             }
        		
        }
       
        
      
           
        
    }
}
