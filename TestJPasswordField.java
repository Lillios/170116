import java.awt.*;
import javax.swing.*;

public class TestJPasswordField{
	public static void main(String[] args){
		JFrame j = new JFrame("pass");
		j.setBounds(500,500,500,500);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();

		JPasswordField jpf = new JPasswordField(8);

		jp.add(jpf);

		Container cp = j.getContentPane();
		cp.add(jp,BorderLayout.NORTH);

		j.setVisible(true);
	}
}
