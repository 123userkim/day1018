package com.sist.exam08;

class Person{
	public String name = "ȫ�浿";
	public static final String addr = "����� ������ ������";
	
	// �ٲ����� ���ϴ� final�� ���� ��ü���� ���� �޸𸮸� Ȯ���� �ʿ䰡 ����.
	// �׷��� final�ɹ��� static���� ����°��� ���ڴ�!
	
	// final�� static���� ������! 		 O
	// static�� final�� ������!		 X
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Person.addr);
		
		Person father = new Person();
		Person son = new Person();
		
		father.name = "ȫ�浿";
		son.name = "ȫ�ν�";
		
		System.out.println(father.name + ","+  father.addr);
		System.out.println(son.name + ","+ son.addr);
		
		//father.addr = "���ֵ� �������� �ֿ���";
		
	}

}