package SkillBuilders;

public class Reverse {

	public static void main(String[] args) {
		
		int elements[] = new int[10];
		
		for (int i = 0; i < elements.length; i++) {
			elements[i] = i;
		}
		
		System.out.println("Countdown");
		System.out.println(" ");
		
		for (int i = 9; i >= 0; i --) {
			System.out.println(elements[i]);
		}
		

	}

}
