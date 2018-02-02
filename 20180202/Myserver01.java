import java.net.*;

public class Myserver01{
	public static void main(String[] args){
		ServerSocket ss = null;
		Socket s;

		try{
			ss = new ServerSocket(6000,30);
			s = ss.accept();
		}catch(Exception e){
			System.out.println("miss");
		}
	}
}