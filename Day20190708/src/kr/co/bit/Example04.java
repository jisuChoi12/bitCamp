package kr.co.bit;

import java.lang.reflect.Method;

public class Example04 {

	public static void main(String[] args) {
//		Service 클래스로부터의 메서드 정보를 얻음
		Method[] dMethod = Service.class.getDeclaredMethods();
		for (Method method : dMethod) {
//			Annotation 객체 여부 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				각각의 메서드 안에 존재하는 PrintAnnotation 객체 얻기
				PrintAnnotation pa = method.getAnnotation(PrintAnnotation.class);
//				매서드 이름 출력
				System.out.println("["+method.getName()+"]");
//				구분선 출력
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
