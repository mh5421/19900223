package chapter6.test;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "James";
		person.age = 40;
		person.isMariied = true;
		person.kids = 3;
		
		System.out.println("�� ����� ���� : " + person.age);
		System.out.println("�� ����� �̸� : " + person.name);
		System.out.println("�� ����� ��ȥ ���� : " + person.isMariied);
		System.out.println("�� ����� �ڳ� �� : " + person.kids);
	}
	
	
}
