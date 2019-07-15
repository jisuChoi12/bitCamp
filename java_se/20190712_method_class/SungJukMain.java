/*
�ʵ�: name, kor, eng, math, tot, avg
�Է�: setData(name, kor, eng, math)
���: calc()
���: getName(), getKor(), getEng(), getMath(), getTot(), getAvg()

[������]
�̸�		����  ����  ����  ����	���
aaa		95	 91	 100  xxx	xx.xx
*/

import java.util.Scanner;

class SungJuk{
	// �Ӽ�(������)
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	// ���(�޼ҵ�)
	SungJuk(){
		name = null;
		kor = 0;
		eng = 0;
		math = 0;
		tot = 0;
		avg = 0;
	}
	public void setData(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public int getTot(){
		return tot;
	}
	public double getAvg(){
		return avg;
	}
	public void calc(){
		tot = kor+eng+math;
		avg = (double)tot/3;
	}

	//������̼�
	@Override
	public String toString(){
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f",avg);
	}
}

//----------------------------------------------------------------------
class SungJukMain {
	public static void main(String[] args) {

		SungJuk[] sJ = new SungJuk[3]; // ��ü�迭

		for(int i=0; i<sJ.length; i++){
			sJ[i] = new SungJuk();
		}

		sJ[0].setData("aaa",95,92,100);
		sJ[1].setData("bbb",85,82,63);
		sJ[2].setData("ccc",75,89,90);
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(SungJuk data : sJ){
			data.calc();
			System.out.println(data);
		}
	}
}

// ���� %d
// �Ǽ� %f
// ���� %c
// ���ڿ� %s