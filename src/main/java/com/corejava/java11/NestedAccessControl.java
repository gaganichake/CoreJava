package com.corejava.java11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 
 * private method of the main class is accessible from the above-nested class in the 	 manner.
 * But if we use Java Reflection, it will give an IllegalStateException

 * private method of the main class is accessible from the above-nested class in the above manner.
 * But if we use Java Reflection, it will give an IllegalStateException
 */
public class NestedAccessControl {

	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Object ob = new NestedAccessControl();
		
		Method method = ob.getClass().getDeclaredMethod("myPrivate");
		method.invoke(ob);
	}
	
    public void myPublic() {
    }
 
    private void myPrivate() {
    }
 
    class Nested {
 
        public void nestedPublic() {
            myPrivate();
        }
    }

}
