import java.net.*;
import java.io.*;

class URLTest{
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.naver.com/index.html");
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("ȣ��Ʈ : "+url.getHost());
		System.out.println("��Ʈ : "+url.getPort());
		System.out.println("�⺻ ��Ʈ : "+url.getDefaultPort());
		System.out.println("���� : "+url.getFile());

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
