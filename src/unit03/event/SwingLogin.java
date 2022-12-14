package unit03.event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	JLabel lbId = new JLabel("아이디",JLabel.CENTER);
	JLabel lbPwd = new JLabel("비밀번호",JLabel.CENTER);
	JLabel lbResult = new JLabel("결과출력",JLabel.LEFT);
	
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	SwingLogin(){
		
		setLayout(new BorderLayout());
		
		ImageIcon image = new ImageIcon("images/robot.png");
		JLabel lbLogo = new JLabel(image);
		add(lbLogo, BorderLayout.NORTH);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
		add(p, BorderLayout.CENTER);
		p.add(lbId);
		p.add(tfId);
		p.add(lbPwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		add(lbResult, BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("로그인");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new SwingLogin();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			String strId =tfId.getText();
			String strPwd = new String(tfPwd.getPassword());
			
			if(strId.length()==0)
				lbResult.setText("아이디를 입력하세요.");
			else if (strPwd.length()==0)
				lbResult.setText("비밀번호를 입력하세요.");
			else
				lbResult.setText(strId+"의 비밀번호는"+strPwd+"입니다.");
			
			
			
		}
		else if (e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다.");
			tfId.setText("");
			tfPwd.setText("");
			
		}
	}

}
