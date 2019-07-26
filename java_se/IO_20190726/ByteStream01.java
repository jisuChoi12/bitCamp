import java.io.*;

class ByteStream01 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		while((data=bis.read())!=-1) {
			System.out.print(data); // 656667681310434542471310495051521310 ... 1310 = \r\n
			System.out.print((char)data);
		}
		bis.close();
	}
}