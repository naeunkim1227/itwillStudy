public class Test35 {

	public static void main(String[] args) {
		//복습 연습문제1 : 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		//1. 총합을 저장할 sum 변수를 선언
		int sum =0;
		
		//2.for반복문을 이용하여 1부터 20까지 반복
		for(int i=1;i<=20;i++) {
			//i가 2 또는 3의 배수가 아닐때만 sum변수에 i변수에 저장된 값 누적
			if(i%2 !=0 && i%3 != 0) {
				sum += i;
			}
		}
		//3. sum변수에 저장된 값 출력
		System.out.println(sum);
		
		//출력결과
		//73
		
		
		System.out.println("-------------------------------------------------");
		
		//복습 연습문제2 :  두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
		//힌트) for반복문을 중첩해서 1~6까지 반복하면서 두 값의 합이 6인경우 화면에 출력
		// 출력결과 
		// 1+5 = 6
		// 2+4 = 6
		// 3+3 = 6
		// 4+2 = 6
		// 5+1 = 6
		
		
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
					if(i+j==6) {
						System.out.println(i +" + "+ j + " = " + (i+j));
						}
				}
		}
	
		
		System.out.println("--------------------------------------------------------");
		
		//복습 연습문제3 : 방정식 2x + 4y = 10의 모든 해를 구하시오.
		//단 x,y는 정수이고 각각의 범위는 (0<=x<=10, 0<=y<=10) 이다
		//실행결과 
//		x = 1, y = 2
//		x = 3, y = 1
//		x = 5, y = 0
		// 힌트 for반복문을 중첩해서 0부터 10까지 1씩 증가시켜가면서 돌린다.
		// 반복과정에서 방정식 2x+4y = 10을 만족시키는 경우에만 x와 y의 값을 출력하면 된다.
		
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x)+(4*y) == 10){
					System.out.println("x = "+x+", y = "+y);
					
				}
			}
			
		}
		
		
		
		
		
		
		
		
		

	}//main

}//class