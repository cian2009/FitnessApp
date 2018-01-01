package ie.fitnessapp.options;

import java.io.File;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class LoginUser {

	public static boolean fileStatus(int clientID, Socket clientSocket, ObjectOutputStream out, String userDetails) {
		
		File file = new File("Users/"+userDetails+"/User-Details.txt");
		
		if(file.exists()){
			System.out.println("Client "+clientID+": Address - "+clientSocket.getInetAddress().getHostName()+" - logging in with PPSN: \""+userDetails+"\"");
			
			return true;
		}else{
			System.out.println("Client "+clientID+": Address - "+clientSocket.getInetAddress().getHostName()+" - login failed with PPSN: \""+userDetails+"\" (Doesn't exist)");
			
			return false;
		}
	}
}
