package kr.co.bit;

import java.lang.reflect.Method;

public class Example04 {

	public static void main(String[] args) {
//		Service Ŭ�����κ����� �޼��� ������ ����
		Method[] dMethod = Service.class.getDeclaredMethods();
		for (Method method : dMethod) {
//			Annotation ��ü ���� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				������ �޼��� �ȿ� �����ϴ� PrintAnnotation ��ü ���
				PrintAnnotation pa = method.getAnnotation(PrintAnnotation.class);
//				�ż��� �̸� ���
				System.out.println("["+method.getName()+"]");
//				���м� ���
				for(int i=0; i<pa.num(); i++) {
					System.out.print(pa.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}
	}
}
