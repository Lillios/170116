import java.net.*;

public class MyClient01{
	public static void main(String[] args){
		Socket s;
		
		try{
			s = new Socket(args[0],Integer.parseInt(args[1]));
		}catch(Exception e){
			System.out.println("miss");
		}
	}
}