import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;

class WindowTest extends Frame{ // Java가 제공하는 Frame class 상속 -> Window is a Frame
	
	public WindowTest(){ // 기본생성자
		super("내가 만든 윈도우"); // Frame의 생성자로 타이틀 정하기
		//setTitle("내가 만든 윈도우"); // setTitle()로 타이틀 정하기

		//System.out.println("도형 만들기"); // 콘솔창에 출력

		setBackground(new Color(168,204,240)); // Color class의 생성자 함수를 이용해서 setBackground() 
		//setBackground(Color.MAGENTA); // setBackGround()는 고정된 색만 사용가능

		setForeground(new Color(1,1,1)); // 글자색

		setBounds(750,150,300,400); // java.awt.Window 에 있는 setBounds(); 
		//setSize(300,400); // java.awt.Window 에 있는 setSize()
		
		setVisible(true); // java.awt.Window 에 있는 setVisible() 창 보이기 -> call back method 호출
	
	}
	
	@Override
	public void paint(Graphics g){ // 구현 (call back method)
		g.drawString("도형 만들기",120,100); // 윈도우창에 출력
		g.drawLine(100,150,200,300);
		g.drawRect(50,180,50,50);
		g.drawOval(60,200,60,60);
	}

	public static void main(String[] args) {
		WindowTest wt = new WindowTest();
	}
}

// 어떤 일정한 시점이 되면 JVM(운영체제)이 호출한다 - Call Back Method ex) void main() / run()