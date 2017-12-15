import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJRadio extends JFrame implements ActionListener{
	JButton jb;
	JLabel jl;
	JPanel jp;
	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;

	public static void main(String[] args){
		HelloJRadio frame = new HelloJRadio("test");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	HelloJRadio(String title){
		setBounds(500,500,500,500);

		jb = new JButton();
		jb.addActionListener(this);
		jl = new JLabel();
		jp = new JPanel();
		jr1 = new JRadioButton();
		jr2 = new JRadioButton();
		jr3 = new JRadioButton();
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.jr1);
		bg.add(this.jr2);
		bg.add(this.jr3);

		jp.add(jb);
		jp.add(jl);
		jp.add(jr1);
		jp.add(jr2);
		jp.add(jr3);

		Container cp = getContentPane();

		cp.add(jp,BorderLayout.CENTER);

	}
	public void actionPerformed(ActionEvent e){
		Boolean kekka1 = this.jr1.isSelected();
		Boolean kekka2 = this.jr2.isSelected();
		Boolean kekka3 = this.jr3.isSelected();

		String msg;
		if(kekka1){
			msg = this.jr1.getText()+"selected";
			this.jl.setText(msg);
		}
		if(kekka2){
			msg = this.jr2.getText()+"selected";
			this.jl.setText(msg);
		}
		if(kekka3){
			msg = this.jr3.getText()+"selected";
			this.jl.setText(msg);
		}
	}
}