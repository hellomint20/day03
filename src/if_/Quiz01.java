package if_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		System.out.println("===== Quiz 1 ====");
		
		int n1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		n1 = sc.nextInt();
		if(n1 % 3 == 0)
			System.out.println(n1 + "는 3의 배수 입니다.");
		if(n1 % 3 != 0)
			System.out.println(n1 + "는 3의 배수가 아닙니다.");
		
		System.out.println("===== Quiz 2 ====");
		int n2, n3, max=0;
		System.out.print("세 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1>n2)
			max = n1;
		if(n2>n1)
			max = n2;
		if(n3>max)
			max = n3;
		System.out.println(max+"가 제일 큰 수 입니다.");
		/* if(n1 > n2 && n1 > n3) {
	      System.out.println( n1 );
	   }
	   if( n2 > n1 && n2 > n3) {
	      System.out.println( n2 );
	   }
	   if( n3 > n1 && n3 > n2) {
	      System.out.println( n3 );
	   }*/
		
		System.out.println("===== Quiz 3 ====");
		System.out.print("두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1>n2 && n1%2==0) 
				System.out.println(n1+"는 큰 수이며 짝수 입니다.");
		
		if(n2>n1 && n2%2==0) 
				System.out.println(n2+"는 큰 수이며 짝수 입니다.");
	}

}
