import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

class PersonMain {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PersonDTO dto = new PersonDTO("aaa",25,185.3);	

		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result02.txt")); // IO
		//oos.writeObject(dto);
		//oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result02.txt"));
		// personDTO     (PersonDTO)Object ���� ����ȯ downCasting
		PersonDTO dto1 = (PersonDTO)ois.readObject();
		System.out.println("�̸�: "+dto1.getName());
		System.out.println("����: "+dto1.getAge());
		System.out.println("Ű: "+dto1.getHeight());
		ois.close();
		
	}
}
