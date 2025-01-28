package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		//캐스팅 (다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte 
		double d1 = n1; // 8Byte  
		//8바이트 공간에 100을 넣으면 8바이트 공간에 4바이트를 넣은것과 같음
		System.out.println(d1);
	}

}
