package ocjp.java.chapture4;

public class Salary {
	public static void main(String[] args) {
		int numOfPets = 3;
		String status = (numOfPets < 4) ? "Pet limit not exceeded"
				: "too many pets";
		System.out.println("This pet status is " + status);
	}
}
