package ocjp.java.chapture1.accessmodifier.otherpkg;

import ocjp.java.chapture1.accessmodifier.samepkg.Parent;

public class OtherPkgChild extends Parent {

	public void testIt(){
		
		System.out.println("this.pub = " + this.pub);
		System.out.println("this.pro = " + this.pro);// through inheritance
//		System.out.println("this.def = " + this.def);// Compilation error: The field Parent.def is not visible
//		System.out.println("this.pri = " + this.pri);// Compilation error: The field Parent.pri is not visible
		
		Parent parent = new Parent();
		
		System.out.println("parent.pub = " + parent.pub);
//		System.out.println("parent.pro = " + parent.pro);// Compilation error: The field Parent.pro is not visible
//		System.out.println("parent.def = " + parent.def);// Compilation error: The field Parent.def is not visible
//		System.out.println("parent.pri = " + parent.pri);// Compilation error: The field Parent.pri is not visible
	}

}
