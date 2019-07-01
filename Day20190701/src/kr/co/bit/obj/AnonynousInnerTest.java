package kr.co.bit.obj;

import java.util.Scanner;

public class AnonynousInnerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CommandProcess cp = new CommandProcess();
		// class Anonymous extends Object implements Command
		// Anonymous anonymous = new ListCommand();
		// anonymous.execute();
		
		System.out.println("1.�۾��� 2.��Ϻ���");
		int protocol = input.nextInt();
		if(protocol==1) {
			cp.process(new Command() { // Anonymous inner class 
				@Override
				public void execute() {
					System.out.println("���� ���� �ۼ��Ѵ�.");
				}
			});			
		}else if(protocol==2) {
			cp.process(new Command() { //����Ŭ����
				@Override
				public void execute() {
					System.out.println("��ü����� �����ش�.");
				}
			});			
		}
	}
}

//������ζ�� �������̽� �տ��� new �����ڸ� ����� �� ����
//��Ӱ� ������ ��� �����Ϸ��� ���� Anonymous...
//�ѹ��� ����ϰ� ������ �뵵