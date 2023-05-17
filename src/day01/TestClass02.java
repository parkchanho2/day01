package day01;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		 escape 문자
		 - 문자열 안에서 특수한 긴ㅇ을 수행
		 - \n : 엔터값과 비슷
		 - \t : 커서 tap키 만큼 오른쪽으로 이등
		 - \" : "하나표현
		 - \\ : \ 하나표현
		 
		 
		 * */
		
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("이름\t나이\t주소");
		System.out.println("==========================");
		System.out.println("홍길동\t20살\t산골짜기");
		
		System.out.println(11 + "\n"+ 22);
		
		System.out.println(" \\ \" ");
	}
}
