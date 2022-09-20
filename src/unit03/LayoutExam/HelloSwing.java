package unit03.LayoutExam;

import javax.swing.JFrame;


public class HelloSwing extends JFrame{
	
	// TODO Auto-generated method stub
	HelloSwing(){
		setTitle("안녕 스윙");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
			
	
	public static void main(String[] args) {
		
		
		// 1. new 생성자() 로 윈도우 프로그램 실행시키기
		new HelloSwing();
		
	}

}
