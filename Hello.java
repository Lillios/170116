import java.awt.*;
import javax.swing.*;
public class Hello{
	public static void main(String[] args){
		JFrame j = new JFrame("Hello");
		j.setBounds(500,500,500,500);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		JButton jb = new JButton("CLECK ME");

		JPanel jp = new JPanel();
		jp.add(jb);

		Container cp = j.getContentPane();
		cp.add(jp,BorderLayout.CENTER);

		j.setVisible(true);


	}
}