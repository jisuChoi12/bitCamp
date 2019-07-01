package kr.co.bit.obj;

import java.util.Scanner;

public class AnonynousInnerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CommandProcess cp = new CommandProcess();
		// class Anonymous extends Object implements Command
		// Anonymous anonymous = new ListCommand();
		// anonymous.execute();
		
		System.out.println("1.글쓰기 2.목록보기");
		int protocol = input.nextInt();
		if(protocol==1) {
			cp.process(new Command() { // Anonymous inner class 
				@Override
				public void execute() {
					System.out.println("글을 새로 작성한다.");
				}
			});			
		}else if(protocol==2) {
			cp.process(new Command() { //무명클래스
				@Override
				public void execute() {
					System.out.println("전체목록을 보여준다.");
				}
			});			
		}
	}
}

//원래대로라면 인터페이스 앞에는 new 연산자를 사용할 수 없다
//상속과 구현을 모두 컴파일러가 실행 Anonymous...
//한번만 사용하고 버리는 용도