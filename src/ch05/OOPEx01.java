package ch05;

// 접근제어자 = 디폴트 접근제어자, public, private
class Player {
	String name; // 이름
	private int thirty; // 목마름(0~100) // 외부 클래스에서 접근 불가능
	
	public Player(String name, int thirty) {
	this.name = name;
	this.thirty = thirty;
	}
	
	void 물마시기() { // 행위 = 메서드 = 값을 변경, 값을 변경할 수 있지만 thirty에 접근을 못함(private)
		System.out.println("물마시기 행위");
		this.thirty = this.thirty-50; //물을 마실 때마다 갈증지수 50씩 감소
	}
	
	int 목마름상태확인() {
		return this.thirty;
	}
	
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름 : "+p1.name);
		System.out.println("갈증지수 : "+p1.목마름상태확인());
		
		// 3. 세번째 시나리오
		p1.물마시기(); //실수할 수 가 없음
		System.out.println("갈증지수 : "+p1.목마름상태확인());
	}

}
