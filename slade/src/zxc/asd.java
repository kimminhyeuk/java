package zxc;

import java.io.*;
import java.net.*;
import java.util.*;

public class asd{
	public static void main(String args) {
		BufferedReader in = null;
		BufferedWriter out = null; 
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner =new Scanner(System.in);
		try{
			listener = new ServerSocket(9999);
			socket = listener.accept();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true){
			  System.out.print("보내기>>");
			  String outputMessage = scanner.nextLine();
			  if (outputMessage.equalsIgnoreCase("bye")){
				  out.write(outputMessage= "\n");
				  out.flush();
				  break;
			  }
			  out.write(outputMessage + "\n");
			  out.flush();
			  String inputMessage = in.readLine();
			  System.out.println("서버:" + inputMessage);
			  }
		} catch (IOException e){
			System.out.println("서버: + inputMessage");
		
			  } finally{
				  try{
					  scanner.close();
					  if(socket  != null) socket.close();
				  } catch (IOException e){
					  System.out.println("서벙허 채팅중 오류가 발생했습니다.");
			}
		}
		
	}
}
