package kr.co.bit;

public class While_Test1 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		// ���ǿ� ���ؼ��� �ݺ��ɶ��� ���ѷ�Ʈ(for���� ��� �ݺ����� ����������)
		while(i<=50) {
			sum+=i;
			i++;
		}
		System.out.println("1���� 50������ ��="+sum);
	}
}
