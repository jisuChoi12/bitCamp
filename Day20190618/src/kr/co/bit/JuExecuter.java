package kr.co.bit;

public class JuExecuter {

	public static void main(String[] args) {
		System.out.println("주문하세요 y/n");
		char ju = 'y';
		if(ju=='y' || ju=='Y') {
			System.out.println("주문선택");
			System.out.println("메뉴: 1.자장면 2.짬뽕 3.탕수육");
			int menu=1;
			// switch안에 switch가 들어가면 복잡... 중첩은 피하기
			switch(menu) { 
			//switch(...) {} 이런식으로 바로 switch 안에 switch가 들어가면 복잡/중첩
			case 1:
				System.out.println("자장면 선택");
				System.out.println("자장면 곱배기 y/n");
				char gob='y';
				if(gob=='y' || gob=='Y') {
					System.out.println("자장면 곱배기 선택");
				}else {
					System.out.println("자장면 보통 선택");
				}
				break;
			case 2:
				System.out.println("짬뽕 선택");
				gob='y';
				if(gob=='y' || gob=='Y') {
					System.out.println("짬뽕 곱배기 선택");
				}else {
					System.out.println("짬뽕 보통 선택");
				}
				break;
			case 3: 
				System.out.println("탕수육 선택");
				System.out.println("사이즈: 1.대자 2.중자 3.소자");
				int tang=1;
				// case안에 switch가 들어간 경우는 중첩x
				switch(tang) {
				case 1:
					System.out.println("탕수육 대자 선택");
					break;
				case 2:
					System.out.println("탕수육 중자 선택");
					break;
				case 3:
					System.out.println("탕수육 소자 선택");
					break;
				default:
					System.out.println("123번 중에 선택하세요");
				}
				break;
			default:
				System.out.println("123번 중에 선택하세요");
			}
		}
		else {
			System.out.println("주문취소");
		}
	}
}
