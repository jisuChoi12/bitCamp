package kr.co.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class StoreMain {
	static int totalPrice;
	static int americanoStock;
	static int americanoPrice;
	static int americanoOrder;
	static int cappuccinoStock;
	static int cappuccinoPrice;
	static int cappuccinoOrder;
	static int sales;
	
	
	static {
		sales = 0;
		totalPrice = 0;
		americanoStock = 10;
		americanoPrice = 4000;
		americanoOrder = 0;
		cappuccinoStock = 10;
		cappuccinoPrice = 4500;
		cappuccinoOrder = 0;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) { //while �ݺ���
				System.out.println("==========����==========");
				System.out.println("A.�ֹ� B.���� C.����Ȯ��");
				String protocol = br.readLine();
				if(protocol.equalsIgnoreCase("A")) {
					System.out.println("==========�޴�==========");
					System.out.println("A.�Ƹ޸�ī�� B.īǪġ�� C.ī��� D.ĳ���� E.��׷���");
					protocol = br.readLine();
					if(protocol.equalsIgnoreCase("A")){
						if(americanoStock==0) {
							System.out.println("�Ƹ޸�ī�� ��� �����ϴ�");
						} else {
							System.out.println("���� �Ƹ޸�ī�� ���: "+americanoStock);
							System.out.println("���� �ֹ��Ͻðڽ��ϱ�?: ");
							americanoOrder = Integer.parseInt(br.readLine());
							americanoStock -= americanoOrder;
							americanoPrice *= americanoOrder;
							totalPrice += americanoPrice; 
//							System.out.println("�Ƹ޸�ī�� "+AmericanoOrder+"�� �ֹ��ϼ̽��ϴ�");
//							System.out.println("�����ؾ��� �ݾ��� "+AmericanoPrice+"�� �Դϴ�");
						}
					}else if(protocol.equalsIgnoreCase("B")) {
						if(cappuccinoStock==0) {
							System.out.println("īǪġ�� ��� �����ϴ�");
						} else {
							System.out.println("���� īǪġ�� ���: "+cappuccinoStock);
							System.out.println("���� �ֹ��Ͻðڽ��ϱ�?");
							cappuccinoOrder = Integer.parseInt(br.readLine());
							cappuccinoStock -= cappuccinoOrder;
							cappuccinoPrice *= cappuccinoOrder;
							totalPrice += cappuccinoPrice;
						}
					}else if(protocol.equalsIgnoreCase("C")) {
						
					}else if(protocol.equalsIgnoreCase("D")) {
						
					}else if(protocol.equalsIgnoreCase("E")) {
						
					}
					
			
				
				}else if(protocol.equalsIgnoreCase("B")){
					System.out.println("==========����==========");
					System.out.println("�Ƹ޸�ī��: "+americanoOrder);
					System.out.println("īǪġ��: "+cappuccinoOrder);
					System.out.println("�� ���� �ݾ�: "+totalPrice);
					sales +=totalPrice;
					totalPrice=0;
				}
				else if(protocol.equalsIgnoreCase("C")) {
					System.out.println("==========����Ȯ��==========");
					System.out.println("�� ����: "+sales);
				}
			} //while �ݺ���
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
