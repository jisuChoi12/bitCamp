package kr.co.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserObjectStreamTest {

	public static void main(String[] args) {
		User beforeUser = new User("aaa", "aaa", "���", 22, "AAA");
		User afterUser = null; //�θ�Ÿ���� �����ͺ��� (���߿� ĳ������ ����)
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			//���Ͽ���(����,����)
			fos = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\userInfo.ser");
			//oos�� fos ����
			oos = new ObjectOutputStream(fos);
			//��ü�� �������� �Լ�ȣ��, �ʱ�ȭ�� ��ü�� ��ä�� �ִ´� 
			oos.writeObject(beforeUser);
			
			//���Ͽ���(�б�)
			fis = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\userInfo.ser");
			//ois�� fis ����
			ois = new ObjectInputStream(fis); //���� �ȿ��� beforeUser��ü�� ����ִ� �� ��ü�� ois�� ����ֱ�
			//
			afterUser = (User)ois.readObject(); // ois�� �ִ� ��ü�� �а� UserŸ������ ����ȯ�ؼ�(�ڽĿ��� �θ�Ÿ������) afterUser�� ����ֱ�
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

