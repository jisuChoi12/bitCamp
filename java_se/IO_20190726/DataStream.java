import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataStream {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		dos.writeUTF("aaa");
		dos.writeInt(25);
		dos.writeDouble(25.5);
		dos.close();
	}
}

// 부모 = 자식
// Object = Integer
// Object = String

// Object
// ↑
// Throwable 
// ↑
// Exception (예외처리 최상위 클래스)
// ↑
// IOException
// ↑
// FileNotFoundException
