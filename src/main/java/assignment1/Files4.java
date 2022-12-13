package assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Files4 {
	public static void main(String[] args) throws IOException {

		String listFiles = null;
		ArrayList<String> filestorege = new ArrayList<String>();
//		System.out.println(filestorege.get(1));

		try {

			BufferedReader bufferreader1 = new BufferedReader(new FileReader("d:\\1.csv"));
			BufferedReader bufferreader2 = new BufferedReader(new FileReader("d:\\2.csv"));
			BufferedReader bufferreader3 = new BufferedReader(new FileReader("d:\\3.csv"));
			BufferedReader bufferreader4 = new BufferedReader(new FileReader("d:\\4.csv"));

			String file1 = null;

			while ((file1 = bufferreader1.readLine()) != null) {
				filestorege.add(file1);
			}

			boolean file2isHeader = true;
			String file2 = null;

			while ((file2 = bufferreader2.readLine()) != null) {
				if (file2isHeader) {
					file2isHeader = false;
					continue;
				}
				filestorege.add(file2);
			}

			boolean file3isHeader = true;
			String file3 = null;

			while ((file3 = bufferreader3.readLine()) != null) {

				if (file3isHeader) {
					file3isHeader = false;
					continue;
				}

				filestorege.add(file3);
			}

			boolean file4isHeader = true;
			String file4 = null;

			while ((file4 = bufferreader4.readLine()) != null) {
				if (file4isHeader) {
					file4isHeader = false;
					continue;
				}
				filestorege.add(file4);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		BufferedWriter bufferwriter = null;
		bufferwriter = new BufferedWriter(new FileWriter("d:\\files.csv"));

		for (int i = 0; i < filestorege.size(); i++) {
			listFiles = filestorege.get(i);
			if (i == 0) {
				bufferwriter.write(listFiles + "," + ("Avg") + "\n");
			} else
//	I don't know how i can get integer elements  
				bufferwriter.write(listFiles + "," + ((1 + 2 + 3) / 3) + "\n");
			System.out.println(listFiles);
		}

		bufferwriter.close();
	}

}
