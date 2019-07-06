package kr.co.bit.members6;

public class SignOut extends Members {
	
	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void signOutProcess() { //로그아웃
		if(isLogin()) {
			MembersMain.session = null;
			System.out.println("로그아웃되었습니다");
		}
		else {
			System.out.println("로그인중이 아닙니다.");
		}	
	} //로그아웃
}
