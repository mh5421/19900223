package chapter6.Exercise.q5;

public class KongCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.KongAmericano) {
			return "콩다방 아메리카노 구입";
		}else if(money == Menu.KongLatte) {
			return "콩다방 라떼 구입";
		}else {
			return null;
		}
	}

}
