package ch05;

//그냥 요리사
class 요리사{
	String name = "요리사";
}

//홍길동은 홍길동이기도 하고 요리사
class 홍길동 extends 요리사{
	String name = "홍길동";
}

public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new 홍길동(); //홍길동과 요리사가 메모리에 같이 떠있다.
		System.out.println(h1.name);
		
		요리사 y1 = new 홍길동();
		System.out.println(y1.name);
	}

}
