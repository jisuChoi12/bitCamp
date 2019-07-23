class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();	추상메소드 때문에 추상클래스는 new 안됨
		
		AbstractTest at = new AbstractTest() { // 익명 inner 클래스 new
			@Override
			public void setName(String name) { // 메소드의 구현부 (메소드의 구현부를 가질 수 있는건 클래스 뿐)
				this.name = name;
			}
		}; 

		InterA ia = new InterA() { // 익명 inner 클래스 new
			@Override
			public void aa(){} 
			public void bb(){}		
		};

		AbstractExam ae = new AbstractExam(){
			// 반드시 오버라이드 할 필요는 없음 원하는대로 구현
			//@Override
			//public void cc(){}
			//public void dd(){}
		};
	}
}

// AbstractMain$1.class -> 익명이너클래스
// AbstractMain$2.class