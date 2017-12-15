import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fukushu extends JFrame implements ActionListener{
	JButton jb;
	JPanel jp;
	JLabel jl;
	JCheckBox jc;

	public static void main(String[] args){
		Fukushu frame = new Fukushu("test");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	Fukushu(String title){
		setBounds(500,500,500,500);

		jb = new JButton("ok");
		jb.addActionListener(this);
		jp = new JPanel();
		jl = new JLabel();
		jl.setHorizontalAlignment(JLabel.CENTER);
		jc = new JCheckBox("a");

		jp.add(jb);
		jp.add(jl);
		jp.add(jc);

		Container cp = getContentPane();

		cp.add(jp,BorderLayout.SOUTH);

	}
	public void actionPerformed(ActionEvent e){
		System.out.println("click");

		if(this.jc.isSelected()){
			this.jl.setText(this.jc.getText()+"select");
		} else {
			this.jl.setText("noselected");
		}
	}
}