package if_else_if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		System.out.println("===== Quiz 1 =====");
		int num, mon;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 갯수 입력 : ");
		num = sc.nextInt();
		
		if(num>10) {
			mon = (num-10)*1500+10*2000;
		}else {
			mon = num * 2000;
		}
		System.out.println("총 금액은 "+ mon+"원 입니다.");
		
		System.out.println("===== Quiz 2 =====");
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		if(num == 0)
			System.out.println("0을 제외한 수를 입력해주세요");
		else if(num % 3 ==0 && num %4 ==0)
			System.out.println("3의 배수이면서 4의 배수입니다.");
		else if(num%3 == 0)
			System.out.println("3의 배수입니다.");
		else if(num%4 == 0)
			System.out.println("4의 배수입니다.");
		else
			System.out.println("3의 배수와 4의 배수에 해당 안됨");
	
	}

}
