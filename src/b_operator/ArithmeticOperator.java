package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * << 산술 연산자 >>
		 *  + : 더하기
		 *  - : 빼기
		 *  * : 곱하기
		 *  / : 나누기
		 *  % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		System.out.println(a);
		//수학과 같이 *, /, % 연산자가 +, -보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
	  //   ↓강제형변환 ↓int ↓double (10+20.3)은 int+double 이라서 8byte인 double로 자동 형변환이됨 정수값을 얻기 위해서 (int)로 강제 형변환 시켜줌.
		a = (int)(10 + 20.3); //10은 int, 20.3은 double 타입. 타입이 다르면 연산을 수행할 수 없음. 작은쪽에서 큰쪽으로 형변환 하고싶을때, 형변환이 자동으로 됨.
							  //피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변환 후 연산이 수행된다.
						   	  //따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		System.out.println(a);
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);
		System.out.println(d);
		//int보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다.
		
		long e1 = 100000 * 100000;
		System.out.println(e1); //int의 표현범위를 벗어낫기 때문에 오버플로우 발생
		long e2 = 100000 * 100000L; //피연산자 중 하나는 long이어야 결과로 long을 얻을 수 있다.
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1); // 2.0 			접미사 f를 붙이지 않아서 소숫점이 나오지 않음.
		float f2 = 10 / 4f;
		System.out.println(f2); // 2.5
		int f3 = 10 % 4;
		System.out.println(f3); // 10을 4로 나눈 나머지 2
		
		//정수는 0으로 나눌 수 없다.
//		int g1 = 10 / 0;	// 런타임 에러 발생
		float g2 = 10.0f / 0;
		System.out.println(g2); //결과값 Infinity : 무한대
		float g3 = 0 / 0f;
		System.out.println(g3); // 결과값 NaN : Not a Number ( 숫자가 아니다 )
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A'; // 68 - 65
		System.out.println(h3);
		
		int h4 = '5' - '0'; // '5'에는 53 '0'에는 48이라는 숫자가 저장되어있음. 53 - 48 = 5
		System.out.println(h4);
		
		// 산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		
		i = i + 1;
		i += 1;		// i = i + 2;라면 i += 2; 로 표현가능
					// 복합 연산자
		// 더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; //전위형 : 변수가 참조되기 전 수행   		*전위형,후위형은 +,-에만 있다*
		i++; //후위형 : 변수가 참조된 후 수행
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		//반올림해서 출력해주세요.
		double round = 50.4;
		System.out.println((int)(round + 0.5));
		//소수점 둘째자리에서 반올림해주세요.
		round = 3.14;
		System.out.println((int)(round * 10 + 0.5) / 10d);
		
		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		double result = 123456 + 654321;
		result = result * 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//(평균은 소수점 둘째자리에서 반올림)
		
		int num1 = 80;
		int num2 = 55;  // 변수 선언과 초기화
		int num3 = 97;
		
		int sum = num1 + num2 +num3;
		double avg = (int)(sum / 3d * 10 + 0.5) / 10d;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
				

	}

}
