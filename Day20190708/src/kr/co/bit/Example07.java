package kr.co.bit;

import java.lang.reflect.Constructor;

public class Example07 {

	// �ν��Ͻ� Ŭ����
	class InnerClass1{
		int field1; //�ʵ�
		public InnerClass1() {} //������
		void method1() {} //�Ϲݸ޼ҵ�
//		static int field2; //�ν��Ͻ� Ŭ���� �ȿ��� ����ƽ �ʵ�X
//		static void method2() {} //�ν��Ͻ� Ŭ���� �ȿ��� ����ƽ �޼ҵ�X
	}
	// ����ƽ Ŭ����
	static class InnerClass2{
		int field1; //�ʵ�
		public InnerClass2() {} //������
		void method1() {} //�Ϲݸ޼ҵ�
		static int field2; //����ƽ �ʵ�
		static void method2() {} //����ƽ �޼ҵ�
	}
	
	public void method1() {
		// ���� Ŭ����
		class InnerClass3{
			int field1; //�ʵ�
			public InnerClass3() {} //������
			void method1() {} //�Ϲݸ޼ҵ�
//			static int field2; //���� Ŭ���� �ȿ��� ����ƽ �ʵ�X
//			static void method2() {} //���� Ŭ���� �ȿ��� ����ƽ �޼ҵ�X
		}
		InnerClass3 ic = new InnerClass3();
	}
	
	public void method2() {
//		InnerClass3 ic = new InnerClass3(); ����Ŭ������ ���� �ȿ�����
	}
	
	public static void main(String[] args) {
		Example07 ex = new Example07();
		new Example07(); 
		
//		�͸�Ŭ����
		Interface1 inter1 = new Interface1() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
			}
		};
	}
}
