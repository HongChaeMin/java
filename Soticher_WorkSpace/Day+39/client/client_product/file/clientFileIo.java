package client_product.file;

import java.util.*;
import java.io.*;

import client_product.clientProduct;

public class clientFileIo {

	private final static String fileName = "product.txt";
	private List<clientProduct> list = new ArrayList<>();
	private File file;
	private Scanner sc;

	public clientFileIo() {
		File file = new File("files", clientFileIo.fileName);
		this.file = file;
	}

	public void fileOutput(List<clientProduct> list) {
		try {
			PrintWriter printer = new PrintWriter(new FileWriter(this.file));

			for (int i = 0; i < list.size(); i++) {
				printer.println(
						list.get(i).getName() + "\t" + list.get(i).getPrice() + "\t" + list.get(i).getQuantity());
				printer.flush();
			}
			printer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<clientProduct> fileInput() {

		try {
			List<clientProduct> list = new ArrayList<>();

			BufferedReader buffer = new BufferedReader(new FileReader(new File("files", fileName)));
			sc = new Scanner(buffer);

			while (sc.hasNext()) {
				list.add(new clientProduct(sc.next(), sc.nextInt(), sc.nextInt()));
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
