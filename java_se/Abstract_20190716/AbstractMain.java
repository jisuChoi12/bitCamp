class AbstractMain extends AbstractTest{
	@Override
	public void setName(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		AbstractTest aa = new AbstractMain();
		aa.setName("aaa"); // AbstractMain�� setName() ȣ�� <- �������̵�ϱ�
		System.out.println("�̸� : "+aa.getName());
	}
}


 