import java.io.*;
import java.net.*;

class URLTest02 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.chanel.com/ko_KR/watches-jewelry/fine-jewelry/c/rings/J001000?show=All");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		int count = 0;
		String line = null;
		String sub = "18K";
		int index = 0;
		
		while ((line = br.readLine()) != null) {
			while (true) {
				index = line.toLowerCase().indexOf(sub.toLowerCase(), index);
				if (index != -1) {
					count++;
					index += sub.length();
				} else {
					break;
				}
			}
		}
		System.out.println("18K의 개수 : " + count + "개"); // 82개
	}
}