package product.file;

import product.Product;
import java.util.*;
import java.io.*;

public class FileIo {

	private final static String fileName = "product.txt";
	private List<Product> list = new ArrayList<>();
	private File file;
	private Scanner sc;

	public FileIo() {
		File file = new File("files", FileIo.fileName);
		this.file = file;
	}

	public void fileOutput(List<Product> list) throws Exception {

		Writer out = new FileWriter(file);
		PrintWriter printer = new PrintWriter(out);

		for (int i = 0; i < list.size(); i++) {
			printer.println(list.get(i).getName() + "\t" + list.get(i).getPrice() + "\t" + list.get(i).getQuantity());
			printer.flush();
		}
		printer.close();

	}
	
	public List<Product> fileInput() throws Exception{
		List<Product> list = new ArrayList<>();
		
		Reader in = new FileReader(new File("files", fileName));
		BufferedReader buffer = new BufferedReader(in);
		sc = new Scanner(buffer);
		
		while(sc.hasNext()) {
			String name = sc.next();
			int price = sc.nextInt();
			int qunatity = sc.nextInt();
			list.add(new Product(name, price, qunatity));
		}
		
		return list;
	}

}
