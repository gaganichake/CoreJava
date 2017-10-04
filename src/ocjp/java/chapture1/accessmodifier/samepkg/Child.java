	package ocjp.java.chapture1.accessmodifier.samepkg;

public class Child extends Parent {

	public void testIt(){
		
		System.out.println("this.pub = " + this.pub);
		System.out.println("this.pro = " + this.pro);
		System.out.println("this.def = " + this.def);
//		System.out.println("this.pri = " + this.pri);// Compilation error: The field Parent.pri is not visible
		
		Parent parent = new Parent();
		
		System.out.println("parent.pub = " + parent.pub);
		System.out.println("parent.pro = " + parent.pro);
		System.out.println("parent.def = " + parent.def);
//		System.out.println("parent.pri = " + parent.pri);// Compilation error: The field Parent.pri is not visible
	}
	
}
