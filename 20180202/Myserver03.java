import java.net.*;
import java.io.*;

public class Myserver03{
	public static void main(String[] args){
		byte[] buff = new byte[1024];
		InputStream is = null;
		ServerSocket ss = null;
		Socket sock;

		try{
			ss = new ServerSocket(5999,30);
			sock = ss.accept();
			is =  sock.getInputStream();

			int n = is.read(buff);
			System.out.write(buff, 0, n);

		}catch(Exception e){
			System.out.println("miss");
		}
	}
}