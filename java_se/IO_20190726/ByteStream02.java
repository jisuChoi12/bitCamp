import java.io.*;

class ByteStream02 {
	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int size = (int)file.length();

		byte[] b = new byte[size];
		bis.read(b,0,size);
		System.out.println(new String(b));
		bis.close();
	}
}
