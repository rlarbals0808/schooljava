package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{
	
	HelloButton(){
		JPanel p = new JPanel();
		p.setBackground(Color.cyan);
		add(p);
		
		JButton btn = new JButton("버튼");
		btn.setBackground(Color.red);
		p.add(btn);
		
		setTitle("안녕 버튼");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloButton();
	}

}
