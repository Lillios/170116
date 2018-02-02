import java.net.*;
import java.io.*;

public class Myserver04{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		InputStream is = null;
		OutputStream os = null;
		ServerSocket ss = null;
		Socket sock;

		try{
			ss = new ServerSocket(5999,30);
			sock = ss.accept();
			is = sock.getInputStream();
			os = sock.getOutputStream();

			int n = is.read(buff);
			System.out.write(buff, 0, n);

			String msg = "HELLO";

			os.write(msg.getBytes());
			os.write(buff);

		}catch(Exception e){
			System.out.println("miss");
		}
	}
}