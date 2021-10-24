package api.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] blacklist = new String[] {"바보", "멍청이", "새끼"};
		
		while(true) {
			String id;
			int check = 0;
			
			try {
				System.out.print("닉네임을 입력해주세요(3~10 글자 내외) : ");
				id = sc.next();
				for(int i=0; i<blacklist.length; i++) {
					if(id.indexOf(blacklist[i])!=-1) {
						check++;
					}
				}
				if(id.length()<3 || id.length()>10) {
					throw new Exception("닉네임 길이가 잘못되었습니다");
				}else if(id.indexOf("운영자")!=-1) {
					throw new Exception("\'운영자\'가 포함되어 있습니다");
				}else if(check != 0) {
					throw new Exception("금지 단어가 포함되어 있습니다");
				}else {
					System.out.println("등록이 완료되었습니다");
					return;
				}
				
			}catch(Exception e) {
				System.err.println("오류 : "+e.getMessage());
			}
			
		}
		
	}

}
