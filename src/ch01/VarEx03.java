package ch01;

//MyVar은 (int 와 char를 가진)클래스 자료형이다. 
//= 개발자가 만드는 커스텀 자료형, 없는 자료형을 만들어내는것, 여러가지 데이터를 가지고 있는 클래스를 Beans라고 부른다.
class MyVar {
	static int n1 = 10;
	static char c1 = 'A';
}

class MyVar2 {
	static int n1 = 13;
	static char c1 = 'B';
}

public class VarEx03 {
	
	static int num = 500;
	
	public static void main(String[] args) {
	System.out.println(MyVar.n1);
	System.out.println(MyVar.c1);
	System.out.println(VarEx03.num);
	System.out.println(MyVar2.n1);
	System.out.println(MyVar2.c1);
	}
}