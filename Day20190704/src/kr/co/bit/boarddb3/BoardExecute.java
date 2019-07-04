package kr.co.bit.boarddb3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class BoardExecute {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Register register = new Register();
		Delete delete = new Delete();
		Update update = new Update();
		Search search = new Search();
		List list = new List();
		BoardPoly boardPoly = new BoardPoly();
		
		while(true) {//�ݺ���
			try {
				Board.getConnection(); 
				
				System.out.println("====�Խ����ۼ�===="); 
				System.out.println("R:��� S:�˻� D:���� U:���� L:���"); 
				String protocol = br.readLine(); 
								
				if(protocol.equals("R") || protocol.equals("r")) {//���
					boardPoly.boardSql(register);
					register.boardProcess();
//					boardPoly.boardProcess(register);
					boardPoly.boardClose(register);
				}//���
				
				else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
					boardPoly.boardSql(search);
//					search.boardProcess();
					boardPoly.boardProcess(search);
					boardPoly.boardClose(search);
				}//�˻�
				
				else if(protocol.equals("D") || protocol.equals("d")) {//����
					boardPoly.boardSql(delete); //�Ű������� ������
//					delete.boardProcess(); // ��ü���� ȣ��
					boardPoly.boardProcess(delete);
					boardPoly.boardClose(delete);
				}//����
				
				else if(protocol.equals("U") || protocol.equals("u")) {//����								
					boardPoly.boardSql(update);									
//					update.boardProcess();
					boardPoly.boardProcess(update);
					boardPoly.boardClose(update);
				}//����
				
				else if(protocol.equals("L") || protocol.equals("l")) {//��ü���
					boardPoly.boardSql(list);
//					list.boardProcess();
					boardPoly.boardProcess(list);
					boardPoly.boardClose(list);
				}//��ü���
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//�ݺ���
	}
}
