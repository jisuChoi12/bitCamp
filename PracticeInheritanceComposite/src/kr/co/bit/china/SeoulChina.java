package kr.co.bit.china;

public class SeoulChina extends China {
	protected int jaengban;

	public SeoulChina() {
		super();
	}
	public SeoulChina(int jajang, int jjam, int tang, int jaengban) {
		super(jajang, jjam, tang);
		this.jaengban = jaengban;
	}
	public int getJaengban() {
		return jaengban;
	}
	public void setJaengban(int jaengban) {
		this.jaengban = jaengban;
	}
	@Override
	public String toString() {
		return super.toString()+" SeoulChina [Àï¹ÝÂ¥Àå=" + jaengban + "]";
	}
}
