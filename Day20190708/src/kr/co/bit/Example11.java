package kr.co.bit;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Example11 {
	private static List<Student> list = Arrays.asList(
				new Student("ȫ�浿",80,92),
				new Student("���",90,75)
			);
	
	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.print(func.apply(student)+" "); // 
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.print(func.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л��̸�]");
		printString(t->t.getName()); //�������: t->t.getName()
		
		System.out.println("[��������]");
		printInt(t->t.getEng());
		
		System.out.println("[��������]");
		printInt(t->t.getMath());
	}
}

// apply��� �޼ҵ尡 �� ������ �𸣰����� �� ������� ����� �ҰŴ�
// �Լ��� �ִ� ���ڰ��� ������ �ѱ�
// ��������X
// t�� ��� ���������� �ʾҴµ� Student��ü���� �˾ҳĸ� <>�ȿ� Student�� �־����ϱ�
// �������� Student�ȿ� �ִ� �޼ҵ���� �����