package kr.co.bit;

public class Jazzang {
	private String sangpumName;
	private int sangpumDan;
	private int sangpumSu;
	private int sangpunMoney;
	
		public Jazzang(String sangpumName, int sangpumDan, int sangpumSu, int sangpunMoney) {
			super();
			this.sangpumName = sangpumName;
			this.sangpumDan = sangpumDan;
			this.sangpumSu = sangpumSu;
			this.sangpunMoney = sangpunMoney;
		}
		public Jazzang() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getSangpumName() {
			return sangpumName;
		}
		public void setSangpumName(String sangpumName) {
			this.sangpumName = sangpumName;
		}
		public int getSangpumDan() {
			return sangpumDan;
		}
		public void setSangpumDan(int sangpumDan) {
			this.sangpumDan = sangpumDan;
		}
		public int getSangpumSu() {
			return sangpumSu;
		}
		public void setSangpumSu(int sangpumSu) {
			this.sangpumSu = sangpumSu;
		}
		public int getSangpunMoney() {
			return sangpunMoney;
		}
		public void setSangpunMoney(int sangpunMoney) {
			this.sangpunMoney = sangpunMoney;
		}
		@Override
		public String toString() {
			return "Jazzang [sangpumName=" + sangpumName + ", sangpumDan=" + sangpumDan + ", sangpumSu=" + sangpumSu
					+ ", sangpunMoney=" + sangpunMoney + "]";
		}
}
