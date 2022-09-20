import java.io.PrintWriter;
import java.net.*;
public class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket s1 = new Socket(InetAddress.getByName("localhost"),4000);
		PrintWriter pw  = new PrintWriter(s1.getOutputStream(),true);
		pw.println("Hey................jauuunuuuuuuuuuuuuuuu");
		pw.close();
		s1.close();

	}
}