package ch04;

public class Cat {
	String name;
	String color;
	
	//Cat() 생성자를 디폴트 생성자(기본 생성자)라고 한다.
	//개발자가 적지 않아도 있는것!(생략가능한 코드)
	//내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
	public Cat() {
	}
	
	//개발자가 직접 생성자 구현하면 디폴트 생성자(기본 생성자)가 생기지 않음
	public Cat(String n, String c) {//생성자(메서드)
		System.out.println("고양이가 탄생함");
		System.out.println("n : " + n);
		System.out.println("c : " + c);
		
		
		//String n, String c는 지역변수 = Cat()이라는 생성자(메서드의 일종)가 가진 지역변수
		name = n;
		color = c;
	}
}
