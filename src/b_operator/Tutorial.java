package b_operator;

public class Tutorial {

	public static void main(String[] args) {
		
		double sir = 33.2;
		System.out.println((int)(sir + 0.5)); // 소숫점 없애기
		
		double round = 34.65;
		System.out.println((int)(round * 10 + 0.5) /10d); //소숫점 첫째 자리까지만 출력하기
		
		double a = 77.58;
		System.out.println((int)(a * 10 + 0.5) /10d); //소숫점 첫째 자리까지만 출력하기
		
		round = 3.14;
		System.out.println((int)(round * 10 + 0.5) /10d); //소숫점 첫째 자리까지만 출력하기
		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
				//1. 123456 + 654321
				//2. 1번의 결과값 * 123456
				//3. 2번의 결과값 / 123456
				//4. 3번의 결과값 - 654321
				//5. 4번의 결과값 % 123456
		
		long result = 123456 +654321;
		result *= 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
				//(평균은 소수점 둘째자리에서 반올림)
		int num1 = 55;
		int num2 = 102;
		int num3 = 98;
		
		int sum = num1 + num2 + num3;
		double pg = (int)(sum / 3 * 10 + 0.5) / 10d;
		System.out.println("합계 : " + sum + " / 평균 " + pg);
		
		boolean e = 20 >= 5+16;
		System.out.println(e);
		e = 20 <= 20.0;
		System.out.println(e);
		
		e = 66 <= 'C';
		System.out.println(e);
		
		
	}

}
