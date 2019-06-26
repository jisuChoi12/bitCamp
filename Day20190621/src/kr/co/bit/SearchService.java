package kr.co.bit;

public class SearchService {
	private Member[] members;
	public SearchService() {
		members = new Member[5];
		members[0]=new Member("ä�ȼ�",175,76,"���ѹα�");
		members[1]=new Member("����ȭ",174,75,"���ѹα�");
		members[2]=new Member("������",168,60,"���ѹα�");
		members[3]=new Member("�迬��",160,56,"���ѹα�");
		members[4]=new Member("�ɱ���",171,68,"���ѹα�");
	}
	public boolean searchMember(String name) {
		boolean searchResult=false;
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult=true;
			}
		}return searchResult;
	}
	private void printInfo(Member member) {
		System.out.println(member.getName()+"(��)�� ã�� ���");
		System.out.println("�̸�:"+member.getName());
		System.out.println("����:"+member.getHeight());
		System.out.println("������:"+member.getWeight());
		System.out.println("����:"+member.getNation());
	}
}
