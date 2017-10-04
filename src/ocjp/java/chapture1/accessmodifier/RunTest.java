package ocjp.java.chapture1.accessmodifier;

import ocjp.java.chapture1.accessmodifier.otherpkg.OtherPkgChild;
import ocjp.java.chapture1.accessmodifier.otherpkg.OtherPkgNonChild;
import ocjp.java.chapture1.accessmodifier.samepkg.Child;
import ocjp.java.chapture1.accessmodifier.samepkg.NonChild;
import ocjp.java.chapture1.accessmodifier.samepkg.Parent;

public class RunTest {

	public static void main(String[] args) {
		
		System.out.println("From the same class:");		
		Parent parent = new Parent();		
		parent.testIt();
		
		System.out.println("\nFrom any class in the same package");		
		NonChild nonChild = new NonChild();		
		nonChild.testIt();
		
		System.out.println("\nFrom a subclass in the same package");		
		Child child = new Child();		
		child.testIt();
		
		System.out.println("\nFrom a subclass outside the package");
		OtherPkgChild otherPkgChild = new OtherPkgChild();
		otherPkgChild.testIt();
		
		System.out.println("\nFrom any non-subclass class outside the package");
		OtherPkgNonChild otherPkgNonChild = new OtherPkgNonChild();
		otherPkgNonChild.testIt();
		
	}

}
