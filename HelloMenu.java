import java.awt.*;
import javax.swing.*;

public class HelloMenu{
	public static void main(String[] args){
		JFrame j = new JFrame();
		j.setBounds(500,500,500,500);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);

		JMenuBar jm = new JMenuBar();

		JMenu menu1 = new JMenu("File");

		JMenuItem menuItem1 = new JMenuItem("new");
		JMenuItem menuItem2 = new JMenuItem("open");

		j.setJMenuBar(jm);
		jm.add(menu1);
		menu1.add(menuItem1);
		menu1.add(menuItem2);


		j.setVisible(true);


	}
}