package if_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		if(num>10) {
			System.out.println("1종속문장 실행");
		System.out.println("2종속문장 실행");
		System.out.println("3종속문장 실행");
		}	//종속문장이 1개 일때 {} 생략 가능
		
		System.out.println("댜음 문장");

	}

}
