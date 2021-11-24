package chapter6.test;

public class ShoppingMall {
	public static void main(String[] args) {
		ShopInfo shopInfo = new ShopInfo();
		
		shopInfo.orderNum = 201803120001L;
		shopInfo.orderId = "abc123";
		shopInfo.orderDay = "2018년 3월 12일";
		shopInfo.orderName = "홍길순";
		shopInfo.productNum = "PD0345-12";
		shopInfo.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+shopInfo.orderNum);
		System.out.println("주문자 아이디 : "+shopInfo.orderId);
		System.out.println("주문 날짜 : "+shopInfo.orderDay);
		System.out.println("주문자 이름 : "+shopInfo.orderName);
		System.out.println("주문 상품 번호 : "+shopInfo.productNum);
		System.out.println("배송 주소 : "+shopInfo.address);
	}

}
