package ch02;

public class StackEx02 {

	static int sum = 20; //전역변수(static), main 메서드가 시작되기 전에 sum이 할당된다.
	int value = 50; //전역변수(heap) //더 이상 참조하지 않을 때 자동으로 사라진다.
	
	static void a() {
		//a메서드가 실행될 때 stack 공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라진다.
		int n1 = 1; // a 메서드의 stack영역에 저장됨, 이러한 것들을 지역변수라고 함 (stack)
		System.out.println(n1);
		
		//static int n2 = 2; //불가능, static 은 main 메서드가 실행되기 전에 할당되어야하는데 n2는 a메서드가 호출되어야 읽을 수 있기 때문
	}
	
	public static void main(String[] args) {
		a();
		//System.out.println(n1);
		System.out.println(sum);
		StackEx02 s = new StackEx02(); //18번 라인에서 heap공간에 value가 할당된다.
		System.out.println(s.value);
		System.out.println("test1 - 더 이상 s 변수를 참조하지 않기 때문에 메모리에서 사라진다.");
		System.out.println("test2");
	}
}
