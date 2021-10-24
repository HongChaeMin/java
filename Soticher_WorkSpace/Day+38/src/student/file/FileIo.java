package student.file;

import java.io.*;
import java.util.*;

import student.Student;

public class FileIo {

	private static final String path = "student.txt";
	private Scanner sc;
	private File file;
	private List<String> rank = new ArrayList<>();
	private List<Integer> rAnk = new ArrayList<>();
	
	public FileIo() {
		File file = new File("files", path);
		this.file = file;
	}

	public List<Student> fileInput() throws Exception {
		ArrayList<Student> list = new ArrayList<>();
		List<String> rank = new ArrayList<>();
		
		Reader in = new FileReader(new File("files", path));
		BufferedReader buffer = new BufferedReader(in);
		this.sc = new Scanner(buffer);

		while (sc.hasNext()) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			list.add(new Student(name, kor, eng, math));
			rank.add(sc.next());
		}

		this.rank = rank;
		
		return list;
	}

	public void fileOutput(List<Student> List) throws Exception {

		Writer out = new FileWriter(file);
		PrintWriter printer = new PrintWriter(out);
		
		for(int i=0; i<List.size(); i++) {
			List.get(i).disp();
		}
		
		List<Student> list = rangking(List);
		
		for (int i = 0; i < list.size(); i++) {
			printer.println(list.get(i).getName() + "\t" + list.get(i).getKor() + "\t" + list.get(i).getEng() + "\t"
					+ list.get(i).getMath()+"\t"+rAnk.get(i));
			printer.flush();
		}
		printer.close();

	}
	
	public List<Student> rangking(List<Student> list) throws Exception {

		List<Student> list1 = list;
		
		Student st1 = new Student("", 0, 0, 0);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getTot() > list1.get(j).getTot()) {
					st1 = list.get(i);
					list.set(i, list1.get(j));
					list1.set(j, st1);
				}
			}
		}
		
		rank(list);
		
		return list;
	}
	
	public void rank(List<Student> list) {

		List<Integer> list1 = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			list1.add(list.get(i).getTot());
		}
		for (int i = 0; i < list.size(); i++) {
			int k =1;
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i).getTot() == list1.get(j)) {
					rAnk.add((k));
				}
				else {
					rAnk.add((++k));
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			rank.add(list.get(i).getName());
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(rank.get(i)+", "+rAnk.get(i));
		}
		
	}

}
