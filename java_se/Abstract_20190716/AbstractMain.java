class AbstractMain extends AbstractTest{
	@Override
	public void setName(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		AbstractTest aa = new AbstractMain();
		aa.setName("aaa"); // AbstractMain의 setName() 호출 <- 오버라이드니까
		System.out.println("이름 : "+aa.getName());
	}
}


 