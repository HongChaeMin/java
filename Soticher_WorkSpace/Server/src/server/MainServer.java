package server;

import java.io.*;
import java.net.*;

public class MainServer {

	public static void main(String[] args) throws Exception {
		
		try {
			ServerSocket s_socket = new ServerSocket(8888);
			
			Socket c_socket = s_socket.accept();
			
			ReceiveThread rec_thread = new ReceiveThread();
			rec_thread.setmSocket(c_socket);
			
			SendThread send_thread = new SendThread();
			send_thread.setSocket(c_socket);
			
			rec_thread.start();
			send_thread.start();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
