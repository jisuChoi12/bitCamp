class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();	�߻�޼ҵ� ������ �߻�Ŭ������ new �ȵ�
		
		AbstractTest at = new AbstractTest() { // �͸� inner Ŭ���� new
			@Override
			public void setName(String name) { // �޼ҵ��� ������ (�޼ҵ��� �����θ� ���� �� �ִ°� Ŭ���� ��)
				this.name = name;
			}
		}; 

		InterA ia = new InterA() { // �͸� inner Ŭ���� new
			@Override
			public void aa(){} 
			public void bb(){}		
		};

		AbstractExam ae = new AbstractExam(){
			// �ݵ�� �������̵� �� �ʿ�� ���� ���ϴ´�� ����
			//@Override
			//public void cc(){}
			//public void dd(){}
		};
	}
}

// AbstractMain$1.class -> �͸��̳�Ŭ����
// AbstractMain$2.class