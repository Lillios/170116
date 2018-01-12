import java.io.*;

public class TestReader{
	public static void main(String[] args){
		File f = new File("data.txt");
		try{
			f.createNewFile();
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String msg = br.readLine();
			System.out.println("Hello");
			System.out.println(msg);
		}
		catch(IOException e){
			System.out.println("ALOHA");
		}
	}
}