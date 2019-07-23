import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class RunRace extends Frame implements ActionListener { // Frame: BorderLayout �⺻
	private int count; // �� ������
	private Button btn; // ��߹�ư
	private Panel p1;
	private Panel p2; // Panel: FlowLayout �⺻
	private Racer[] racer;
	

	public RunRace(String[] args){
		count = Integer.parseInt(args[0]);
		btn = new Button("���");
		p1 = new Panel(new GridLayout(count,1));
		p2 = new Panel(new FlowLayout(FlowLayout.RIGHT)); 
		racer = new Racer[count];
		for(int i=0; i<racer.length; i++){
			racer[i] = new Racer(args[i+1]); // canvas ����
			p1.add(racer[i]);
		}
		
		
		p2.add(btn);
		add("South", p2);
		add("Center", p1);

		setBounds(200,150,600,500);
		setVisible(true);
		setResizable(false);

		// event
		addWindowListener(new WindowAdapter(){ 
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		btn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false); // ��ư ��Ȱ��ȭ
		Thread[] t = new Thread[count]; // ������ �迭 ����
		for(int i=0; i<t.length; i++){
			t[i] = new Thread(racer[i]); // ������ ����
			t[i].setPriority((int)(Math.random()*10)+1);
			t[i].start(); // ������ ����
		}
	}
	
	public static void main(String[] args) { // �ܺο��� main�� ȣ���Ҷ� �Ѿ���� args
		if(args.length<2){ 
			System.out.println("Usage : java RunRace count name1, ...");
			System.exit(0);
		}

		if(Integer.parseInt(args[0])!=args.length-1){
			System.out.println("�� �������� �̸��� ������ ���� �ʽ��ϴ�.");
			System.exit(0);
		}

		RunRace rr = new RunRace(args);
	}
}
