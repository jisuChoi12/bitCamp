package kr.co.bit.members6;

public class SignOut extends Members {
	
	public boolean isLogin() {
		boolean login = true;
		if(Members.session==null) {
			login = false;
		}
		return login;
	}
	
	public void signOutProcess() { //�α׾ƿ�
		if(isLogin()) {
			MembersMain.session = null;
			System.out.println("�α׾ƿ��Ǿ����ϴ�");
		}
		else {
			System.out.println("�α������� �ƴմϴ�.");
		}	
	} //�α׾ƿ�
}
