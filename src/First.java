import java.io.*;

import org.jibble.pircbot.*;
public class First extends PircBot {
	public First() {
		this.setName("genesis_");
	}
	public void onMessage(String channel, String sender,String login, String hostname,String message) {
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("temp.txt", true)))) {
		    out.println(sender + " : " + message);
		    out.close();
		}catch (IOException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}
				
		if (message.equalsIgnoreCase("time"))
		{
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + " : " + time);
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("temp.txt", true)))) {
			    out.println(this.getName() + " (bot) : " + sender + " : " + time);
			    out.close();
			}catch (IOException e) {
				System.out.println("File not Found");
				e.printStackTrace();
			}
		}
		if (message.equalsIgnoreCase("hi bot"))
		{
			sendMessage(sender,"Hi");
		}
	}
	
}