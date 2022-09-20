import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(4000);
		System.out.println("watting for client....");
		Socket s1 = ss.accept();
		System.out.println("yes...........connected.............");
		BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		System.out.println("message from client : "+br.readLine() );

		s1.close();
		br.close();
	}
}