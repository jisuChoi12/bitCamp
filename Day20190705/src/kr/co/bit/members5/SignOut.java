package kr.co.bit.members5;

public class SignOut extends Members {
	public void signOutProcess() { //�α׾ƿ�
		if (MembersMain.session == null) {
			System.out.println("�α������� �ƴմϴ�.");
//			continue;
		}
		MembersMain.session = null;
		System.out.println("�α׾ƿ��Ǿ����ϴ�");
	} //�α׾ƿ�
}
