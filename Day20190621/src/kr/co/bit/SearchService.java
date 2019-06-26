package kr.co.bit;

public class SearchService {
	private Member[] members;
	public SearchService() {
		members = new Member[5];
		members[0]=new Member("채안석",175,76,"대한민국");
		members[1]=new Member("전승화",174,75,"대한민국");
		members[2]=new Member("정유미",168,60,"대한민국");
		members[3]=new Member("김연우",160,56,"대한민국");
		members[4]=new Member("심규혁",171,68,"대한민국");
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
		System.out.println(member.getName()+"(으)로 찾은 결과");
		System.out.println("이름:"+member.getName());
		System.out.println("신장:"+member.getHeight());
		System.out.println("몸무게:"+member.getWeight());
		System.out.println("국가:"+member.getNation());
	}
}
