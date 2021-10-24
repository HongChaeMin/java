package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String 			�ڹ� ���ڿ� �Ѱ� Ŭ����
		//char�� ������ �𿩼� ���� ���°� String, ����/��Ʈ��ũ ������ byte ���� �������� ���� ����
		
		String a = "hello";
		String b = new String("Hello");
		char[] ch = new char[] {'h', 'e', 'l', 'l', 'o'};
		String c = new String(ch);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		System.out.println(a.equals(b));//��ҹ��� ����
		
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		
		//��ҹ��� ������ ��
		System.out.println(a.toLowerCase().equals(b.toLowerCase()));
		
		//�˻�
		String email = "master@megait.co.kr";
		
		System.out.println(email.startsWith("master"));//master�� �����ϴ���
		System.out.println(email.endsWith("co.kr"));//co.kr�� �����ϴ���
		System.out.println(email.indexOf("megait"));
		System.out.println(email.length());
		
		//Ư�� ��ġ�� ���� ���� : �����ϸ� char
		char t = email.charAt(6);
		System.out.println(t);
		
	}

}
