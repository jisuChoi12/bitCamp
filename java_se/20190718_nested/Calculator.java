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

	public void init(){	
		upL = new Label(""); // ��
		downL = new Label(""); // �Է� ����
		btn = new Button[18];
		p = new Panel[8];
		btnName = new String[]{"BackSpace","C","7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};
		
		this.setResizable(false); // ������ ũ�� ����

		// �гι迭��ü����
		for (int i = 0; i < p.length; i++) { 
			p[i] = new Panel(); 
		}
		
		// �г� ���̾ƿ�
		p[0].setBackground(new Color(209,209,209));
		p[0].setLayout(new GridLayout(7,1,5,5));
		//p[1].setLayout(new GridLayout(1,1,5,5));
		//p[2].setLayout(new GridLayout(1,1,5,5));
		p[3].setLayout(new GridLayout(1,2,5,5));
		p[4].setLayout(new GridLayout(1,4,5,5));
		p[5].setLayout(new GridLayout(1,4,5,5));
		p[6].setLayout(new GridLayout(1,4,5,5));
		p[7].setLayout(new GridLayout(1,4,5,5));

		// ��
		upL.setBackground(new Color(204,220,253));
		upL.setPreferredSize(new Dimension(280,35));
		downL.setBackground(new Color(204,220,253));
		downL.setPreferredSize(new Dimension(280,35));
		
		// ��ư�迭��ü����
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(btnName[i]);
		}
		
		// �����г� <- ��ư/��
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
		
		// ��ü�г�
		add(p[0]); 	
		
		// ��ü�г� <-�����г�
		for(int i = 1; i<=7; i++) 
			p[0].add(p[i]);
		
		// window
		setTitle("����");
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn[0]) {
			System.out.println("BackSpace");
		}
		else if(e.getSource()=="C") {
			
		}
		else if(e.getSource()=="7") {
			
		}
		else if(e.getSource()=="8") {
			
		}
		else if(e.getSource()=="9") {
			
		}
		else if(e.getSource()=="/") {
			
		}
		else if(e.getSource()=="4") {
			
		}
		else if(e.getSource()=="5") {
			
		}
		else if(e.getSource()=="6") {
			
		}
		else if(e.getSource()=="*") {
			
		}
		else if(e.getSource()=="1") {
			
		}
		else if(e.getSource()=="2") {
			
		}
		else if(e.getSource()=="3") {
			
		}
		else if(e.getSource()=="-") {
			
		}
		else if(e.getSource()==".") {
			
		}
		else if(e.getSource()=="0") {
			
		}
		else if(e.getSource()=="=") {
			
		}
		else if(e.getSource()=="+") {
			
		}	
	}
	
	// main
	public static void main(String[] args) {
		new Calculator().init();
	}

}