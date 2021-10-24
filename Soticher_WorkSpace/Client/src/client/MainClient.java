package client;

import java.io.*;
import java.net.*;

public class MainClient {

	public static void main(String[] args) throws Exception, Exception {
		
		try {
			Socket c_socket = new Socket("192.168.10.1", 8888);
			
			ReceiveThread rec_thread = new ReceiveThread();
			rec_thread.setmSocket(c_socket);
			
			SendThread send_thread = new SendThread();
			send_thread.setSocket(c_socket);
			
			send_thread.start();
			rec_thread.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//https://m.blog.naver.com/highkrs/220844554537
		
	}

}
