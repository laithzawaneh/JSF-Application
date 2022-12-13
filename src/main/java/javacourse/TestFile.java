package javacourse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("d:\\java.text");
			for (int i = 1; i <= 5; i++) {
				fw.write("Java " + i + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(fw);
		}
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("d:\\java.text");
			br = new BufferedReader(fr);
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(br);
			close(fr);
		}
	}

	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void close(FileReader fr) {
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void close(BufferedReader br) {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
