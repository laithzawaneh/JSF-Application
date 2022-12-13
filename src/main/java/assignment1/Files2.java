package assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Files2 {
	public static void main(String[] args) throws IOException {

		String files[] = { "d:\\1.csv", "d:\\2.csv", "d:\\3.csv", "d:\\4.csv" };
		ArrayList<String> storege = new ArrayList<String>();
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String s = "";
		String s1 = null;
		for (int i = 0; i < files.length; i++) {

			try {
				fr = new FileReader(files[i]);
				br = new BufferedReader(fr);
				s = br.readLine();
				while ((s = br.readLine()) != null) {
					
					System.out.println(s);
//					s = br.readLine();

				}
				storege.add(files[i]);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				close(br);
				close(fr);
			}
		}

		bw = new BufferedWriter(new FileWriter("d:\\files1.csv"));
		for (int i = 0; i < storege.size(); i++) {
			s1=storege.get(i);
			if (i == 0) {
				bw.write(s1 + "," + "\n");
			} else {
				bw.write(s1);
			}

		}
		bw.close();

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
