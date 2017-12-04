import java.awt.*;
import javax.swing.*;

public class TestGui extends JFrame{
	public static void main(String[] args){
		TestGui tg = new TestGui("Hello");
		tg.setVisible(true);
	}
	TestGui(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();

		JTextField jt = new JTextField("Hello");
		JPasswordField jpf = new JPasswordField();

		jp.add(jt,BorderLayout.NORTH);
		jp.add(jpf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(jp,BorderLayout.NORTH);
	}
}
