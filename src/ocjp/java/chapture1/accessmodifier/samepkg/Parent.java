package ocjp.java.chapture1.accessmodifier.samepkg;

public class Parent {

	public boolean pub = true;
	protected boolean pro = true;
	boolean def = true;// No access modifier, means default (package) access
	private boolean pri = true;
	
	public void testIt(){
		System.out.println("this.pub = " + this.pub);
		System.out.println("this.pro = " + this.pro);
		System.out.println("this.def = " + this.def);
		System.out.println("this.pri = " + this.pri);
	}
}
