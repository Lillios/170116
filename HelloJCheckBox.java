import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
 	JLabel label;

 	public static void main(String[] args){
		HelloJCheckBox frame = new HelloJCheckBox("test");
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setVisible(true);
 	}
 	HelloJCheckBox(String title){
 		setBounds(500,500,500,500);		
 	}
 }