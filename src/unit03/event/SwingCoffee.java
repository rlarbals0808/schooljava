package unit03.event;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{

	
	JRadioButton ame = new JRadioButton("�Ƹ޸�ī��");
	JRadioButton latte = new JRadioButton("��");
	JRadioButton capu = new JRadioButton("īǪġ��");
	
	ButtonGroup bg = new ButtonGroup();
	
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	
	
	SwingCoffee(){
		
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		add(p, BorderLayout.NORTH);
		
		bg.add(ame);
		bg.add(latte);
		bg.add(capu);
		
		p.add(ame);
		p.add(latte);
		p.add(capu);
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		add(sp,BorderLayout.CENTER);
		
		setTitle("Ŀ���ֹ�");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingCoffee();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange()==ItemEvent.SELECTED)
			ta.append(((AbstractButton)e.getItem()).getText()+"�� ���õǾ����ϴ�.\n");
		else if(e.getStateChange()==ItemEvent.DESELECTED)
			ta.append(((AbstractButton)e.getItem()).getText()+"�� �����Ǿ����ϴ�.\n");	
	}

}
