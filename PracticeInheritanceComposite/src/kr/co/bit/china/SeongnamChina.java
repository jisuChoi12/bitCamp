package kr.co.bit.china;

public class SeongnamChina extends China {
	protected int samsun;

	public SeongnamChina() { //�θ�Ŭ������ ������ �Լ� ����
		super();
	}
	public SeongnamChina(int jajang, int jjam, int tang, int samsun) {
		super(jajang, jjam, tang); //�θ�Ŭ������ ������ �Լ� ����
		this.samsun = samsun; //�ش�Ŭ������ ���� �ʱ�
	}
	public int getSamsun() {
		return samsun;
	}
	public void setSamsun(int samsun) {
		this.samsun = samsun;
	}
	@Override
	public String toString() {
		return super.toString()+" SeongnamChina [�Ｑ«��=" + samsun + "]";
	}
}
