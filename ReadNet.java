import java.io.*;
import java.net.*;

public class ReadNet{
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		Socket readsock = null;
		InputStream instr = null;
		boolean cont = true;

		try{
			readsock = new Socket(args[0],Integer.parseInt(args[1]));
			instr = readsock.getInputStream();
		}catch(Exception e){
			System.out.println("NetWorkErrer");
			System.exit(1);
		}
		while(cont){
			try{
				int n = instr.read(buff);
				System.out.write(buff, 0, n);
			}
			catch(Exception e){
				cont = false;
			}
		}
		try{
			instr.close();
		} 
		catch(Exception e){
			System.out.println("networkErrer");
			System.exit(1);
		}
	}
}