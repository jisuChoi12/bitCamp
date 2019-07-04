package kr.co.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		FileInputStream fin3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		
		try {
			fin1 = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\test1.TXT");
			fin2 = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\test2.TXT");
			fin3 = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\test3.TXT");
				
//			�迭Ÿ������ �ѹ��� 
			Vector v = new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			Enumeration fins = v.elements();
			si1 = new SequenceInputStream(fins);
			int var_readbyte = -1;
			while((var_readbyte=si1.read())!=-1) {
				System.out.print((char)var_readbyte);
			}
			System.out.println();
			
//			�ϳ��� �ϳ���
			fin1 = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\test1.TXT");
			fin2 = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\test2.TXT");
			si2 = new SequenceInputStream(fin1,fin2);
			var_readbyte = -1;
			while((var_readbyte=si2.read())!=-1) {
				System.out.print((char)var_readbyte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				si1.close();
				si2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// SequenceInputStream�� �Է� ��Ʈ�� �������� �ϳ��� �Է½�Ʈ������ �����ؼ� �����͸� �о���� �� �ִ� �Է� ��Ʈ���̴�.