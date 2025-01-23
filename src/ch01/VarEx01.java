package ch01;

public class VarEx01 {

	public static void main(String[] args) {
		boolean b1 = true;  //true는 박스에 1일이 저장됨
		boolean b2 = false; //false 는 0이 저장
		
		int n1 = 1000;   //나 메모리에 4Byte의 공간이 필요해
		double d1= 1000.1; //나 메모리에 8Byte의 공간이 필요해
		
		char c1 = '가'; 
		
		  System.out.println(c1);
		  System.out.println(n1);
		
		n1 = 50;
		System.out.println(n1);
	}

}
