package read.java.console;

import java.io.IOException;

public class Readex {

	//Reading input from console will throw IOException
	public static void main(String[] args) throws IOException {
		
		//For single char
		
		byte b[] = new byte[1];

		System.in.read(b);

		System.out.println(new String(b));
		
		//You can also use System.out.println((char)b[0]); because only one char needed
		
		
		//For multiple char
/*		byte b[] = new byte[10];

		System.in.read(b);

		System.out.println(new String(b));*/
		
		//Convert into int
/*		byte b[] = new byte[10];

		System.in.read(b);

		int number = Integer.parseInt((new String(b)).trim());
		
		System.out.println(number);*/
	}

}
