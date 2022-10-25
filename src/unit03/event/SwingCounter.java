package unit03.event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingCounter extends JFrame implements ActionListener{
	JLabel lb = new JLabel("ī�����");
	JTextField tf = new JTextField("0",5);
	JButton btnInc = new JButton("����");
	JButton btnDec = new JButton("����");
	JButton btnCls = new JButton("�ʱ�ȭ");
	
	
	
	SwingCounter(){
		
		JPanel p = new JPanel();
		add(p);
		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);

		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		setTitle("���� ī����");
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String str;
		int cnt;
		
		if(e.getSource() == btnInc) {
			str = tf.getText().trim();
			cnt = Integer.parseInt(str) + 1;
			tf.setText(cnt+"");
		}
		else if(e.getSource() == btnDec) {
			str = tf.getText().trim();
			cnt = Integer.parseInt(str) - 1;
			tf.setText(cnt+"");
			
		}
		else if(e.getSource() == btnCls) {
			tf.setText("0");
			
		}
		
	}

	private String getText(JTextField tf2) {
		// TODO Auto-generated method stub
		return null;
	}

}
