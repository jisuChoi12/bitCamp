/*
5������ ä���ϴ� ���α׷� (4������)
�ʵ� : name
	 dap 
	 ox[]
	 score
	 public static final JUNG = "11111";
�޼ҵ� : ������ - Scanner
	   comp() - �¾Ҵ�/Ŭ�ȴ�
	   getter()
[������]
�̸� �Է� : aaa (name)
����� �Է� : 11321 (dap)

�̸� : 1 2 3 4 5 ����
aaa  o o x x o  60
-----------------------

��ü�迭�̿�

�ο��� �Է� : 2

�̸� �Է�: aaa
����� �Է� : 11221
�̸� : 1 2 3 4 5 ����
aaa  o o x x o  60

�̸� �Է�: bbb
����� �Է� : 11111
�̸� : 1 2 3 4 5 ����
bbb  o o o o o  100

*/
import java.util.Scanner;

class Exam{
	private String name;
	private String dap;
	private int person;
	private char[] ox;
	private int score;
	public static final String JUNGDAP = "11111";

	public Exam(){ //������ �Լ�
		ox = new char[5]; 
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("����� �Է� : ");
		dap = scan.next();
	}

	public void comp(){
		score = 0; // ���� �ʱ�ȭ
		for(int i=0; i<dap.length(); i++){ // �� üũ
			if(dap.charAt(i)==JUNGDAP.charAt(i)){
				ox[i] = 'o'; 
				score += 20;
			}else{
				ox[i] = 'x';
			}
		}
	}

	public String getName(){
		return name;
	}

	public int getScore(){
		return score;
	}

	public char[] getOX(){
		return ox;
	}
}
//---------------------------------------------------------
class ExamMain {
	public static void main(String[] args) {
		String scr = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("�ο��� �Է� : ");
		int person = scan.nextInt();
		
		Exam[] exam = new Exam[person]; //��ü �迭 ����
		
		for (int i = 0; i < exam.length; i++) { //�迭 ���� ��ŭ �ݺ�
			scr="";
			exam[i] = new Exam(); // i��° ��ü �迭���� ��ü ����
			exam[i].comp(); 
			
			for (int j = 0; j < exam[i].getOX().length; j++) { // ������ ��ü�� �ִ� ox�迭�� o/x����� ��������
				scr += exam[i].getOX()[j]+"\t"; 
			}
			
		}

		System.out.println("�̸�\t1\t2\t3\t4\t5\t����");
		for (int j = 0; j < exam.length; j++) { // ������ ��ü���� ����� ��������
			System.out.println(exam[j].getName()+"\t"+scr+exam[j].getScore());
		}
	}
}