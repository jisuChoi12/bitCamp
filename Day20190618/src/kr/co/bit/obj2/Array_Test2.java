package kr.co.bit.obj2;

public class Array_Test2 {
	public static void main(String[] args) {
		//�迭����
		int arrayNum[];
		String names[];
		//�迭��ü����
		arrayNum = new int[3];
		names = new String[3];
		//�ʱ�ȭ
		arrayNum[0]=1;
		arrayNum[1]=2;
		arrayNum[2]=3;
		names[0]="ȫ�浿";
		names[1]="����ġ";
		names[2]="������";
		//�� ���
		for(int i=0; i<3; i++) {
			System.out.println("arrayNum["+i+"]="+arrayNum[i]);
			System.out.println("names["+i+"]="+names[i]);
		}
	}	
}

