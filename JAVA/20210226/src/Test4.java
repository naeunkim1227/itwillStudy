
public class Test4 {
	
	//자바 가상 머신이 자바코드를 처음으로 읽어 들이는 메소드 공간이다.
	//프로그램의 시작점
	public static void main(String[] args) {
		
		/*자동 형변환을 이용한 산술 연산시 주의사항*/
		
		short x = 10; 
		short y = 20;
		
		// x+y의 연산결과가 int형으로 자동 형변환 되기 때문에,
		//short z = x + y; // short형 변수에 저장 하려고 할때 컴파일 에러가 발생
		
		//해결책
		//;강제형변환을 통해 컴파일 에러 해결
		short v = (short)(x + y);
		System.out.println("v=" + v);
		
		/*int형보다 큰 데이터형을 이용하여 연산할 때의 예...*/
		short a =123;//2바이트 크기의 값(작은값)
		long b = 345;//8바이트 크기의 값(큰값)
		long c = a + b;//short형인 변수에 저장된 작은값 123이 
						//iong형인 변수에 저장된 큰값 345l의 타입으로 형변환되어 +연산하게됨
		System.out.println(c);
		//결론: 연산중에 int형보다 작은 데이터형은 int형으로 자동형변환되고
		//int형보다 큰 데이터형이 있을때는 short a는 큰데이터형(long)으로 자동형변환된다.
		
		
		/*상수:변수의 값을 변경하지 못하게 상수를 선언 할수 있다. */
			//1. final 키워드 사용
			//2. 상수명은 대문자로 작성
			//3. 상수메모리 만들기 문법) final 데이터형 상수명 = 저장할값;
		//변수선언
		int num;
		num = 10;
		num = 50;
		//상수선언
		final int NUM = 10; //상수 메모리 선언 후 10을 저장
		//NUM = 20; //상수 메모리에 값을 변경 하려 할때 에러가 발생함.
		
		
		
		
		
		
	}

}
