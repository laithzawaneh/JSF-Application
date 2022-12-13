package assignment1;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.Thread.State;
import java.util.ArrayList;

public class Files3 {

	public static void main(String[] args) {
		String files[] = { "d:\\1.csv", "d:\\2.csv", "d:\\3.csv", "d:\\4.csv" };
		ArrayList<String> filestorege = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter data=null;
		String s = null;
		try {

			for (int i = 0; i < files.length; i++) {
				fr = new FileReader(files[i]);
				br = new BufferedReader(fr);
				data=new FileWriter("d:\\files1.csv");
				s = br.readLine();
				while (s != null) {
					System.out.println(s);
					s = br.readLine();
					
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileWriter fw = null;
		try {
			fw = new FileWriter("d:\\files1.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
