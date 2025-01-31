package ch03;

public class CoinExample {

	public static void main(String[] args) {
		// 문제 : 최소동전 구하기, 500원짜리, 100원짜리, 50원짜리, 10원짜리가 얼마나 남았는지
		int money = 2680;
		int restMoney = money;
		
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0; //java 변수를 적을때 10count처럼 숫자가 앞에오면 에러가남
		
		//step1.
		count500 = restMoney/500;
		System.out.println("500원 짜리 = "+(restMoney/500)+"개");
		restMoney = restMoney%500;
		System.out.println("남은금액 : "+restMoney+"원");
		
		//step2.
		count100 = restMoney/100;
		System.out.println("100원 짜리 = "+(restMoney/100)+"개");
		restMoney = restMoney%100;
		System.out.println("남은금액 : "+restMoney+"원");
		
		//step3.
		count50 = restMoney/50;
		System.out.println("50원 짜리 = "+(restMoney/50)+"개");
		restMoney = restMoney%50;
		System.out.println("남은금액 : "+restMoney+"원");
		
		//step4
		count10 = restMoney/10;
		System.out.println("10원 짜리 = "+restMoney/10+"개");
		restMoney = restMoney%10;
		System.out.println("남은금액 : "+restMoney+"원");
		
		//마무리
		System.out.println("=====================");
		System.out.println(money+"의 최소동전 개수는?");
		System.out.println("500원 : "+count500+"개");
		System.out.println("100원 : "+count100+"개");
		System.out.println("50원 : "+count50+"개");
		System.out.println("10원 : "+count10+"개");
	}

}
