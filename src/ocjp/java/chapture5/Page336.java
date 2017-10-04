package ocjp.java.chapture5;

public class Page336 {
	public static void main(String[] args) {
		final int a = 1;
		final int b;
		// b = 2;// compiler error
		int c = 3;

		int x = 0;
		// short x = 0;
		// byte x = 0;
		// char x = 0;
		// char x = 'a';
		// long x = 0;// compiler error
		// float x = 0f;// compiler error
		// double x = 0d;// compiler error
		switch (x) {
		case a: // ok
		// case b: // compiler error
		// case c: // compiler error
		case 4: // ok
		// case 4: // compiler error
		}
	}
}
