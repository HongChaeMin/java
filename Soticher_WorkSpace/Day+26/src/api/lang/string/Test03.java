package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		
		String url = "http://www.naver.com";
		
		//���ڿ� ���� subString
		System.out.println(url.substring(7, 10));//������ ��ġ �ε������� �� �ε��� �� ����
		System.out.println(url.substring(7));//������ ��ġ ���� ������
		//�߶� ��ȯ
		
		//.replace
		System.out.println(url.replace('/','+'));
		System.out.println(url.replace("com", "org"));
		
		url = "                http://www.naver.com";
		
		//.trim - ���� ����
		System.out.println(url+url.length());
		System.out.println(url.trim()+url.trim().length());
		
	}

}
