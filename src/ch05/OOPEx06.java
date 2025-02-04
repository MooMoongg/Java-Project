package ch05;

class 프로토스유닛 {
	String name ="프로토스유닛";
	void 기본공격(프로토스유닛 e1) { //무효화됨
	}
	
	String 이름확인() { //무효화됨
		return "?";
	}
}

class 질럿 extends 프로토스유닛{
	String name = "질럿";
	
	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이 " + e1.이름확인() + " 공격하기");
	}
	//오버라이드, 부모의 메서드를 무효화하다.
	String 이름확인() {
		return name;
	}
}

class 드라군 extends 프로토스유닛{
	String name = "드라군";

	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이 " + e1.이름확인() + " 공격하기");
	}
	//오버라이드, 부모의 메서드를 무효화하다.
	String 이름확인() {
		return name;
	}

}

class 다크템플러 extends 프로토스유닛{
	String name = "다크템플러";
	
	void 기본공격(프로토스유닛 e1) {  
		System.out.println(this.name+"이 " + e1.이름확인() + " 공격하기");
	}
	//오버라이드, 부모의 메서드를 무효화하다.
	String 이름확인() {
		return name;
	}
}

//신입한테 리버라는 유닛을 만들어(오버라이드해서 만들어)
//팀장 -> name이라는 변수하나 만들어 - 리버
//    -> 프로토스유닛으로 상속(공격 메서드, 이름을 확인하는 메서드가 필요해)
//    -> 누구를 공격하라는 거죠? -> 프로토스유닛
//    -> 테스트해봐 -> 질럿으로 리버를 한번 공격해봐
//    -> 팀장님 ? 가 뜨는데요?
//    -> 아 그거 메서드 이름 뭐라고 적었어? 이름확인으로 해야지
class 리버 extends 프로토스유닛{
	String name = "리버";
	
	void 기본공격(프로토스유닛 e1) {  
		System.out.println(this.name+"이 " + e1.이름확인() + " 공격하기");
	}
	//오버라이드, 부모의 메서드를 무효화하다.
	String 이름확인() {
		return name;
	}
}


public class OOPEx06 {

	public static void main(String[] args) {
		프로토스유닛 u1 = new 질럿(); // new 를 하게되면 질럿과 프로토스유닛 2가지가 메모리에 뜬다.
		프로토스유닛 u2 = new 드라군();
		프로토스유닛 u3 = new 다크템플러();
		프로토스유닛 u4 = new 리버();
		
		u1.기본공격(u2);
		u2.기본공격(u3);
		u3.기본공격(u4);
		u4.기본공격(u1);
	}

}
