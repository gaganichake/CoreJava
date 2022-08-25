package com.corejava.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * The Files API has gotnthe writeString() method which writes a character sequence to a file. 
 * Characters are encoded into bytes using the UTF-8 charset.
 * It has also got the readString() to conveniently read from file.
 */
public class ReadWriteString {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(ClassLoader.getSystemResource("onur.txt").getPath());

		Files.writeString(path, "SW Test Academy", StandardOpenOption.WRITE, StandardOpenOption.SYNC);

		System.out.println("The Content: " + Files.readString(path));
		System.out.println(Files.readString(path).contains("SW Test Academy"));
	}

}
