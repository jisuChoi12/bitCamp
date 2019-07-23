package kr.co.bit;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.awt.event.WindowAdapter;

class Calculator extends Frame implements ActionListener{
	private Button[] btn;
	private Panel[] p;
	private Label inL, outL;
	private String[] btnName;
	private StringBuffer inBuf;
	private StringBuffer outBuf;
	private double result;
	private int op=-100;
	private DecimalFormat df = new DecimalFormat("#,###.#####");
	
	public void init(){	
		btn = new Button[18];
		p = new Panel[8];
		inL = new Label(""); // 결과
		outL = new Label(""); // 입력 숫자/부호
		btnName = new String[]{"BackSpace","C",
								"7","8","9","/",
								"4","5","6","*",
								"1","2","3","-",
								".","0","=","+"};
		inBuf = new StringBuffer();
		outBuf = new StringBuffer();
		outBuf.append("0");
		outL.setText(outBuf.toString());
		result = 0; // 중간결과,최종결과
	
		// 버튼배열객체생성
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(btnName[i]);
		}

		// 패널배열객체생성
		for (int i = 0; i < p.length; i++) { 
			p[i] = new Panel();
			if(i>=4 && i<=7) {
				p[i].setLayout(new GridLayout(1,4,5,5));
			}
		}
		// 패널 레이아웃
		p[0].setBackground(new Color(209,209,209));
		p[0].setLayout(new GridLayout(7,1,5,5));
		p[3].setLayout(new GridLayout(1,2,5,5));


		// 라벨 레이아웃
		inL.setBackground(new Color(204,220,253));
		inL.setPreferredSize(new Dimension(280,35));
		inL.setAlignment(Label.RIGHT);
		inL.setFont(new Font("고딕체",Font.BOLD, 16));
		outL.setBackground(new Color(204,220,253));
		outL.setPreferredSize(new Dimension(280,35));
		outL.setFont(new Font("고딕체",Font.BOLD, 26));
		outL.setAlignment(Label.RIGHT);
		
		// 작은패널 <- 버튼/라벨
		p[1].add(inL);
		p[2].add(outL);
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
		this.setResizable(false); // 윈도우 크기 고정
		
		// event
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(this);
		}
	}
	
	// 계산
	public void calc() {
		if(op==-100) {			
			result = Double.parseDouble(outBuf.toString());
		}
		else {
			if (op=='+') {
				result += Double.parseDouble(outBuf.toString()); 
			} else if (op=='-') {
				result -= Double.parseDouble(outBuf.toString()); 
			} else if (op=='*') {
				result *= Double.parseDouble(outBuf.toString()); 
			} else if (op=='/') {
				result /= Double.parseDouble(outBuf.toString()); 
			} else if(op=='=') {
				inBuf.delete(0, inBuf.length());
				inL.setText("");
				outBuf.delete(0, outBuf.length());
				outBuf.append(df.format(result));
				outL.setText(outBuf.toString());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 숫자
		if(e.getActionCommand()=="1" ||
		   e.getActionCommand()=="2" ||
		   e.getActionCommand()=="3" ||
		   e.getActionCommand()=="4" ||
		   e.getActionCommand()=="5" ||
		   e.getActionCommand()=="6" ||
		   e.getActionCommand()=="7" ||
		   e.getActionCommand()=="8" ||
		   e.getActionCommand()=="9" ||
		   e.getActionCommand()=="0") {
			
			if(outBuf.toString().equals("0")) { 
				outBuf.delete(0, outBuf.length()); 
			}
			outBuf.append(e.getActionCommand());
			outL.setText(outBuf.toString());
		} 
		// BckSpace
		else if(e.getActionCommand()=="BackSpace") { 
			if(outBuf.length()==1) {
				outBuf.delete(0, 1);
				outBuf.append("0");
			}
			else {
				outBuf.delete(outBuf.length()-1, outBuf.length());
			}
			outL.setText(outBuf.toString());
		}
		// C
		else if(e.getActionCommand()=="C") { 
			inBuf.delete(0, inBuf.length());
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			inL.setText("");
			outL.setText(outBuf.toString());
			result = 0;
			op = -100;
		}
		// .
		else if(e.getActionCommand()==".") { 
			if(outBuf.indexOf(".")==-1){
				outBuf.append(".");
				outL.setText(outBuf.toString());
			}
		}
		// +
		else if(e.getActionCommand()=="+") { 
			calc();// 계산
			op = '+';
			inBuf.append(outBuf+"+");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			outL.setText(df.format(result));
			inL.setText(inBuf.toString());
			
		}
		// -
		else if(e.getActionCommand()=="-") { 
			calc();// 계산
			op = '-';
			inBuf.append(outBuf+"-");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			outL.setText(df.format(result));
			inL.setText(inBuf.toString());
	
		}
		// *
		else if(e.getActionCommand()=="*") { 
			calc();// 계산
			op = '*';
			inBuf.append(outBuf+"*");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			outL.setText(df.format(result));
			inL.setText(inBuf.toString());
		}
		// /
		else if(e.getActionCommand()=="/") { 
			calc();// 계산
			op = '/';
			inBuf.append(outBuf+"/");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			outL.setText(df.format(result));
			inL.setText(inBuf.toString());
		}
		// =
		else if(e.getActionCommand()=="=") { 
			calc();
			op = '=';
			calc();	
		}
	}

	// main
	public static void main(String[] args) {
		new Calculator().init();
	}
}