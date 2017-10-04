package ocjp.java.chapture5;

public class Exercise5_3 {
	public static void main(String[] args) {

		try {
			String reverseStr = reverse("");
			System.out.println(reverseStr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("In finally");
		}
	}
	
	private static String reverse(String s) throws Exception{
		
		if(s.length() == 0){
			throw new Exception("Empty String");
		}
		
		String reverseStr = "";
		for(int i=s.length()-1;i>=0;--i) {
		reverseStr += s.charAt(i);
		}
		return reverseStr;
	}
}
