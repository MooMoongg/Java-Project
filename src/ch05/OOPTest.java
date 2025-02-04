package ch05;

// 접근 제어자 = 디폴트 접근제어자, public, private
class Player1{
	String name; // 이름
	private int thirty; // 목마름 0~100, 외부 클래스에서 접근 불가능
	
	public Player1(String name, int thirty) {
	this.name = name;
	this.thirty = thirty;
}

	void 물마시기() { //값을 변경할 수 있지만 thirty에는 접근할 수 없다.
		System.out.println("물마시기 행위");
		this.thirty = this.thirty-50; //물 마실 때마다 갈증수치 50씩 감소
	}

	int 목마름상태확인() {
		return this.thirty;
	}
}

public class OOPTest {

	public static void main(String[] args) {
		Player1 p1 = new Player1("홍길동", 100);
		System.out.println("이름 : "+p1.name);
		System.out.println("갈증지수 : "+p1.목마름상태확인());
		
		p1.물마시기();
		System.out.println("갈증지수 : "+p1.목마름상태확인());

	}
}
