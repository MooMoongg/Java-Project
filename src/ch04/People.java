package ch04;

public class People {
	String name;
	int age;
	
	//지금 이 코드에는 디폴트생성자가 있을까? 없을까?
	//내가 직접 생성자를 정의하였기 때문에 디폴트 생성자 없음
	public People(String name, int age) {
		System.out.println("People 메서드 스택 name : "+name);
		System.out.println("People 메서드 스택 age : "+age);
		this.name = name;
		this.age = age;
	}
	
}
