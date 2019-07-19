class PersonDTO implements Comparable<PersonDTO> { // Comparable / Comparator 인터페이스
	private String name;
	private int age;

	public PersonDTO(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	@Override
	public String toString(){
		return "이름: "+name+" 나이: "+age;
	}

	@Override
	public int compareTo(PersonDTO o){ // 객체을 정렬하는데 필요한 메소드
		
		/*
		// 오름차순
		// 비교대상자가 더 크면(<) -1, 같다면(==) 0, 작으면(>) 1을 반환
		if(this.age < o.age){ return -1; }
		else if(this.age > o.age){ return 1; }
		else return 0;
		*/
		
		// 내림차순
		if(this.age < o.age){ return 1; }
		else if(this.age > o.age){ return -1; }
		else return 0;
	}
}
