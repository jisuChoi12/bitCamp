package kr.co.bit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //element타입을 메소드에만 저장할 수 있게 제한
@Retention(RetentionPolicy.RUNTIME) //이 어노테이션은 런타임까지 끌고갈수있다
public @interface MyAnnotation1 {
//	String elemName1();
	int elemName2() default 5;
	String value(); // value라는 이름을 쓰면 MyAnnotation을 씋 때 바로 입력값쓰기 가능
	
	// 디폴트 값을 넣어주면 나중에 넣어줄지 안넣을지 선택가능
	// 초기값은 정해져있음
}
