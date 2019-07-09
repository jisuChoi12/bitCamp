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
			while(true) { //while 반복몬
				System.out.println("==========메인==========");
				System.out.println("A.주문 B.결제 C.매출확인");
				String protocol = br.readLine();
				if(protocol.equalsIgnoreCase("A")) {
					System.out.println("==========메뉴==========");
					System.out.println("A.아메리카노 B.카푸치노 C.카페라떼 D.캐모마일 E.얼그레이");
					protocol = br.readLine();
					if(protocol.equalsIgnoreCase("A")){
						if(americanoStock==0) {
							System.out.println("아메리카노 재고가 없습니다");
						} else {
							System.out.println("남은 아메리카노 재고: "+americanoStock);
							System.out.println("몇잔 주문하시겠습니까?: ");
							americanoOrder = Integer.parseInt(br.readLine());
							americanoStock -= americanoOrder;
							americanoPrice *= americanoOrder;
							totalPrice += americanoPrice; 
//							System.out.println("아메리카노 "+AmericanoOrder+"잔 주문하셨습니다");
//							System.out.println("결제해야할 금액은 "+AmericanoPrice+"원 입니다");
						}
					}else if(protocol.equalsIgnoreCase("B")) {
						if(cappuccinoStock==0) {
							System.out.println("카푸치노 재고가 없습니다");
						} else {
							System.out.println("남은 카푸치노 재고: "+cappuccinoStock);
							System.out.println("몇잔 주문하시겠습니까?");
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
					System.out.println("==========결제==========");
					System.out.println("아메리카노: "+americanoOrder);
					System.out.println("카푸치노: "+cappuccinoOrder);
					System.out.println("총 결제 금액: "+totalPrice);
					sales +=totalPrice;
					totalPrice=0;
				}
				else if(protocol.equalsIgnoreCase("C")) {
					System.out.println("==========매출확인==========");
					System.out.println("총 매출: "+sales);
				}
			} //while 반복문
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
