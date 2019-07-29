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
		// personDTO     (PersonDTO)Object 강제 형변환 downCasting
		PersonDTO dto1 = (PersonDTO)ois.readObject();
		System.out.println("이름: "+dto1.getName());
		System.out.println("나이: "+dto1.getAge());
		System.out.println("키: "+dto1.getHeight());
		ois.close();
		
	}
}
