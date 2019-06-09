package net.java_school.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		String firstLine = null;
		firstLine = readFirstLineFromFile("./src/movies.txt");
		System.out.println(firstLine);
	}
	
}