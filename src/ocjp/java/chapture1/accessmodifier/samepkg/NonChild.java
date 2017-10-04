package ocjp.java.chapture1.accessmodifier.samepkg;

public class NonChild {

	public void testIt(){
		
		Parent parent = new Parent();
		
		System.out.println("parent.pub = " + parent.pub);
		System.out.println("parent.pro = " + parent.pro);
		System.out.println("parent.def = " + parent.def);
//		System.out.println("parent.pri = " + parent.pri);// Compilation error: The field Parent.pri is not visible
	}
}
