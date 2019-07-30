import java.io.Serializable;

class ScoreDTO implements Serializable {
//class ScoreDTO implements Serializable, Comparable<ScoreDTO>{
	private String hakbun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	public ScoreDTO(String hakbun,String name,int kor,int eng,int math){
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getHakbun(){
		return hakbun;
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
	
	public int getTot() {
		return tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void calc() {
		tot = kor+eng+math;
		avg = tot/3.0;
	}

	@Override
	public String toString() {
		return String.format("%6s,%6s,%5d,%5d,%5d,%5d,%9.3f",hakbun,name,kor,eng,math,tot,avg);
	}
}

//	@Override
//	public int compareTo(ScoreDTO o) {
//		if(this.tot<o.tot) { return 1; }
//		else if(this.tot>o.tot) { return -1; }
//		return 0;
//	}


// %s 문자열
// %c 문자
// %d 정수
// %f 실수