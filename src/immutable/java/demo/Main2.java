package immutable.java.demo;

import java.util.Date;

public class Main2 {
	public static void main(String[] args) {
		ImmutableClassWithoutUsingFinal im = ImmutableClassWithoutUsingFinal.createNewInstance(100, "test",
				new Date());
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(),
				im.getMutableField());
		System.out.println(im);
	}

	private static void tryModification(Integer immutableField1,
			String immutableField2, Date mutableField) {
		immutableField1 = 555;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}
