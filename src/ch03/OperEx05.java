package ch03;

public class OperEx05 {

	public static void main(String[] args) {
		// 삼항연산자 = 조건연산자
		int n1 = 5;
		
		// 조건(비교연산자) ? true : false
		System.out.println(n1 == 5 ? "5가 맞습니다." : "5가 아닙니다.");

		int point = 59;
		System.out.println(point >= 60 ? "시험을 통과했습니다." : "내년에 재수강하여야합니다.");
		
		String result = point >= 60 ? "시험을 통과하였습니다." : "내년에 재수강해야합니다.";
		System.out.println(result);
		
		boolean result2 = 1==1;
		System.out.println("결과 : "+result2);
		
		int result3 = point < 60 ? 0 : 1;
		System.out.println("결과 : "+result3); //이 때 result3의 타입은 String이되면 에러가뜸, int가 와야함
	}

	
	
}



