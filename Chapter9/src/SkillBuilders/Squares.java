package SkillBuilders;

public class Squares {

	public static void main(String[] args) {
		
		int[] squares = new int[5];
		
		for (int i = 0; i < squares.length; i ++) {
			
			squares[i] = (i * i);
			
		}
		
		System.out.println("Squares of index's");
		System.out.println(" ");
		
		for (int i = 0; i <squares.length; i++) {
			System.out.println("The square of " + i + " index is: " + squares[i]);
		}
		

	}

}
