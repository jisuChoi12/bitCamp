package kr.co.bit.Lotteria;

public class LotteriaProcess {
	public Lotteria[] lotteria;
	public LotteriaProcess() {
		lotteria = new Lotteria[5];
		lotteria[0]= new Lotteria("����Ƣ��", 5000, 1, 5000);
		lotteria[1]= new Lotteria("�ܹ���", 6000, 2, 12000);
		lotteria[2]= new Lotteria("�ݶ�", 4000, 3, 12000);
		lotteria[3]= new Lotteria("���̽�ũ��", 2000, 2, 4000);
		lotteria[4]= new Lotteria("ġ�ƽ", 2000, 1, 2000);
	}
	
	public boolean sangpumProcess(String sangpumName) {
		boolean searchResult = false;
		for(int i=0; i<lotteria.length; i++) {
			if(lotteria[i].getSangpumName().equals(sangpumName)) {
				sangpumDisp(lotteria[i]);
				searchResult=true;
			}
		}return searchResult;
	}
	
	private void sangpumDisp(Lotteria lotteria) {
		System.out.println("��ǰ�̸�:"+lotteria.getSangpumName());
		System.out.println("��ǰ�ܰ�"+lotteria.getSangpumDan());
		System.out.println("��ǰ����"+lotteria.getSangpumSu());
		System.out.println("�Ǹűݾ�"+lotteria.getSangpumMoney());
	}
}
