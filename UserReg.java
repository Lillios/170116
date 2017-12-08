import java.awt.*;
import javax.swing.*;

public class UserReg{
	public static void main(String[] args){
		JFrame j = new JFrame("User");
		j.setBounds(500,500,500,500);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(2,2));

		JTextField jt = new JTextField(10);
		JLabel label = new JLabel("Mail");

		JPasswordField jpf = new JPasswordField(10);
		JLabel label2 = new JLabel("pass");
		
		jp.add(label);
		jp.add(jt);
		jp.add(label2);
		jp.add(jpf);

		Container cp = j.getContentPane();
		cp.add(jp,BorderLayout.NORTH);

		j.setVisible(true);
	}
}