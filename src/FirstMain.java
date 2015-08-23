import org.jibble.pircbot.*;


public class FirstMain extends PircBot {

	public static void main(String[] args) throws Exception {
		First bot=new First();
		bot.setVerbose(true);
		try
		{
			//bot.connect("webchat.quakenet.org");
			//bot.connect("webchat.freenode.net");
			bot.connect("irc.freenode.net");
		}catch(NickAlreadyInUseException n)
		{
			bot.setAutoNickChange(true);
			bot.reconnect();
		}
		catch (Exception e)
		{
			System.out.println("Can't Connect: " +e);
			return;
		}
		bot.joinChannel("#myown");
		//bot.dccSendFile("temp.txt", "genesis_", 20000);
	}
		
}
