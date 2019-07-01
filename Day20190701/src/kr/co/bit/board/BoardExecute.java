package kr.co.bit.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BoardExecute {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> boardList = new ArrayList<HashMap<String,String>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			while(true) {//�ݺ���
				System.out.println("====�Խ����ۼ�====");
				System.out.println("R:��� S:�˻� D:���� U:���� L:���");
				String protocol = br.readLine();
				if(protocol.equals("R") || protocol.equals("r")) {//���
					HashMap<String, String> hashMap = new HashMap<String, String>();
					System.out.println("����|����");
					String titleContent = br.readLine();
					int indexI = titleContent.indexOf("|");
					String title = titleContent.substring(0,indexI);
					String content = titleContent.substring(indexI+1);
					if(title==null || title=="") {
						System.out.println("������ �Է����ּ���.");
					}
					if(content==null || content=="") {
						System.out.println("������ �Է����ּ���.");
					}
					hashMap.put("title", title);
					hashMap.put("content", content);
					hashMap.put("author", "������");
					hashMap.put("nal", "20190701");
					hashMap.put("readCount", "0");
					boardList.add(hashMap);
					System.out.println("�Խñ��� ��ϵǾ����ϴ�.");
				}//���
				else if(protocol.equals("S") || protocol.equals("s")) {//�˻�
					HashMap<String, String> hashMap = new HashMap<String, String>();
					System.out.println("====ã��====");
					System.out.println("ã�� �Խñ� �����Է�");
					String titleSearch = br.readLine();
					System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
					for(int i=0; i<boardList.size(); i++) {
						hashMap = boardList.get(i);
						if(titleSearch.equals(hashMap.get("title"))) {
							System.out.print(hashMap.get("title")+"\t");
							System.out.print(hashMap.get("content")+"\t");
							System.out.print(hashMap.get("author")+"\t");
							System.out.print(hashMap.get("nal")+"\t");
							System.out.print(hashMap.get("readCount")+"\n");
						}
					}
				}//�˻�
				else if(protocol.equals("D") || protocol.equals("d")) {//����
					HashMap<String, String> hashMap = new HashMap<String, String>();
					System.out.println("====����====");
					System.out.println("���� �� �Խñ� ���� �Է�");
					String titleDelete = br.readLine();
					for(int i=0; i<boardList.size(); i++) {
						hashMap = boardList.get(i);
						if(titleDelete.equals(hashMap.get("title"))) {
							boardList.remove(i);
							System.out.println("�ش� �Խñ��� �����Ǿ����ϴ�.");
						}
					}
				}//����
				else if(protocol.equals("U") || protocol.equals("u")) {//����
					HashMap<String, String> hashMap = new HashMap<String, String>();
					System.out.println("====����====");
					System.out.println("���� �� �Խñ� ���� �Է� ");
					String titleSearch = br.readLine();
					for(int i=0; i<boardList.size(); i++) {
						hashMap = boardList.get(i);
						if(titleSearch.equals(hashMap.get("title"))) {
							System.out.println("���� �� ���� �Դϴ�.");
							System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
							System.out.print(hashMap.get("title")+"\t");
							System.out.print(hashMap.get("content")+"\t");
							System.out.print(hashMap.get("author")+"\t");
							System.out.print(hashMap.get("nal")+"\t");
							System.out.print(hashMap.get("readCount")+"\n");
						}
						System.out.println("�ش� �Խñ��� �˻��Ǿ����ϴ�.");
						System.out.println("������ ����|���� �� �Է��ϼ���.");
						String titleContent = br.readLine();
						int indexI = titleContent.indexOf("|");
						String title = titleContent.substring(0,indexI);
						String content = titleContent.substring(indexI+1);
						hashMap.put("title", title);
						hashMap.put("content", content);
						boardList.set(i, hashMap);
					}
					System.out.println("�Խñ��� �����Ǿ����ϴ�.");
				}//����
				else if(protocol.equals("L") || protocol.equals("l")) {//���
					HashMap<String, String> hashMap = new HashMap<String, String>();
					System.out.println("====��ü���====");
					System.out.print("����\t����\t�ۼ���\t��¥\t\t��ȸ��\n");
					for(int i=0; i<boardList.size(); i++) {
						hashMap = boardList.get(i);
						System.out.print(hashMap.get("title")+"\t");
						System.out.print(hashMap.get("content")+"\t");
						System.out.print(hashMap.get("author")+"\t");
						System.out.print(hashMap.get("nal")+"\t");
						System.out.print(hashMap.get("readCount")+"\n");
					}
				}//���
			}//�ݺ���
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
