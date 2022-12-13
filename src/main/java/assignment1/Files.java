package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Files {
	public static void main(String[] args) {

		String files[] = { "d:\\1.csv", "d:\\2.csv", "d:\\3.csv", "d:\\4.csv" };
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
//		try {
//			fw = new FileWriter("d:\\files.csv");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			close(fw);
//		}

		String s = "";
		for (int i = 0; i < files.length; i++) {
			try {
				fr = new FileReader(files[i]);
				br = new BufferedReader(fr);
				s = br.readLine();
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
