import java.net.*;

public class Myserver02{
	public static void main(String[] args){
		ServerSocket ss = null;
		Socket s;

		try{
			ss = new ServerSocket(6000,30);
			s = ss.accept();
			System.out.println(s);
		}catch(Exception e){
			System.out.println("miss");
		}
	}
}