package test;

import java.io.*;
import java.util.*;

public class FileIo {
	private static final String path = "chatting.txt";
	private Scanner sc;
	private File file;
	List<String> list = new ArrayList<>();
	
	public FileIo() {
		File file = new File("files", path);
		this.file = file;
	}

	public List<String> fileInput() throws Exception {
		ArrayList<String> list = new ArrayList<>();
		
		Reader in = new FileReader(new File("files", path));
		BufferedReader buffer = new BufferedReader(in);

		while(true) {
			String text = buffer.readLine();
			if(text == null) break; //EOF
			list.add(text);
		}
		
		return list;
	}

	public void fileOutput(List<String> list) throws Exception {
		
		Writer out = new FileWriter(file);
		PrintWriter printer = new PrintWriter(out);
		
		for (int i = 0; i < list.size(); i++) {
			printer.println(list.get(i));
			printer.flush();
		}
		printer.close();

	}

}
