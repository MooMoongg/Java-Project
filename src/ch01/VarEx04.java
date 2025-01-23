package ch01;

class Note1 {
	static int num = 1;
	static int time = 1015;
	static int price = 3000;
}

class Note2 {
	static int num = 2;
	static int time = 1020;
	static int price = 1000;
}
//Note가 100권이 필요하다면? 클래스 자료형을 100개를 만들어야함

public class VarEx04 {
	
	public static void main(String[] args) {
		System.out.println(Note1.num);
		System.out.println(Note1.time);
		System.out.println(Note1.price);
	}
}