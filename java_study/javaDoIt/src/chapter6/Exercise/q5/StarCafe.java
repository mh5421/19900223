package chapter6.Exercise.q5;

public class StarCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.StarAmericano) {
			return "���ٹ� �Ƹ޸�ī�� ����";
		}else if(money == Menu.StarLatte){
			return "���ٹ� �� ����";
		}else {
			return null;
		}
	}
	
}
