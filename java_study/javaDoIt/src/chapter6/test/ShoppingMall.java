package chapter6.test;

public class ShoppingMall {
	public static void main(String[] args) {
		ShopInfo shopInfo = new ShopInfo();
		
		shopInfo.orderNum = 201803120001L;
		shopInfo.orderId = "abc123";
		shopInfo.orderDay = "2018�� 3�� 12��";
		shopInfo.orderName = "ȫ���";
		shopInfo.productNum = "PD0345-12";
		shopInfo.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+shopInfo.orderNum);
		System.out.println("�ֹ��� ���̵� : "+shopInfo.orderId);
		System.out.println("�ֹ� ��¥ : "+shopInfo.orderDay);
		System.out.println("�ֹ��� �̸� : "+shopInfo.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+shopInfo.productNum);
		System.out.println("��� �ּ� : "+shopInfo.address);
	}

}
