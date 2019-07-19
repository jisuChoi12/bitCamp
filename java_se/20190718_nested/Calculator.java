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
import java.awt.event.WindowAdapter;

class Calculator extends Frame implements ActionListener{
	private Button[] btn;
	private Panel[] p;
	private Label upL, downL;
	private String[] btnName;

	private StringBuffer sb;
	private int dot;

	public void init(){	
		upL = new Label(""); // 결과
		downL = new Label(""); // 입력 숫자/부호
		btn = new Button[18];
		p = new Panel[8];
		btnName = new String[]{"BackSpace","C",
								"7","8","9","/",
								"4","5","6","*",
								"1","2","3","-",
								".","0","=","+"};
		
		sb = new StringBuffer();
		
		sb.append("0");
		downL.setText(sb.toString());
		
		dot = -1;
		
		this.setResizable(false); // 윈도우 크기 고정

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
//		p[4].setLayout(new GridLayout(1,4,5,5)); // 자동으로 사이즈가 맞춰짐
//		p[5].setLayout(new GridLayout(1,4,5,5));
//		p[6].setLayout(new GridLayout(1,4,5,5));
//		p[7].setLayout(new GridLayout(1,4,5,5));

		// 라벨 레이아웃
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
	public void isZeroFirst() {
		if(sb.length()==1 && sb.charAt(0)=='0') { // 유일한 숫자가 0이면 (계산기 기본상태)
			sb.deleteCharAt(0);
		}
	}
	
	public boolean isSimbolFirst() {
		boolean sim = true;
		if(sb.length()==1 && sb.charAt(0)=='0' || sb.length()==0) { // 유일한 숫자가 0이거나 아예 입력되지 않았으면
			sim = false;
		}
		return sim;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn[0]) { // BackSpace
			if(sb.length()!=0) {
				sb.deleteCharAt(sb.length()-1);
				if(sb.length()==0) {
					sb.append("0");
				}
			}
		} else if (e.getSource() == btn[1]) { // C
			sb.delete(0, sb.length());
			sb.append("0");
			upL.setText("");
		} else if (e.getSource() == btn[2]) { // 7
			isZeroFirst();
			sb.append("7");
		} else if (e.getSource() == btn[3]) { // 8
			isZeroFirst();
			sb.append("8");
		} else if (e.getSource() == btn[4]) { // 9
			isZeroFirst();
			sb.append("9");
		} else if (e.getSource() == btn[5]) { // /
			if (isSimbolFirst()) {
				sb.append("/");
				String strup = upL.getText();
				strup += sb.toString();
				upL.setText(strup);
				sb.delete(0, sb.length());				
			}
		} else if (e.getSource() == btn[6]) { // 4
			isZeroFirst();
			sb.append("4");
		} else if (e.getSource() == btn[7]) { // 5
			isZeroFirst();
			sb.append("5");
		} else if (e.getSource() == btn[8]) { // 6
			isZeroFirst();
			sb.append("6");
		} else if (e.getSource() == btn[9]) { // *
			if (isSimbolFirst()) {
				sb.append("*");
				String strup = upL.getText();
				strup += sb.toString();
				upL.setText(strup);
				sb.delete(0, sb.length());				
			}
		} else if (e.getSource() == btn[10]) { // 1
			isZeroFirst();
			sb.append("1");
		} else if (e.getSource() == btn[11]) { // 2
			isZeroFirst();
			sb.append("2");
		} else if (e.getSource() == btn[12]) { // 3
			isZeroFirst();
			sb.append("3");
		} else if (e.getSource() == btn[13]) { // -
			if (isSimbolFirst()) {
				sb.append("-");
				String strup = upL.getText();
				strup += sb.toString();
				upL.setText(strup);
				sb.delete(0, sb.length());				
			}
		} else if (e.getSource() == btn[14]) { // .
			dot = sb.indexOf(".");
			if(dot==-1 && sb.length()!=0) {
				sb.append(".");
			}
		} else if (e.getSource() == btn[15]) { // 0
			isZeroFirst();
			sb.append("0");
		} else if (e.getSource() == btn[16]) { // =
			String strup = upL.getText();
			int divi = strup.indexOf('/');
			int addi = strup.indexOf('+');
			int muli = strup.indexOf('*');
			int subi = strup.indexOf('-');
			
		} else if (e.getSource() == btn[17]) { // +
			if(isSimbolFirst()) {
				sb.append("+");
				String strup = upL.getText();
				strup += sb.toString();
				upL.setText(strup);
				sb.delete(0, sb.length());
			}
		}
		String str = sb.toString();
		downL.setText(str);
	}

	// main
	public static void main(String[] args) {
		new Calculator().init();
	}
}