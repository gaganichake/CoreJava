package ocjp.java.chapture5;

public class Exercise5_2 {
	public static void main(String[] args) {
		
		int age = 0;
		
		outer:
//		System.out.println("START OVER");// compiler error
		while(age <=21){
			age++;
			if(age <= 16){
				System.out.println("Get your driver's license");
				continue outer;
			} else {
				System.out.println("Another year");
			}
		}
	}
}
