package kr.co.bit.members8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;


public class MembersMain {
	public static String session;
	public static int tryCount;
	
	static {
		session=null;
		tryCount=0;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		SignUp signUp = new SignUp();
		SignIn signIn = new SignIn();
		SignOut signOut = new SignOut();
		List list = new List();
		Search search = new Search();
		Delete delete = new Delete();
		Update update = new Update();
		
		Poly poly = new Poly();
		
		while (true) { //�ݺ���
			try {
				Members.getConnection();
				System.out.println("R:ȸ������ L:ȸ����� S:ȸ��ã�� D:ȸ��Ż�� E:ȸ������ I:�α��� O:�α׾ƿ�");
				String protocol = br.readLine();
				
				if (protocol.equals("R") || protocol.equals("r")) { //ȸ������
					poly.process(signUp);
				} //ȸ������
				else if (protocol.equals("L") || protocol.equals("l")) { //ȸ�����
					poly.process(list);
				} //ȸ�����
				else if (protocol.equals("S") || protocol.equals("s")) { //ȸ��ã��
					poly.process(search);
				} //ȸ��ã��
				else if (protocol.equals("D") || protocol.equals("d")) { //ȸ��Ż��
					poly.process(delete);
				} //ȸ��Ż��
				else if (protocol.equals("E") || protocol.equals("e")) { //ȸ����������
					poly.process(update);
				} //ȸ����������
				else if (protocol.equals("I") || protocol.equals("i")) { //�α���
					poly.process(signIn);
				} //�α���
				else if (protocol.equals("O") || protocol.equals("o")) { //�α׾ƿ�
					poly.process(signOut);
				} //�α׾ƿ�
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //�ݺ���
	}
}
