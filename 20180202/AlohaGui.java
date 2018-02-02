import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AlohaGui extends JFrame implements ActionListener{
	JTextField jt = new JTextField(10);

	public static void main(String[] args) {
			AlohaGui window = new AlohaGui("window");
			window.setBounds(500,500,500,500);
			window.setDefaultCloseOperation(EXIT_ON_CLOSE);
			window.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		jt.setText("Aloha");
	}
	AlohaGui(String title){
		JButton jb = new JButton();
		jb.addActionListener(this);

		JPanel jp = new JPanel();
		jp.add(jb);
		jp.add(jt);

		Container cp = getContentPane();

		cp.add(jp,BorderLayout.CENTER);


	}
}
