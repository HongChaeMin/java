package client;

import java.io.*;
import java.net.*;

public class SendThread extends Thread{

	private Socket mSocket;
	
	public void run() {
		
		super.run();
		try {
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter sendWriter = new PrintWriter(mSocket.getOutputStream());
			String sendString;
			
			while(true) {
				sendString = tmpbuf.readLine();
				
				if(sendString.equals("exit")) break;
				
				sendWriter.println(sendString);
				sendWriter.flush();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setSocket(Socket _socket) {
		mSocket = _socket;
	}
	
}
