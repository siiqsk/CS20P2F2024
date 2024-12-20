package SimplePhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar {
  //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
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

      //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
      
      
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
    
      
      int counterR = 0;
      int counterG = 0;
      
      Boolean change1 = true;
      Boolean change2 = true;
      
      int blink = 0;
      

      while( ((counterR < 10) && (counterG < 10)) ){
      	
          if (((greenButton.getState()) == true) && (change2 == true) ) {
    		  counterG = counterG + 1;
    		  change2 = false;
          }
    	  
          else if (((greenButton.getState()) == false) && (change2 == false)) {
    		  change2 = true;  
          }
          

          if (((redButton.getState()) == true) && (change1 == true) ) {
    		  counterR = counterR + 1;
    		  change1 = false;
          }
    	  
          else if (((redButton.getState()) == false) && (change1 == false)) {
    		  change1 = true;  
          }
      }
      
      Thread.sleep(500);
      
      redLED.setState(true);
      greenLED.setState(true);
      Thread.sleep(1000);
      
      redLED.setState(false);
      greenLED.setState(false);
      Thread.sleep(500);
      
      if (counterR == 10) {
    	  
    	  System.out.println(" ");
    	  System.out.println("Red team wins!");
    	  while(blink != 5){
    		  	
	            redLED.setState(true);
	            Thread.sleep(250);
	            redLED.setState(false);
	            Thread.sleep(250);
	            blink ++ ;
	        } 
      }
      
      else {
    	  
    	  System.out.println(" ");
    	  System.out.println("Green team wins!");
    	   while(blink != 5){
    		   
	            greenLED.setState(true);
	            Thread.sleep(250);
	            greenLED.setState(false);
	            Thread.sleep(250);
	            blink ++ ;
	            
    	   }
      }
      
  }
}
