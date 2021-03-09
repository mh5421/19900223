package generic_example01;
//제네릭 예제


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
		//제네릭에서는 기본 데이터타입을 인자로 사용할 수 없으므로 wrapper 클래스를 통해 기본인자를 사용하는 방식을 채용한다.
		//ex) int -> Integer, double -> Double
		Integer id = new Integer(1);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id);
		System.out.println(p1.id.intValue());
	}
}
