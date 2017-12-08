import java.awt.*;
import javax.swing.*;

public class TestCheckBox{
	public static void main(String[] args){
		JFrame j = new JFrame("Check");
		j.setBounds(500,500,500,500);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3,3));

		JCheckBox check = new JCheckBox("java");
		JCheckBox check2 = new JCheckBox("HTML5");
		JCheckBox check3 = new JCheckBox("C#");

		jp.add(check);
		jp.add(check2);
		jp.add(check3);

		Container cp = j.getContentPane();
		cp.add(jp,BorderLayout.NORTH);

		j.setVisible(true);
	}
}