class PersonDTO implements Comparable<PersonDTO> { // Comparable / Comparator �������̽�
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
		return "�̸�: "+name+" ����: "+age;
	}

	@Override
	public int compareTo(PersonDTO o){ // ��ü�� �����ϴµ� �ʿ��� �޼ҵ�
		
		/*
		// ��������
		// �񱳴���ڰ� �� ũ��(<) -1, ���ٸ�(==) 0, ������(>) 1�� ��ȯ
		if(this.age < o.age){ return -1; }
		else if(this.age > o.age){ return 1; }
		else return 0;
		*/
		
		// ��������
		if(this.age < o.age){ return 1; }
		else if(this.age > o.age){ return -1; }
		else return 0;
	}
}
