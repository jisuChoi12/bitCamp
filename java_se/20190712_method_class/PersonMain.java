class Person {
	//String name;
	private String name;
	private int age;

	//����
	public void setAge(int a){
		age = a;
	}

	public void setName(String n){ 
		name = n;
	}

	public void setData(){} // �����ε�

	public void setData(String n, int a){ // �����ε�
		name = n;
		age = a;
	}
	
	public int getAge(){
		return age;
	}

	public String getName(){
		return name;
	}
}
//-------------------------------------------------------------------------------------
class PersonMain{
	public static void main(String[] args){
		Person aa = new Person(); //��ü aa�� Ŭ���� Person�� �������� ������ �ִ�
		System.out.println("��ü aa = "+aa); // Person@7852e922
		System.out.println("��ü aa = "+aa.toString()); // toString()�� Object�� ���� �޼ҵ� (16����)
		System.out.println("��ü aa = "+aa.hashCode()); // Object�Ҽ� (10����)

		//aa.name = "����"; 
		//System.out.println("�̸�: "+aa.name); 

		//ȣ��
		aa.setName("����");
		System.out.println("�̸�: "+aa.getName());
		aa.setAge(25);
		System.out.println("����: "+aa.getAge());
		System.out.println();

		//------------------------------------------------------------------------------
		Person bb = new Person(); //��ü bb�� Ŭ���� Person�� �������� ������ �ִ�.
		System.out.println("��ü bb = "+bb); // Person@4e25154f
		bb.setName("������");
		System.out.println("�̸�: "+bb.getName());
		bb.setAge(28);
		System.out.println("����: "+bb.getAge());
		System.out.println();

		//------------------------------------------------------------------------------
		Person cc = new Person();
		cc.setData("������",32);
		System.out.println("�̸�: "+cc.getName());
		System.out.println("����: "+cc.getAge());
		System.out.println();
		
		//------------------------------------------------------------------------------
		Person dd = new Person();
		cc.setData();
		System.out.println("�̸�: "+cc.getName());
		System.out.println("����: "+cc.getAge());
		System.out.println();

	}
}



// PersonMain.java
// PersonMain.class //Ŭ���� ������ Ŭ������ �ϳ���
// Person.class

//int aa; // ������ ����
//double aa; // �Ǽ��� ����
//Person aa; // ��ü

//int[] ar; // ������ �迭
//Person[] ar // ��ü �迭