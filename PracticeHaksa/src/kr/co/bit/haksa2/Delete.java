package kr.co.bit.haksa2;

import java.util.HashMap;

public class Delete {
	private String gubunDelete;
	private String irumDelete;
	
	public Delete() {
		gubunDelete=null;
		irumDelete=null;
	}
	
	public void delete() {
		System.out.println("����");
		System.out.println("1.�л� 2.���� 3.������");
		gubunDelete = Register.input.next();
		System.out.println("������ ����� �̸��� �Է��� �ּ���.");
		System.out.println("�̸�: ");
		irumDelete = Register.input.next();
		
		for(int i=0; i<Register.haksaList.size(); i++) {
			HashMap<String, String> haksaHash = Register.haksaList.get(i);
			//�л�����
			if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("1")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("�л�:"+irumDelete+"�� �����Ǿ����ϴ�.");
				}
			}//�л�����
			//��������
			else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("2")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("����:"+irumDelete+"�� �����Ǿ����ϴ�.");	
				}
			}//��������
			//�����ڻ���
			else if(gubunDelete.equals(haksaHash.get("gubun")) && haksaHash.get("gubun").equals("3")) {
				if(irumDelete.equals(haksaHash.get("irum"))) {
					Register.haksaList.remove(i);
					System.out.println("������:"+irumDelete+"�� �����Ǿ����ϴ�.");							
				}
			}//�����ڻ���
		}
	}
}
