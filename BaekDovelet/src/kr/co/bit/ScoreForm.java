package kr.co.bit;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

class ScoreForm extends JFrame {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JTextArea area;
	private JButton addB, dispB, searchB, tot_descB, saveB, loadB;

	public ScoreForm(){
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		hakT= new JTextField();
		nameT = new JTextField();
		korT = new JTextField();
		engT = new JTextField();
		mathT = new JTextField();
		area = new JTextArea();
		addB = new JButton("입력");
		dispB = new JButton("출력");
		searchB = new JButton("학번검색");
		tot_descB = new JButton("초기화");
		saveB = new JButton("순위");
		loadB = new JButton("파일읽기");
		
		Dimension d = new Dimension(150,20);
		
		JPanel panelLT1 = new JPanel(new FlowLayout());
		panelLT1.add(hakL);
		hakT.setPreferredSize(d);
		panelLT1.add(hakT);
		JPanel panelLT2 = new JPanel(new FlowLayout());
		panelLT2.add(nameL);
		nameT.setPreferredSize(d);
		panelLT2.add(nameT);
		JPanel panelLT3 = new JPanel(new FlowLayout());
		panelLT3.add(korL);
		korT.setPreferredSize(d);
		panelLT3.add(korT);
		JPanel panelLT4 = new JPanel(new FlowLayout());
		panelLT4.add(engL);
		engT.setPreferredSize(d);
		panelLT4.add(engT);
		JPanel panelLT5 = new JPanel(new FlowLayout());
		panelLT5.add(mathL);
		mathT.setPreferredSize(d);
		panelLT5.add(mathT);
		JPanel panelLT = new JPanel(new GridLayout(5,2,0,0));
		panelLT.add(panelLT1);
		panelLT.add(panelLT2);
		panelLT.add(panelLT3);
		panelLT.add(panelLT4);
		panelLT.add(panelLT5);

		JPanel panelB = new JPanel(new FlowLayout());
		panelB.add(addB);
		panelB.add(dispB);
		panelB.add(searchB);
		panelB.add(tot_descB);
		panelB.add(saveB);
		panelB.add(loadB);
		
		Dimension dd = new Dimension(250,250);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		area.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10,10,10,10)));
		area.setPreferredSize(dd);
		
//		JPanel panelPP = new JPanel(new GridLayout(1,2,35,0));
		JPanel panelPP = new JPanel(new FlowLayout());
		panelPP.add(panelLT);
		panelPP.add(area);
		
		Container con = getContentPane();
		con.add("Center",panelPP);
		con.add("South",panelB);

		setTitle("성적관리");
		setBounds(300,300,500,340);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ScoreForm();
	}
}
