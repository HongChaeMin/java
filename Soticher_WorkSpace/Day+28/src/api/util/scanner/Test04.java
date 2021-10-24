package api.util.scanner;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// URL�� �д� Scanner

		URL url1 = new URL("http://www.naver.com");
		Scanner s = new Scanner(url1.openStream(), "UTF-8");

		String text = "";
		while (s.hasNextLine()) {// ����
			// System.out.println(s.nextLine());
			text += s.nextLine() + "\n";// ���ڿ� �̾���̱�
		}
		s.close();

		System.out.println("[text]");
		System.out.println(text);

		// ����ǥ����(Regular Expression)
		// - ������ ���¸� �˻��ϴ� ��

		// ex) ��ȭ��ȣ�� ������ ��� �˴ϱ�? 010-xxxx-xxxx
		// ���� -> 010 - -> xxxx -> - -> xxxx
		// ex) �ֹι�ȣ ���ڸ��� ������ ��� �˴ϱ�?
		// ���� -> xxxxxx -> ��
		// ���� -> xx -> 1~12 -> 1~31 -> ��
		// ex) �����ȣ, �̸���, Ȩ������ �ּ�, ���¹�ȣ, �ſ�ī��, ���̵�, ��й�ȣ

		// ���� ����Ʈ
		// http://www.regexper.com

		// [�ֿ� ��ȣ]
		// ^ ������ ����
		// $ ������ ��

		// abc abc�� �ݵ�� ����
		// [abc] abc�߿� 1���� �ݵ�� ����
		// [a-c] a���� c���̿��� 1���� �ݵ�� ����
		// [a-c]{5} a���� c������ ���ڰ� �ݵ�� 5�� ����
		// [a-c]{5, 10} a���� c������ ���ڰ� �ݵ�� 5~10�� ����
		// [a-c]{5, } a���� c������ ���ڰ� �ݵ�� 5���̻� ����

		// a? a�� ���� ���� �ְ�, ���� ���� �ִ�(0 or 1)
		// a{0, 1} ��� �Ұ�, {}���� 0�� ���� �� ����

		// Ư������
		// \d [0-9]�� ����
		// \w [a-ZA-Z-0]�� ����
		// \s white space, ����
		// . �ƹ����ڳ� ����(any charcter)
		// [0-9]+ ���� 1�� �̻�
		// [0-9]* ���� 0�� �̻�
		// [0-9]? ���� 0�� �Ǵ� 1��

		// �ڹ� api������ java.utile.regex.Pattern�� ���� ���� ������ ���´�

	}

}
