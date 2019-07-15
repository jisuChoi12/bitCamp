package kr.co.bit;

import java.util.Scanner;

class Exam{
	private String name;
	private String dap;
	private int person;
	private char[] ox;
	private int score;
	public static final String JUNGDAP = "11111";

	public Exam(){
		ox = new char[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("����� �Է� : ");
		dap = scan.next();
	}

	public void comp(){
		score = 0;
		for(int i=0; i<dap.length(); i++){
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
		Scanner scan = new Scanner(System.in);
		System.out.println("�ο��� �Է� : ");
		int person = scan.nextInt();
		
		Exam[] exam = new Exam[person]; //��ü�迭
		String[] scr = new String[person];
		
		for (int i = 0; i < exam.length; i++) {
			scr[i]="";
			exam[i] = new Exam();
			exam[i].comp();
			
			for (int j = 0; j < exam[i].getOX().length; j++) {
				scr[i] += exam[i].getOX()[j]+"\t"; 
			}
			
		}

		System.out.println("�̸�\t1\t2\t3\t4\t5\t����");
		for (int j = 0; j < exam.length; j++) {			
			System.out.println(exam[j].getName()+"\t"+scr[j]+exam[j].getScore());
		}
	}
}

