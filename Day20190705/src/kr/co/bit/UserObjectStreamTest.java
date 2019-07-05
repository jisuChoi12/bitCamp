package kr.co.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserObjectStreamTest {

	public static void main(String[] args) {
		User beforeUser = new User("aaa", "aaa", "도곡동", 22, "AAA");
		User afterUser = null; //부모타입의 포인터변수 (나중에 캐스팅을 위해)
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			//파일연결(쓰기,생성)
			fos = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\userInfo.ser");
			//oos에 fos 장착
			oos = new ObjectOutputStream(fos);
			//객체를 쓰기위한 함수호출, 초기화한 객체를 통채로 넣는다 
			oos.writeObject(beforeUser);
			
			//파일연결(읽기)
			fis = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\userInfo.ser");
			//ois에 fis 장착
			ois = new ObjectInputStream(fis); //파일 안에는 beforeUser객체가 들어있다 그 객체를 ois에 집어넣기
			//
			afterUser = (User)ois.readObject(); // ois에 있는 객체를 읽고 User타입으로 형변환해서(자식에서 부모타입으로) afterUser에 집어넣기
			System.out.println(afterUser);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

