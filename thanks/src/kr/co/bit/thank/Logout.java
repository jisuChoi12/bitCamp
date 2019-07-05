package kr.co.bit.thank;

public class Logout implements Process {

	@Override
	public void process() {
		if (Member.session != null) {
			System.out.println("로그아웃 되었습니다.");
			Member.session = null;
		} else {
			System.out.println("로그인 먼저 하세요.");
		}
	}
}
