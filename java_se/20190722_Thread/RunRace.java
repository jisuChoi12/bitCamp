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

class RunRace extends Frame implements ActionListener { // Frame: BorderLayout 기본
	private int count; // 말 마리수
	private Button btn; // 출발버튼
	private Panel p1;
	private Panel p2; // Panel: FlowLayout 기본
	private Racer[] racer;
	

	public RunRace(String[] args){
		count = Integer.parseInt(args[0]);
		btn = new Button("출발");
		p1 = new Panel(new GridLayout(count,1));
		p2 = new Panel(new FlowLayout(FlowLayout.RIGHT)); 
		racer = new Racer[count];
		for(int i=0; i<racer.length; i++){
			racer[i] = new Racer(args[i+1]); // canvas 생성
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
		btn.setEnabled(false); // 버튼 비활성화
		Thread[] t = new Thread[count]; // 스레드 배열 생성
		for(int i=0; i<t.length; i++){
			t[i] = new Thread(racer[i]); // 스레드 생성
			t[i].setPriority((int)(Math.random()*10)+1);
			t[i].start(); // 스레드 시작
		}
	}
	
	public static void main(String[] args) { // 외부에서 main을 호출할때 넘어오는 args
		if(args.length<2){ 
			System.out.println("Usage : java RunRace count name1, ...");
			System.exit(0);
		}

		if(Integer.parseInt(args[0])!=args.length-1){
			System.out.println("말 마리수와 이름의 개수가 맞지 않습니다.");
			System.exit(0);
		}

		RunRace rr = new RunRace(args);
	}
}
