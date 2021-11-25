package chapter6.Exercise.q5;

public class CoffeeTest {
	public static void main(String[] args) {
		Person kim = new Person("Kim", 10000);
		StarCafe starCafe = new StarCafe();
		KongCafe kongCafe = new KongCafe();
		
		kim.buyStar(starCafe, 4000);
		kim.buyKong(kongCafe, 4500);
	}
}
