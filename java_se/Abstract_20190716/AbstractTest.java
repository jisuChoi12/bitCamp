abstract class AbstractTest { // 추상 클래스
	protected String name;

	//public void setName(String name){ this.name = name; }
	public abstract void setName(String name); // 추상메소드

	public String getName(){ return name; }
}
