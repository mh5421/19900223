package generic_example01;
//���׸� ����


class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person<T, S>{
	public T info;
	public S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
}

public class generic_exam {
	public static void main(String[] args) {
		//���׸������� �⺻ ������Ÿ���� ���ڷ� ����� �� �����Ƿ� wrapper Ŭ������ ���� �⺻���ڸ� ����ϴ� ����� ä���Ѵ�.
		//ex) int -> Integer, double -> Double
		Integer id = new Integer(1);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id);
		System.out.println(p1.id.intValue());
	}
}
