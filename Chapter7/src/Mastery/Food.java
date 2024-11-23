package Mastery;

//Food object to manage values in LunchOrder
public class Food {
	
	//Initialize private variables
		private double price, fat, carbs, fiber;
		
		public Food () { //default constructor
		//Initialize all variables as 0
			price = 0;
			fat = 0;
			carbs = 0;
			fiber = 0;
			
		}
		
		public Food (double newPrice, double newFat, double newCarbs, double newFiber) { //default constructor
		//overload the default constructor method
			
			price = newPrice;
			fat = newFat;
			carbs = newCarbs;
			fiber = newFiber;
			
		}
		
		//Accesser methods:
		public double getPrice() { //Return price of food
			return price;
		}
		
		public double getFat() { //return fat content of food
			return fat;
		}
		
		public double getCarbs() { //return carb content of food
			return carbs;
		}
		
		public double getFiber() { //return fiber content of food
			return fiber;
		}
		
}
