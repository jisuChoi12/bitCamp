package kr.co.bit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //elementŸ���� �޼ҵ忡�� ������ �� �ְ� ����
@Retention(RetentionPolicy.RUNTIME) //�� ������̼��� ��Ÿ�ӱ��� �������ִ�
public @interface MyAnnotation1 {
//	String elemName1();
	int elemName2() default 5;
	String value(); // value��� �̸��� ���� MyAnnotation�� �� �� �ٷ� �Է°����� ����
	
	// ����Ʈ ���� �־��ָ� ���߿� �־����� �ȳ����� ���ð���
	// �ʱⰪ�� ����������
}
