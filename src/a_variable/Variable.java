package a_variable;

public class Variable {
	
	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 ★기본형★ 데이터의 종류 >>
		 * - 정수 : byte, short, int, long <- 각각 표현할 수 있는 크기가 다름 (소숫점이 없는숫자)
		 * - 실수 : float, double (float 보단 double이 더 정확함) (소숫점이 있는숫자)
		 * - 문자 : char (문자 하나만 표현가능)
		 * - 논리 : boolean (true, false로 표현 가능)
		 * 
		 * byte는 8개의 bit로 이루어져 있다.
		 * -데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 * 	그것의 이름이 무엇인지 알려줘야 한다. (구분하기 위해서)
		 * - *명명규칙은 자바의정석 25~26쪽 참조*
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte sjsj;
		char moonja;
		
		// 모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		boolean kk;
		char qlql;
		byte alal;
		short slsl;
		int gg;
		long tt;
		float mm;
		double gkgk;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		System.out.println(kk); 컴파일 에러발생(문법이 틀렸다)
		// 변수에 값을 저장하지 않으면 변수의 값을 참조(변수 안에있는값을 꺼내오는것)할 수 없다.
		
		// =(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		alal = 127; //타입에 맞는 값을 저장해야 한다. 127은 byte가 표현할 수 있는 최고 큰값.
		slsl = 30000;
		gg = 20;
		tt = 900L; // long 접미사 : L 을 붙여줘야만 long 타입이 됨.
		mm = 3.14f; //float 접미사 : f 을 붙여야만 float 붙이지 않으면 double 타입임
		gkgk = 3.14; // double 접미사 : d(생략가능, 보통 생략함)
		qlql = '가'; // 문자를 표현할 때는 항상 ''로 묶어야함, char은 문자 하나만 표현함
		kk = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(gg);
		// Ctrl + F11 : 프로그램 실행
		// F11 : 디버그 모드로 실행
		
		gg = 30; // 처음에 저장했던 20은 사라지고 30이라는 값이 int 안에 저장이 됨
		System.out.println(gg);
		gg = 30 + 40; // 오른쪽에 있는 모든 연산을 수행한 값을 int 안에 저장함
		System.out.println(gg);
		gg = slsl; // 오른쪽 변수(short)에 있는 값을 int 안에 저장함
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		alal = 100;
		slsl = alal;
		gg = 456456465;
		tt = 456L;
		mm = 85.44f;
		gkgk = 3.14;
		qlql = '바';
		kk = false;
		
		System.out.println(alal);
		System.out.println(slsl);
		System.out.println(gg);
		System.out.println(tt);
		System.out.println(mm);
		System.out.println(gkgk);
		System.out.println(qlql);
		System.out.println(kk);
		
		//★String★ : 여러개의 문자를 편리하게 사용하기 위한 클래스 (앞글자가 대문자)
		//문자열 : ""(큰따움표)로 감싸진 글자 ""로 묶여있는 것들은 무조건 문자열 (안에 글자가 있던지 없던지)
		// char 은 무조건 문자가 하나여야함.
		String _String = new String("abcd"); //abcd라는 문자열 저장
		System.out.println(_String);
		_String = "1234"; // 앞에 String과 뒤에 new String이 생략됨 (생략가능)
		System.out.println(_String);
		
		/*
		 * << 리터럴의 종류 >> 상수 : 변수지만 값이 변하지않음(바꿀 수 없음)
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0'(' ' 안에 숫자가있으면 그것은 문자임), ' ' (공백도문자)
		 * 문자열 : "가나다", "abc", "123", " ", ""
		 * 그외 : true, false, null (null은 값이 없다는 뜻 : 아무 값이없다)  
		 * 
		 * << 참조형 타입 >>
		 * - 8가지 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 직접 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 참조형 타입의 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
		//전역변수 : 메서드 밖에 선언되어있는것. ex) 맨위 public class밑에있는 int Variable;
		//지역변수 : 메서드 안에 선언되어있는것.
		
		alal = 0;
		slsl = 0;
		gg = 0;
		tt = 0L;
		mm = 0.0f;
		gkgk = 0.0;
		qlql = '\u0000'; // ' ' 유니코드 0
		kk = false;
		_String = null; // 참조형 타입의 기본값 : null
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		alal = 127;
		gg = 128;
		alal = (byte)gg; // int 타입을 byte 타입으로 바꿧음. 형변환 : 데이터 타입을 변환하는 것
		System.out.println(alal); // 128 -> -128 (오버플로우)
		// -128이라는 값이 나옴 byte는 127까지밖에 표현하지 못하는데 int값이 128이여서
		//가장 작은 값으로 돌아감.(+1만큼 돌아간것, int값이 129라면 결과값은 -127이 나옴)
		
		alal = -128;
		gg = -129;
		alal = (byte)gg;
		System.out.println(alal); // -129 -> +127 (언더플로우)
		// 표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
		
		//double 타입에서 int 타입으로 형변환해서 출력해주세요.
		gg = 8;
		gkgk = 6.89;
		gg = (int)gkgk;
		System.out.println(gg); // int는 소숫점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		gg = alal;
		tt = gg;
		gkgk = gg;
		gkgk = mm;
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER; = 10 (10이 최댓값이라는걸 알려줌)
		 * (변수 앞에 final을 붙이면 상수가 되는 것임.)
		 * (상수의 이름을 정할때는 모두 대문자로한다)
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; <- 컴파일 에러발생 (이미 10이라는 값이 상수로 정해져 있어서)
		
		
		
	}			
	

}
