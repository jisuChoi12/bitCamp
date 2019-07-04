package kr.co.bit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class DataStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\dataFile.TXT");
			fis = new FileInputStream("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190704\\src\\kr\\co\\bit\\dataFile.TXT");
			dos = new DataOutputStream(fos);
			dis = new DataInputStream(fis);
			
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("datastreamTest");
			System.out.println(dis.readUnsignedShort());
			dis.skip(1);
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
