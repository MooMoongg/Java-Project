package ch02;

public class StackEx01 {

	static void a() { //a 라는 메서드 하나 생성
		b();
		System.out.println("a2");
		System.out.println("a3");
		System.out.println("a4");
	}
	
	static void b() { //b 라는 메서드 하나 생성
		System.out.println("b1");
		System.out.println("b2");
		System.out.println("b3");
	}
	
	public static void main(String[] args) {
		System.out.println("m1");
		System.out.println("m2");
		StackEx01.a(); //함수를 호출
		System.out.println("m4");
		System.out.println("m5");
	}

}
