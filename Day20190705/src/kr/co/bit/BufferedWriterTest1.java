package kr.co.bit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// bufferedWriter클래스에서 flush()메소드를 호출하지 않았을때 결과

public class BufferedWriterTest1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\bitcamp\\Documents\\GitHub\\bitcamp\\Day20190705\\src\\kr\\co\\bit\\bufferedWriter1.TXT", true);
			bw = new BufferedWriter(fw, 4);
			bw.write('A');		
			bw.write('B');		
			bw.write('C');		
			bw.write('D');
			bw.write('E');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

// 버퍼사이즈:n 
// 입력<n && close()호출O -> 출력O
// 입력<n && close()호출X -> 출력X
// 입력>=n && close()호출O -> 출력O
// 입력>=n && close()호출X -> 출력O

// flush 기능이 구현되어 있기 때문에 데이터틀이 최종적으로 대상으로 출력된다.
// 버퍼사이즈보다 데이터를 더 많이 출력하면 flush 하지 않아도 자동으로 flush처리가 되면서
// 출력스트림에 출력된 내용들이 대상으로 출력되지만 버퍼안에 버퍼사이즈를 초과하지 않는 데이터가
// 들어가 있으면 버퍼 안에 출력되어 있는 내용들이 자동 flush되지 않는다. -> close() 혹은 flush() 호출필요