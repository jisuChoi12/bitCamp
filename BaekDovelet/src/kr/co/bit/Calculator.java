package kr.co.bit;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.WildcardType;
import java.awt.event.WindowAdapter;

class Calculator extends Frame implements ActionListener{
	private Button[] btn;
	private Panel[] p;
	private Label upL, downL;
	private String[] btnName;
	static String strForDisp;
//	static String strForCalc;
//	double a;
//	double b;
//	double answer; 
	

	public void init(){	
		upL = new Label(""); // 식
		downL = new Label(""); // 입력 숫자
		btn = new Button[18];
		p = new Panel[8];
		btnName = new String[]{"BackSpace","C","7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};
		strForDisp = "";
		
		this.setResizable(false); // 윈도우 크기 고정

		// 패널배열객체생성
		for (int i = 0; i < p.length; i++) { 
			p[i] = new Panel(); 
		}
		
		// 패널 레이아웃
		p[0].setBackground(new Color(209,209,209));
		p[0].setLayout(new GridLayout(7,1,5,5));
		//p[1].setLayout(new GridLayout(1,1,5,5));
		//p[2].setLayout(new GridLayout(1,1,5,5));
		p[3].setLayout(new GridLayout(1,2,5,5));
		p[4].setLayout(new GridLayout(1,4,5,5));
		p[5].setLayout(new GridLayout(1,4,5,5));
		p[6].setLayout(new GridLayout(1,4,5,5));
		p[7].setLayout(new GridLayout(1,4,5,5));

		// 라벨
		upL.setBackground(new Color(204,220,253));
		upL.setPreferredSize(new Dimension(280,35));
		upL.setAlignment(Label.RIGHT);
		downL.setBackground(new Color(204,220,253));
		downL.setPreferredSize(new Dimension(280,35));
		downL.setAlignment(Label.RIGHT);
		
		// 버튼배열객체생성
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(btnName[i]);
		}
		
		// 작은패널 <- 버튼/라벨
		p[1].add(upL);
		p[2].add(downL);
		p[3].add(btn[0]);
		p[3].add(btn[1]);
		int n = 2;
		for (int i = 4; i <= p.length-1; i++) {
			for (int j = n; j <= n+3; j++) {
				p[i].add(btn[j]);
			}
			n+=4;
		}
		
		// 전체패널
		add(p[0]); 	
		
		// 전체패널 <-작은패널
		for(int i = 1; i<=7; i++) 
			p[0].add(p[i]);
		
		// window
		setTitle("계산기");
		setBounds(800,250,300,400);
		setBackground(new Color(100,100,100));
		setVisible(true);
		
		// event
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn[0].addActionListener(this);
		btn[1].addActionListener(this);
		btn[2].addActionListener(this);
		btn[3].addActionListener(this);
		btn[4].addActionListener(this);
		btn[5].addActionListener(this);
		btn[6].addActionListener(this);
		btn[7].addActionListener(this);
		btn[8].addActionListener(this);
		btn[9].addActionListener(this);
		btn[10].addActionListener(this);
		btn[11].addActionListener(this);
		btn[12].addActionListener(this);
		btn[13].addActionListener(this);
		btn[14].addActionListener(this);
		btn[15].addActionListener(this);
		btn[16].addActionListener(this);
		btn[17].addActionListener(this);
		
	}
	
	// 연속으로 부호 x
	public boolean simbolCheck() {
		boolean sim = false;
		strForDisp = downL.getText();
		if (strForDisp.length()==0) {
			System.out.println("?");
		}
		else {
			char ch = strForDisp.charAt(strForDisp.length() - 1);
			if (ch != '/' && ch != '-' && ch != '+' && ch != '*' && ch != '.' && ch != '=') {
				sim = true;
			}
		}
		return sim;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn[0]) { //BackSpace
			strForDisp = downL.getText();
			if(strForDisp.length()>0) {
				strForDisp = strForDisp.substring(0, strForDisp.length()-1);
				downL.setText(strForDisp);
			}
		}
		else if(e.getSource()==btn[1]) { // C
			strForDisp = "";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[2]) { // 7
			strForDisp += "7";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[3]) { // 8
			strForDisp += "8";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[4]) { // 9
			strForDisp += "9";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[5]) { // /
			if(simbolCheck()) {
				strForDisp += "/";
				downL.setText(strForDisp);
			}
		}
		else if(e.getSource()==btn[6]) { // 4
			strForDisp += "4";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[7]) { // 5
			strForDisp += "5";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[8]) { // 6
			strForDisp += "6";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[9]) { // *
			if (simbolCheck()) {
				strForDisp += "*";
				downL.setText(strForDisp);				
			}
		}
		else if(e.getSource()==btn[10]) { // 1
			strForDisp += "1";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[11]) { // 2
			strForDisp += "2";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[12]) { // 3
			strForDisp += "3";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[13]) { // -
			if (simbolCheck()) {
				strForDisp += "-";
				downL.setText(strForDisp);				
			}
		}
		else if(e.getSource()==btn[14]) { // .
			if (simbolCheck()) {
				strForDisp += ".";
				downL.setText(strForDisp);						
			}
		}
		else if(e.getSource()==btn[15]) { // 0
			strForDisp += "0";
			downL.setText(strForDisp);
		}
		else if(e.getSource()==btn[16]) { // =
			if (simbolCheck()) {
				//strForDisp += "=";
				//downL.setText(strForDisp);
				upL.setText(strForDisp);
				strForDisp = "";
				downL.setText(strForDisp);
			}
		}
		else if(e.getSource()==btn[17]) { // +
			if (simbolCheck()) {
				strForDisp += "+";
				downL.setText(strForDisp);			
			}
		}
	}
	
	// main
	public static void main(String[] args) {
		new Calculator().init();
	}



}