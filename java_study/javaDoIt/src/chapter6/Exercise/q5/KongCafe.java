package chapter6.Exercise.q5;

public class KongCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.KongAmericano) {
			return "��ٹ� �Ƹ޸�ī�� ����";
		}else if(money == Menu.KongLatte) {
			return "��ٹ� �� ����";
		}else {
			return null;
		}
	}

}
