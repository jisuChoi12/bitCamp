package kr.co.bit.obj;
//�⺻Ŭ����
public class China {
	protected int jajang; //��������
	protected int jjam;
	protected int tang;
	
	public China() { // �⺻ ������
	}
	public China(int jajang, int jjam, int tang) { // �Ű������� �ִ� ������
		this.jajang = jajang;
		this.jjam = jjam;
		this.tang = tang;
	}
	public int getJajang() { //getter ���� �ҷ����� ���� �Լ�
		return jajang;
	}
	public void setJajang(int jajang) { //setter ���� �Է��ϱ� ���� �Լ�
		this.jajang = jajang;
	}
	public int getJjam() {
		return jjam;
	}
	public void setJjam(int jjam) {
		this.jjam = jjam;
	}
	public int getTang() {
		return tang;
	}
	public void setTang(int tang) {
		this.tang = tang;
	}
	@Override
	public String toString() {
		return "China [�����=" + jajang + ", «��=" + jjam + ", ������=" + tang + "]";
	}
}
