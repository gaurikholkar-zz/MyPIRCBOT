

import org.jibble.pircbot.*;

//import org.jibble.pircbot.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MyBot extends PircBot {
    
    public MyBot() {
        this.setName("IAmREBel");
    }
    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
        if (message.equalsIgnoreCase("time")) {
            String time = new java.util.Date().toString();
            sendMessage(channel, sender + ": The time is now " + time);
      }  

//public static void main(String[] args) {
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("filename.txt", true)));
		    out.println(sender+message);
		    out.close();
		} catch (IOException e) {
			e.printStackTrace();
		    //exception handling left as an exercise for the reader
		}
	}
}


















