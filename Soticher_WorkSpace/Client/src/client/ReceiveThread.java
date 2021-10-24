package client;

import java.io.*;
import java.net.*;

public class ReceiveThread extends Thread{

	private Socket mSocket;
	
	public void run() {
		
		super.run();
		
		try {
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			
			String receiveString;
			
			while(true) {
				receiveString = tmpbuf.readLine();
			
				System.out.println("»ó´ë¹æ : "+receiveString);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setmSocket(Socket mSocket) {
		this.mSocket = mSocket;
	}
	
}
