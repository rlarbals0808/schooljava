package unit03.LayoutExam;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel(){
		JPanel p = new JPanel();
		p.setBackground(Color.MAGENTA);
		add(p);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.PINK);
		JButton btn2 = new JButton("버튼2");
		btn2.setBackground(Color.PINK);
		p.add(btn1);
		p.add(btn2);
		
		setTitle("안녕 버튼");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloPanel();
	}

}