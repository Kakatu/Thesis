package ph.greatjaggi.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI extends JFrame implements ActionListener{
	
	private JButton click = new JButton("Click");
	
	Thread1 th = new Thread1();
	public UI()	{
		super("User Interface!");
		add(click); click.addActionListener(this);
		th.start();

	}//construct
	
	public void actionPerformed(ActionEvent ae) {
		click.setText("Hehe");
		
	}
	
	public static void main(String []args)	{
		UI frame = new UI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
//		Thread1 th = new Thread1();
//		th.start();
		
		Thread2 th2 = new Thread2();
	//	th2.start();
	}//main

	
}
