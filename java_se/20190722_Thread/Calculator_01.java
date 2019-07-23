import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Calculator extends Frame implements ActionListener {
	private Label inL, outL;
	private Button[] btm;
	private StringBuffer inBuf, outBuf;
	private double result;
	private int op;
	private NumberFormat nf = new DecimalFormat("#,###.#####");
	
	public Calculator(){
		inL = new Label("",Label.RIGHT);
		outL = new Label("0",Label.RIGHT);
		inL.setFont(new Font("고딕체", Font.BOLD, 16));
		outL.setFont(new Font("고딕체", Font.BOLD, 26));
			
		inL.setBackground(new Color(220,220,255));
		outL.setBackground(new Color(220,220,255));
			
		btm = new Button[18];
		String[] bt = {".","0","=","+",
		               "1","2","3","-",
		               "4","5","6","*",
		               "7","8","9","/",
		               "BackSpace","C"};
		for(int i=0; i<btm.length; i++){
			btm[i] = new Button(bt[i]);
		}

		inBuf = new StringBuffer();
		outBuf = new StringBuffer("0");
		
		Panel pa1 = new Panel();
		pa1.setLayout(new GridLayout(1,2,5,5)); //"BackSpace","C"
		pa1.add(btm[16]);
		pa1.add(btm[17]);

		Panel pa2 = new Panel(new GridLayout(1, 4, 5, 5));
		pa2.add(btm[12]);
		pa2.add(btm[13]);
		pa2.add(btm[14]);
		pa2.add(btm[15]);

		Panel pa3 = new Panel(new GridLayout(1, 4, 5, 5));
		pa3.add(btm[8]);
		pa3.add(btm[9]);
		pa3.add(btm[10]);
		pa3.add(btm[11]);

		Panel pa4 = new Panel(new GridLayout(1, 4, 5, 5));
		pa4.add(btm[4]);
		pa4.add(btm[5]);
		pa4.add(btm[6]);
		pa4.add(btm[7]);

		Panel pa5 = new Panel(new GridLayout(1, 4, 5, 5));
		pa5.add(btm[0]);
		pa5.add(btm[1]);
		pa5.add(btm[2]);
		pa5.add(btm[3]);
		

		Panel patotal1 = new Panel(new GridLayout(7, 1, 5, 5));
		patotal1.add(inL);
		patotal1.add(outL);
		patotal1.add(pa1);
		patotal1.add(pa2);
		patotal1.add(pa3);
		patotal1.add(pa4);
		patotal1.add(pa5);
		
		add("Center",patotal1);
		
		setResizable(false);
		setBounds(100,80,400,400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				System.exit(0);     
			}      
		});

		//이벤트
		for(int i=0; i<btm.length; i++){
			btm[i].addActionListener(this);
		}

	}//생성자

	@Override
	public void actionPerformed(ActionEvent e){
		//숫자 버튼
		if(e.getActionCommand()=="1" ||
		   e.getActionCommand()=="2" ||
		   e.getActionCommand()=="3" ||
		   e.getActionCommand()=="4" ||
		   e.getActionCommand()=="5" ||
		   e.getActionCommand()=="6" ||
		   e.getActionCommand()=="7" ||
		   e.getActionCommand()=="8" ||
		   e.getActionCommand()=="9" ||
		   e.getActionCommand()=="0"){
			
			if((outBuf+"").equals("0")) outBuf.delete(0, outBuf.length());
			outBuf.append(e.getActionCommand());
			outL.setText(outBuf+"");
		
		}else if(e.getActionCommand()=="BackSpace"){
			if(outBuf.length()==1){//1개
				outBuf.delete(0,1);
				outBuf.append("0");
			}else{
				outBuf.delete(outBuf.length()-1, outBuf.length());
			}

			outL.setText(outBuf+"");

		}else if(e.getActionCommand()=="C"){
			inBuf.delete(0, inBuf.length());
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");

			inL.setText("");
			outL.setText("0");
			result=0;
			op=0;
		
		}else if(e.getActionCommand()=="."){
			if(outBuf.indexOf(".")==-1) outBuf.append(".");
			outL.setText(outBuf+"");
		
		}else if(e.getActionCommand()=="+"){
			calc();//계산
			
			inBuf.append(outBuf+"+");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			op = '+';
			
			outL.setText(nf.format(result));
			inL.setText(inBuf+"");		

		}else if(e.getActionCommand()=="-"){
			calc();//계산
			
			inBuf.append(outBuf+"-");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			op = '-';
			
			outL.setText(nf.format(result));
			inL.setText(inBuf+"");

		}else if(e.getActionCommand()=="*"){
			calc();//계산
			
			inBuf.append(outBuf+"*");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			op = '*';
			
			outL.setText(nf.format(result));
			inL.setText(inBuf+"");

		}else if(e.getActionCommand()=="/"){
			calc();//계산
			
			inBuf.append(outBuf+"/");
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");
			op = '/';
			
			outL.setText(nf.format(result));
			inL.setText(inBuf+"");

		}else if(e.getActionCommand()=="="){
			calc();

			inBuf.delete(0, inBuf.length());
			outBuf.delete(0, outBuf.length());
			outBuf.append("0");

			inL.setText("");
			outL.setText(nf.format(result));
			result = op = 0;
		}
	}

	public void calc(){
		if(op==0) result = Double.parseDouble(outBuf+"");
		else if(op=='+') result = result + Double.parseDouble(outBuf+"");
		else if(op=='-') result = result - Double.parseDouble(outBuf+"");
		else if(op=='*') result = result * Double.parseDouble(outBuf+"");
		else if(op=='/') result = result / Double.parseDouble(outBuf+"");
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
