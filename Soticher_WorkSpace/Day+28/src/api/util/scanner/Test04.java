package api.util.scanner;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// URL을 읽는 Scanner

		URL url1 = new URL("http://www.naver.com");
		Scanner s = new Scanner(url1.openStream(), "UTF-8");

		String text = "";
		while (s.hasNextLine()) {// 문장
			// System.out.println(s.nextLine());
			text += s.nextLine() + "\n";// 문자열 이어붙이기
		}
		s.close();

		System.out.println("[text]");
		System.out.println(text);

		// 정규표현식(Regular Expression)
		// - 문장의 형태를 검사하는 식

		// ex) 전화번호의 형식은 어떻게 됩니까? 010-xxxx-xxxx
		// 시작 -> 010 - -> xxxx -> - -> xxxx
		// ex) 주민번호 앞자리의 형식은 어떻게 됩니까?
		// 시작 -> xxxxxx -> 끝
		// 시작 -> xx -> 1~12 -> 1~31 -> 끝
		// ex) 우편번호, 이메일, 홈페이지 주소, 계좌번호, 신용카드, 아이디, 비밀번호

		// 참고 사이트
		// http://www.regexper.com

		// [주요 기호]
		// ^ 문장의 시작
		// $ 문장의 끝

		// abc abc가 반드시 나옴
		// [abc] abc중에 1개가 반드시 나옴
		// [a-c] a부터 c사이에서 1개가 반드시 나옴
		// [a-c]{5} a부터 c사이의 글자가 반드시 5개 나옴
		// [a-c]{5, 10} a부터 c사이의 글자가 반드시 5~10개 나옴
		// [a-c]{5, } a부터 c사이의 글자가 반드시 5개이상 나옴

		// a? a가 있을 수도 있고, 없을 수도 있다(0 or 1)
		// a{0, 1} 사용 불가, {}에는 0을 적을 수 없다

		// 특수문자
		// \d [0-9]와 동일
		// \w [a-ZA-Z-0]와 동일
		// \s white space, 띄어쓰기
		// . 아무글자나 가능(any charcter)
		// [0-9]+ 숫자 1개 이상
		// [0-9]* 숫자 0개 이상
		// [0-9]? 숫자 0개 또는 1개

		// 자바 api에서는 java.utile.regex.Pattern을 가면 상세한 설명이 나온다

	}

}
