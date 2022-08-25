package com.corejava.java10;

import java.lang.Runtime.Version;

public class Versions {

	public static void main(String[] args) {
		Version version = Runtime.version();

		System.out.println(version.feature() + "."
				+ version.interim() + "."
				+ version.update() + "."
				+ version.patch() + "."
				+ (version.build().isPresent() ? version.build().get() : null));
	}

}
