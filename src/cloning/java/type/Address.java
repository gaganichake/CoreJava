package cloning.java.type;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 7278426542371485101L;
	private int pin;
	private String area;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": pin=" + pin + ", area=" + (area == null ? "" : area);  
	}
}
