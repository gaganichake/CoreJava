package ocjp.java.chapture5;

public class Exercise5_1 {
	public static void main(String[] args) {
		char c = 'g';
		switch (c) {
		case 'd':
			System.out.println(c);
			break;
		case 'c':
			System.out.println(c);
			break;
		case 'v': {// It is legal to include curly brace
			System.out.println(c);
			break;
		}
		default:
			System.out.println(c);
			break;
		case 'h':
			System.out.println(c);
			break;
		case 'm':
			System.out.println(c);
			break;
		}
	}
}
