import java.net.*;
import java.io.*;
import java.util.Date;

public class HttpServerTest
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(7919);
			Socket cl = ss.accept();
			DataInputStream dis = new DataInputStream(new BufferedInputStream(cl.getInputStream()));
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(cl.getOutputStream()));
			Date today = new Date();
			String resp = today + "";
			cl.getOutputStream().write(resp.getBytes("UTF-8"));
			while (true) { }
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
			
		