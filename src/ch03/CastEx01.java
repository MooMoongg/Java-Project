package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		//캐스팅 (다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte 
		double d1 = n1; // 8Byte  
		//8바이트 공간에 100을 넣으면 8바이트 공간에 4바이트를 넣은것과 같음
		System.out.println(d1); //출력하면 100.0이 나옴, 이것을 업캐스팅이라고 함
		//작은것을 큰쪽으로 넣은것. 이런 업캐스팅은 묵시적으로 일어남
		
		double d2 = 100.8;
		// 명시적 형변환 (int), 큰 것을 작은것에 넣었으니까 이건 다운캐스팅이라고 부름
		int n2 = (int)d2; // double을 int로 변환할 수 없어요
		System.out.println(n2); // 단점 : 데이터가 유실될 수 있다.(큰것을 작은것에 구겨넣다보니까)
		
		int money = 130;
		System.out.println(130/100); // int 와 int 를 나눈 것이기 때문에 1 이나옴
		System.out.println(money/100);
		System.out.println(money/100.0); //int 나누기 double을 하면 double이 나옴
		
	}

}
