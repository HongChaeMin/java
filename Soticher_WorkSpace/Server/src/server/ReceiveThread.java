package server;

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
				
				if(receiveString == null) {
					System.out.println("���� ������ ������ϴ�");
					break;
				}
				else {
					System.out.println("���� : "+receiveString);
				}
			}
			
			tmpbuf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setmSocket(Socket mSocket) {
		this.mSocket = mSocket;
	}
	
}
