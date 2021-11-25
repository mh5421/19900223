package chapter6.Exercise.q5;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStar(StarCafe starCafe, int money) {
		String message = starCafe.brewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "¥‘¿Ã " + money + "¿∏∑Œ " + message);
		}
		
	}
	
	public void buyKong(KongCafe kongCafe, int money) {
		String message = kongCafe.brewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "¥‘¿Ã " + money + "¿∏∑Œ " + message);
		}
	}
}
